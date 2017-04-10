/**
 * 
 */
package com.towasoftware.springmvcexample.bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.springmvcexample.model.Paciente;


public class MapPaciente {

	public List<Paciente> mapPacientes(ResultSet resultSet) throws SQLException {

		List<Paciente> lista = new ArrayList();
		while (resultSet.next()) {
			
			lista.add(maper(resultSet));
		}
		return lista;
	}
	
	public Paciente mapPaciente(ResultSet resultSet) throws SQLException {
			
			if (!resultSet.next())
			{return null;}
			return maper(resultSet);
			
	}
	
	public Paciente maper(ResultSet resultSet) throws SQLException
	{
		Paciente paciente = new Paciente();
		paciente.setId_Paciente(resultSet.getInt("id_Paciente"));
		paciente.setNombre(resultSet.getString("nombre"));
		paciente.setAp_Paterno(resultSet.getString("ap_Paterno"));
		paciente.setAp_Materno(resultSet.getString("ap_Materno"));
		paciente.setTipo_Sangre(resultSet.getString("tipo_Sangre"));
		paciente.setAlergias(resultSet.getString("alergias"));
		paciente.setTelefono(resultSet.getString("Telefono"));
		paciente.setCorreo(resultSet.getString("correo"));
		paciente.setSexo(resultSet.getString("Sexo"));
		paciente.setFecha_Nacimiento(resultSet.getString("fecha_Nacimiento"));
		
	return paciente;
	}
}
