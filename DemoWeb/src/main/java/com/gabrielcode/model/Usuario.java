package com.gabrielcode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	private int codigo;
	@Column(name = "USU_CLAVE", length = 255)
	private String clave;
	@Column(name = "USU_NOMBRE", length = 255)
	private String nombre;
	
	public Usuario() {
	}	

	public Usuario(int codigo, String nombre, String clave) {
		this.codigo = codigo;
		this.clave = clave;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}