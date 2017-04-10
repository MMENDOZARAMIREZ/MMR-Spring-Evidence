package com.towasoftware.springmvcexample.bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.springmvcexample.model.Departamento;
import com.towasoftware.springmvcexample.model.Especialidad;
import com.towasoftware.springmvcexample.model.Medico;
import com.towasoftware.springmvcexample.model.Paciente;

import java.sql.Statement;


public class Consulta {

	private Connection conexion;
	private Statement statement;
	private String query;
	private ResultSet resultSet;

	public Consulta() {
		this.conexion = new Conexion().getConnection();
	}

	public List<Paciente> consultaPacientes() throws SQLException {
		 this.query = "select * FROM paciente;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapPaciente mapPaciente = new MapPaciente();
			return mapPaciente.mapPacientes(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}

	
	public Paciente consultaUltimoPaciente() throws SQLException {
		 this.query = "SELECT * FROM paciente";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapPaciente mapPaciente = new MapPaciente();
			return mapPaciente.mapPaciente(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	
	public Paciente consultaPacienteId(int id) throws SQLException
	{
		this.setQuery("SELECT * FROM paciente;");
		return consultaPaciente();
	}

	public Paciente consultaPaciente() throws SQLException {
		
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapPaciente mapPaciente = new MapPaciente();
			return mapPaciente.mapPaciente(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}

	public List<Departamento> consultaDepartamentos() throws SQLException {
		// this.query = "Select * FROM Departamento;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapDepartamento mapDepartamento = new MapDepartamento();
			return mapDepartamento.mapDepartamentos(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}

	public Departamento consultaDepartamento() throws SQLException {
		// this.query = "Select * FROM Departamento;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapDepartamento mapDepartamento = new MapDepartamento();
			return mapDepartamento.mapDepartamento(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public List<Especialidad> consultaEspecialidades() throws SQLException {
		// this.query = "Select * FROM Departamento;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapEspecialidad mapEspecialidad = new MapEspecialidad();
			return mapEspecialidad.mapEspecialidad(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	

	public Medico consultaUltimoMedico() throws SQLException {
		 this.query = "SELECT * FROM medico ORDER BY id_medico DESC LIMIT 1";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapMedico mapMedico = new MapMedico();
			return mapMedico.mapMedico(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	public Medico consultaMedicoId(int id) throws SQLException {
		 this.query = "SELECT * FROM medico WHERE id_medico = "+ id + ";";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapMedico mapMedico = new MapMedico();
			return mapMedico.mapMedico(resultSet);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public List<Medico> consultaMedicos() throws SQLException {
		 this.query = "Select * FROM Medico;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapMedico mapMedico = new MapMedico();
			return mapMedico.mapMedicos(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}

	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}

	/**
	 * @param conexion
	 *            the conexion to set
	 */
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	/**
	 * @return the statement
	 */
	public Statement getStatement() {
		return statement;
	}

	/**
	 * @param statement
	 *            the statement to set
	 */
	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @param query
	 *            the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}

}
