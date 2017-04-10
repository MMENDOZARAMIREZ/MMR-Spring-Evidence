package com.towasoftware.springmvcexample.model;

import java.sql.Date;

public class Receta {
	
	private int id_Receta;
	private Paciente id_Paciente;
	private Medico cedula;
	private Date fecha;
	private int peso;
	private int presion;
	private int talla;
	private int temperatura;
	private String diagnostico;
	private String observacion;
	private String prescripcion;
	public int getId_Receta() {
		return id_Receta;
	}
	public void setId_Receta(int id_Receta) {
		this.id_Receta = id_Receta;
	}
	public Paciente getId_Paciente() {
		return id_Paciente;
	}
	public void setId_Paciente(Paciente id_Paciente) {
		this.id_Paciente = id_Paciente;
	}
	public Medico getCedula() {
		return cedula;
	}
	public void setCedula(Medico cedula) {
		this.cedula = cedula;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getPresion() {
		return presion;
	}
	public void setPresion(int presion) {
		this.presion = presion;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getPrescripcion() {
		return prescripcion;
	}
	public void setPrescripcion(String prescripcion) {
		this.prescripcion = prescripcion;
	}
	@Override
	public String toString() {
		return "Receta [id_Receta=" + id_Receta + ", id_Paciente=" + id_Paciente + ", cedula=" + cedula + ", fecha="
				+ fecha + ", peso=" + peso + ", presion=" + presion + ", talla=" + talla + ", temperatura="
				+ temperatura + ", diagnostico=" + diagnostico + ", observacion=" + observacion + ", prescripcion="
				+ prescripcion + "]";
	}

}
