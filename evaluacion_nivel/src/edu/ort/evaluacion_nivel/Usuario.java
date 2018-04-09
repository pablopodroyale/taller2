package edu.ort.evaluacion_nivel;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String clave;
	private ArrayList<Artista> artistasFavoritos;
	
	public Usuario(String nombre, String clave) {
		super();
		this.nombre = nombre;
		this.clave = clave;
	}
	
	private boolean validar(String clave) {
		boolean valido = false;
		if (clave == this.clave) {
			valido = true;
		}
		return valido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	
	
}
