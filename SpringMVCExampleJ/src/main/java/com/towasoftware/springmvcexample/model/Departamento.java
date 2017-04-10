package com.towasoftware.springmvcexample.model;

import java.sql.Date;

import javax.print.DocFlavor.STRING;

public class Departamento {
	
	private int id_Departamento;
	public int getId_Departamento() {
		return id_Departamento;
	}
	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private String nombre;
	@Override
	public String toString() {
		return "Departamento [id_Departamento=" + id_Departamento + ", nombre=" + nombre + "]";
	}
	
	

}
