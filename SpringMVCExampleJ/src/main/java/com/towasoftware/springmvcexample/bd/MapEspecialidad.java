package com.towasoftware.springmvcexample.bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.springmvcexample.model.Especialidad;


public class MapEspecialidad {
	
	public List<Especialidad> mapEspecialidad(ResultSet resultSet) throws SQLException {

		List<Especialidad> lista = new ArrayList();
		while (resultSet.next()) {
			Especialidad especialidad = new Especialidad();
			especialidad.setId_Especialidad(resultSet.getInt("id_Especialidad"));
			especialidad.setNombre(resultSet.getString("Nombre"));
			lista.add(especialidad);
		}
		return lista;
	}

}
