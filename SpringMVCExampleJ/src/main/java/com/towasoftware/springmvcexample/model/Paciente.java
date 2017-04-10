package com.towasoftware.springmvcexample.model;

import java.sql.Date;

public class Paciente {

	private int id_Paciente;
	private String nombre;
	private String ap_Paterno;
	private String ap_Materno;
	private String tipo_Sangre;
	private String alergias;
	private String telefono;
	private String correo;
	private String sexo;
	private String fecha_Nacimiento;
	
	public int getId_Paciente() {
		return id_Paciente;
	}
	public void setId_Paciente(int id_Paciente) {
		this.id_Paciente = id_Paciente;
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
	public String getTipo_Sangre() {
		return tipo_Sangre;
	}
	public void setTipo_Sangre(String tipo_Sangre) {
		this.tipo_Sangre = tipo_Sangre;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getFecha_Nacimiento() {
		return fecha_Nacimiento;
	}
	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		this.fecha_Nacimiento = fecha_Nacimiento;
	}
	@Override
	public String toString() {
		return "Paciente [id_Paciente=" + id_Paciente + ", nombre=" + nombre + ", ap_Paterno=" + ap_Paterno
				+ ", ap_Materno=" + ap_Materno + ", tipo_Sangre=" + tipo_Sangre + ", alergias=" + alergias
				+ ", telefono=" + telefono + ", correo=" + correo + ", sexo=" + sexo + ", fecha_Nacimiento="
				+ fecha_Nacimiento + "]";
	}
	
	
}
