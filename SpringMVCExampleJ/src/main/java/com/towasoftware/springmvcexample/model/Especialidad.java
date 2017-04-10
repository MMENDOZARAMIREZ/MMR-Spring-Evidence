package com.towasoftware.springmvcexample.model;

public class Especialidad {
	
	private int id_Especialidad;
	private int id_Departamento;
	private String nombre;
	public int getId_Especialidad() {
		return id_Especialidad;
	}
	public void setId_Especialidad(int id_Especialidad) {
		this.id_Especialidad = id_Especialidad;
	}
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
	@Override
	public String toString() {
		return "Especialidad [id_Especialidad=" + id_Especialidad + ", id_Departamento=" + id_Departamento + ", nombre="
				+ nombre + "]";
	}

}
