package com.towasoftware.springmvcexample.model;

public class Medico {
	
	private int cedula;
	private int id_Especialidad;
	private String nombre;
	private String ap_Paterno;
	private String ap_Materno;
	private String telefono;
	private String correo;
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public int getId_Especialidad() {
		return id_Especialidad;
	}
	public void setId_Especialidad(int id_Especialidad) {
		this.id_Especialidad = id_Especialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAp_Paterno() {
		return ap_Paterno;
	}
	public void setAp_Paterno(String ap_Paterno) {
		this.ap_Paterno = ap_Paterno;
	}
	public String getAp_Materno() {
		return ap_Materno;
	}
	public void setAp_Materno(String ap_Materno) {
		this.ap_Materno = ap_Materno;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	@Override
	public String toString() {
		return "Medico [cedula=" + cedula + ", id_Especialidad=" + id_Especialidad + ", nombre=" + nombre
				+ ", ap_Paterno=" + ap_Paterno + ", ap_Materno=" + ap_Materno + ", telefono=" + telefono + ", correo="
				+ correo + "]";
	}

}
