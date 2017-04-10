package com.towasoftware.springmvcexample.model;

import java.sql.Date;
import java.sql.Time;

public class Cita {
	
	private int id_Cita;
	private Date fecha;
	private Time hora;
	private Paciente id_Paciente;
	private Medico id_Medico;
	private Consultorio id_Consultorio;
	private Receta id_Receta;
	public int getId_Cita() {
		return id_Cita;
	}
	public void setId_Cita(int id_Cita) {
		this.id_Cita = id_Cita;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public Paciente getId_Paciente() {
		return id_Paciente;
	}
	public void setId_Paciente(Paciente id_Paciente) {
		this.id_Paciente = id_Paciente;
	}
	public Medico getId_Medico() {
		return id_Medico;
	}
	public void setId_Medico(Medico id_Medico) {
		this.id_Medico = id_Medico;
	}
	public Consultorio getId_Consultorio() {
		return id_Consultorio;
	}
	public void setId_Consultorio(Consultorio id_Consultorio) {
		this.id_Consultorio = id_Consultorio;
	}
	public Receta getId_Receta() {
		return id_Receta;
	}
	public void setId_Receta(Receta id_Receta) {
		this.id_Receta = id_Receta;
	}
	@Override
	public String toString() {
		return "Cita [id_Cita=" + id_Cita + ", fecha=" + fecha + ", hora=" + hora + ", id_Paciente=" + id_Paciente
				+ ", id_Medico=" + id_Medico + ", id_Consultorio=" + id_Consultorio + ", id_Receta=" + id_Receta + "]";
	}
	
	
}
