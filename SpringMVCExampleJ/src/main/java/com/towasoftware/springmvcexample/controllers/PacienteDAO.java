package com.towasoftware.springmvcexample.controllers;

import com.towasoftware.springmvcexample.model.Paciente;

public interface PacienteDAO
{
	public void insert(Paciente paciente);
	public Paciente findByCustomerId(int id_Paciente);
}