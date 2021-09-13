package org.danicv.Stream.models;

public class Usuario {
	private String nombre;
	private String apellido;
	private Integer id;
	private static int ultimoId;

	public Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = ++ultimoId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUltimoId() {
		return ultimoId;
	}

	public void setUltimoId(Integer ultimoId) {
		this.ultimoId = ultimoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return  nombre + " " + apellido ;
	}
	
	

}
