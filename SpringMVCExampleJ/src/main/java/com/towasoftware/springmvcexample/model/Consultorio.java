package com.towasoftware.springmvcexample.model;

public class Consultorio {
	
	private int id_Consultorio;
	private String piso;
	
	public int getId_Consultorio() {
		return id_Consultorio;
	}
	public void setId_Consultorio(int id_Consultorio) {
		this.id_Consultorio = id_Consultorio;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	@Override
	public String toString() {
		return "Consultorio [id_Consultorio=" + id_Consultorio + ", piso=" + piso + "]";
	}
	

}
