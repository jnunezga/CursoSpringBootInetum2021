package com.domain.modelo;

import java.util.Objects;

public class Alumno implements Vaciable, Model {
	// atributos
	private int codigo;
	private String nombre;
	private String apellido;
	private String estudios;
	private String linkRepositorio;
	private String email;
	private String observaciones;

	// constructor por defecto
	public Alumno() {
	}

	// constructor completo
	public Alumno(int codigo, String nombre, String apellido, String estudios, String linkRepositorio, String email, String observaciones) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estudios = estudios;
		this.linkRepositorio = linkRepositorio;
		this.email = email;
		this.observaciones = observaciones;
	}

	// constructor por código
	public Alumno(int codigo) {
		this.setCodigo(codigo);
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEstudios() {
		return this.estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public String getLinkRepositorio() {
		return this.linkRepositorio;
	}

	public void setLinkRepositorio(String linkRepositorio) {
		this.linkRepositorio = linkRepositorio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public boolean isEmpty() {
		return this.codigo == 0
			   && (this.nombre == null || this.nombre.isEmpty())
			   && (this.apellido == null || this.apellido.isEmpty())
			   && (this.estudios == null || this.estudios.isEmpty())
			   && (this.linkRepositorio == null || this.linkRepositorio.isEmpty())
			   && (this.email == null || this.email.isEmpty())
			   && (this.observaciones == null || this.observaciones.isEmpty());			   
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, codigo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Alumno))
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellido, other.apellido) && codigo == other.codigo
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("codigo=").append(this.codigo)
				.append(", nombre=").append(this.nombre)
				.append(", apellido=").append(this.apellido)
				.append(", estudios=").append(this.estudios)
				.append(", linkRepositorio=").append(this.linkRepositorio)
				.append(", email=").append(this.email)
				.append(", observaciones=").append(this.observaciones);
		
		return sb.toString();
	}
}
