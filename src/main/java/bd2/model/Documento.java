package bd2.model;

import java.util.Collection;
import java.util.HashSet;

public class Documento {

	private String nombre;
	private int complejidad;
	private Collection<Parrafo> parrafos;
	private Idioma idioma;
	
	public Documento(String nombre, Idioma idioma){
		this.setNombre(nombre);
		this.setIdioma(idioma);
		this.parrafos = new HashSet<Parrafo>(); 		
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getComplejidad() {
		return complejidad;
	}

	public void setComplejidad(int complejidad) {
		this.complejidad = complejidad;
	}

	public Collection<Parrafo> getParrafos() {
		return parrafos;
	}

	public void agregarParrafo(String parrafo) {
		this.getParrafos().add(new Parrafo(parrafo,this));
	}
	
	
}
