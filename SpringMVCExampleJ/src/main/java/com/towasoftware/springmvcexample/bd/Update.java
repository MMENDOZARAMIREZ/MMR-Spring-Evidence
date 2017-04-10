package com.towasoftware.springmvcexample.bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.towasoftware.springmvcexample.model.Cita;
import com.towasoftware.springmvcexample.model.Consultorio;
import com.towasoftware.springmvcexample.model.Departamento;
import com.towasoftware.springmvcexample.model.Especialidad;
import com.towasoftware.springmvcexample.model.Medico;
import com.towasoftware.springmvcexample.model.Paciente;



public class Update {

	private Connection conexion;
	private Statement statement;
	private String query;


	
	public void updatePaciente(Paciente paciente, int id) throws SQLException
	{
		String insertTableSQL = "UPDATE paciente  SET" + 
				" `Nombre` = '"+paciente.getNombre()+"' ,"
				+ " `ap_Paterno` = '"+paciente.getAp_Paterno()+"' ,"
				+ " `ap_Materno` = '"+paciente.getAp_Materno()+"' ,"
				+ "`tipo_Sangre` = '"+paciente.getTipo_Sangre()+"',"
				+ " `alergias` = '"+paciente.getAlergias()+"', "
				+ "`telefono` = '"+paciente.getTelefono()+"',"
				+ " `correo`= '"+paciente.getCorreo()+"', "
				+ " `Sexo` = '"+paciente.getSexo()+"',"
				+ " `fecha_Nacimiento` = '"+paciente.getFecha_Nacimiento()+"' "
				+ "WHERE `id_Paciente` = "+id
						+ " ;"; 
		
		this.query =insertTableSQL;
		this.actualizar();
		
	}
	
	public void actualizarDepartamento(Departamento depto) throws SQLException
	{
		String insertTableSQL = "INSERT INTO departamento" + " ( `id_Departamento`,`Nombre`)"
				+ "VALUES ("+depto.getId_Departamento()+",'"+depto.getNombre()
				+"')"; 
		
		this.query = insertTableSQL;
		this.actualizar();
	}
	
	public void actualizarConsultorio(Consultorio consultorio) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Consultorio" + " ( `id_Consultorio`,`piso`)"
				+ "VALUES ("+consultorio.getId_Consultorio()+","+consultorio.getPiso()
				+")"; 
		
		this.query = insertTableSQL;
		this.actualizar();
	}
	
	public void actualizarEspecialidad(Especialidad especialidad) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Especialidad" + " ( `Nombre`, `id_Departamento`)"
				+ "VALUES ('"+especialidad.getNombre()+"',"+especialidad.getId_Departamento()
				+")"; 
		
		this.query = insertTableSQL;
		this.actualizar();
	}
	
	public void actualizarCita(Cita cita) throws SQLException
	{
		String insertTableSQL = "INSERT INTO `cita`( `Fecha`, `Hora`, `id_Paciente`,"
				+ " `id_Medico`, `id_Consultorio`, `id_Receta`) "
				+ "VALUES ('"+cita.getFecha()+"','"+cita.getHora()+"',"+cita.getId_Paciente()+","
				+ ""+cita.getId_Medico()+","+cita.getId_Consultorio()+",'"+cita.getId_Receta()+"',"
				+")"; 
		
		this.query = insertTableSQL;
		this.actualizar();
	}
	
	public void updateMedico(Medico medico, int id) throws SQLException
	{
		String insertTableSQL = "UPDATE medico  SET" 
				+" (`id_Especialidad`,`Nombre`, `ap_Paterno`,, `ap_Materno`,"
				+ "  `Telefono`, `Correo`) "
				+ "VALUES ('"+medico.getNombre()+"','"+medico.getAp_Paterno()+"','"+medico.getAp_Materno()+"','"+medico.getTelefono()+"','"+medico.getCorreo()+"')"; 
		
		this.query =insertTableSQL;
		this.actualizar();
		
	}
	
	
	public Update() {
		this.conexion = new Conexion().getConnection();
	}

	public void actualizar() throws SQLException {
		try {
			
			this.statement = this.conexion.createStatement();

			System.out.println(this.query);

			// execute insert SQL stetement
			statement.executeUpdate(this.query);

			System.out.println("Record is updated into DBUSER table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

			if ( this.conexion!= null) {
				this.conexion.close();
			}
		}
	}
}
