/**
 * 
 */
package com.towasoftware.springmvcexample.bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.springmvcexample.model.Departamento;


public class MapDepartamento {
	public List<Departamento> mapDepartamentos(ResultSet resultSet) throws SQLException {

		List<Departamento> lista = new ArrayList();
		while (resultSet.next()) {

			lista.add(maper(resultSet));
		}
		return lista;
	}

	public Departamento mapDepartamento(ResultSet resultSet) throws SQLException {
		if (!resultSet.next()) {
			return null;
		}
		return maper(resultSet);

	}

	public Departamento maper(ResultSet resultSet) throws SQLException {
		Departamento depto = new Departamento();
		depto.setId_Departamento(resultSet.getInt("id_Departamento"));
		depto.setNombre(resultSet.getString("Nombre"));
		System.out.println(depto);
		return depto;
	}

}
