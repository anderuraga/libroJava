package com.ipartek.formacion.javalibro.pojo;

public class Cancion {

	
	private String nombre;
	private String artista;
	private String duracion;
	
	public Cancion(String nombre, String artista, String duracion) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
	public String toString() {
		return "Cancion [nombre=" + nombre + ", artista=" + artista + ", duracion=" + duracion + "]";
	}
	
	
	
}
