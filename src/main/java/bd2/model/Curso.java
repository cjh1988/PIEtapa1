package bd2.model;

import java.util.Collection;
import java.util.HashSet;

public class Curso {
		
	private String nombre;
	private Integer nivel;
	private Collection<Leccion> lecciones;
	private Idioma idioma;

	public Curso(String nombre, Idioma idioma, Integer nivel){
		this.setNombre(nombre);
		this.setIdioma(idioma);
		this.setNivel(nivel);
		this.lecciones = new HashSet<Leccion>(); 
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public Collection<Leccion> getLecciones() {
		return lecciones;
	}
	public void agregarLeccion(Leccion leccion) {
		this.getLecciones().add(leccion);
	}
	public Idioma getIdioma() {
		return idioma;
	}
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

}
