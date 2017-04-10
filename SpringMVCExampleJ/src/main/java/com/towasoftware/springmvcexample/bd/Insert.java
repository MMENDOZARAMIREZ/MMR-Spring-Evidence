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



public class Insert {

	private Connection conexion;
	private Statement statement;
	private String query;
	private ResultSet resultSet;

	
	public void InsertarPaciente(Paciente paciente) throws SQLException
	{
		String insertTableSQL = "INSERT INTO paciente"
				+ "(nombre, ap_paterno, ap_materno, tipo_sangre, alergias, telefono, correo, sexo, fecha_Nacimiento) " 
				+ "VALUES"
				+ "('"+ paciente.getNombre() +"','"+ paciente.getAp_Paterno() +"',"
						+ "'"+ paciente.getAp_Materno() +"'"
						+ ",'"+ paciente.getTipo_Sangre()+"','"+ paciente.getAlergias() +"','"
						+ paciente.getTelefono() +"',"
						+ "'james.j@hotmail.com','M',"
						+ "'1990-05-21')";
		 
		
		this.query =insertTableSQL;
		this.insertar();
		
	}
	
	public void InsertarDepartamento(Departamento depto) throws SQLException
	{
		String insertTableSQL = "INSERT INTO departamento" + " ( `id_Departamento`,`Nombre`)"
				+ "VALUES ("+depto.getId_Departamento()+",'"+depto.getNombre()
				+"')"; 
		
		this.query = insertTableSQL;
		this.insertar();
	}
	
	public void InsertarConsultorio(Consultorio consultorio) throws SQLException
	{
		String insertTableSQL = "INSERT INTO consultorio" + " ( `id_Consultorio`,`Piso`)"
				+ "VALUES ("+consultorio.getId_Consultorio()+","+consultorio.getPiso()
				+")"; 
		
		this.query = insertTableSQL;
		this.insertar();
	}
	
	public void InsertarEspecialidad(Especialidad especialidad) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Especialidad" + " ( `Nombre`, `idDepartamento`)"
				+ "VALUES ('"+especialidad.getNombre()+"',"+especialidad.getId_Departamento()
				+")"; 
		
		this.query = insertTableSQL;
		this.insertar();
	}
	
	public void InsertarCita(Cita cita) throws SQLException
	{
		String insertTableSQL = "INSERT INTO cita ( fecha, hora, id_Paciente,"
				+ " id_Medico, id_Consultorio, id_Receta) "
				+ "VALUES ('"+cita.getFecha()+"','"+cita.getHora()+"',"+cita.getId_Paciente()+","
				+ ""+cita.getId_Medico()+","+cita.getId_Consultorio()+",'"+cita.getId_Receta()+"',"
				+")"; 
		
		this.query = insertTableSQL;
		this.insertar();
	}
	
	public void InsertarMedico(Medico medico) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Medico" + " (id_Especialidad, Nombre ,  ap_Paterno , ap_Materno ,"
				+ " Telefono, Correo ) "
				+ "VALUES ('"+medico.getId_Especialidad()+"','"+medico.getNombre()+"','"+medico.getAp_Paterno()+"',"+"'"+medico.getAp_Materno()+",'"+medico.getTelefono()+"','"+medico.getCorreo()+"')"; 	
		this.query =insertTableSQL;
		this.insertar();
		
	}
	
	
	public Insert() {
		this.conexion = new Conexion().getConnection();
	}

	public void insertar() throws SQLException {
		try {
			
			this.statement = this.conexion.createStatement();

			System.out.println(this.query);

			// execute insert SQL stetement
			statement.executeUpdate(this.query);

			System.out.println("Record is inserted into DBUSER table!");

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
