package com.proy.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Alumno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer codigo;
	private String nombre;
	private Integer edad;

	public Alumno() {
	}

	public Alumno(Integer codigo, String nombre, Integer edad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public boolean equals(Object obj) {

		
		if (edad != null) {
			return false;
		} 
		if (nombre != null) {
			return false;
		} 
		return true;
	}
	
	
	
	
	
}
