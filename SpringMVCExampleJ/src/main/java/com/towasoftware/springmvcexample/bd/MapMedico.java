/**
 * 
 */
package com.towasoftware.springmvcexample.bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.springmvcexample.model.Medico;


public class MapMedico {

	public List<Medico> mapMedicos(ResultSet resultSet) throws SQLException {

		List<Medico> lista = new ArrayList();
		while (resultSet.next()) {
			
			lista.add(maper(resultSet));
		}
		return lista;
	}
	
	public Medico mapMedico(ResultSet resultSet) throws SQLException {
			
			if (!resultSet.next())
			{return null;}
			return maper(resultSet);
			
	}
	
	public Medico maper(ResultSet resultSet) throws SQLException
	{
		Medico medico = new Medico();
		medico.setCedula(resultSet.getInt("cedula"));
		medico.setId_Especialidad(resultSet.getInt("id_Especialidad"));
		medico.setNombre(resultSet.getString("nombre"));
		medico.setAp_Paterno(resultSet.getString("ap_Paterno"));
		medico.setAp_Paterno(resultSet.getString("ap_Materno"));
		medico.setTelefono(resultSet.getString("Telefono"));
		medico.setCorreo(resultSet.getString("correo"));

		System.out.println(medico);
	return medico;
	}
}
