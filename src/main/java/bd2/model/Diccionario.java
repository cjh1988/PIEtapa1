package bd2.model;


import java.util.HashMap;
import java.util.Map;


public class Diccionario {

	private Idioma idioma;
	private Map<String, String> definiciones;
	private String edicion;
	
	public Diccionario(){		
		this.definiciones = new HashMap<String,String>();		
	}
	public Diccionario(Idioma idioma, String edicion){
		this.setIdioma(idioma);
		this.setEdicion(edicion);
		this.definiciones = new HashMap<String,String>();
	}
	public Idioma getIdioma() {
		return idioma;
	}
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public Map<String, String> getDefiniciones() {
		return definiciones;
	}
	
	public void agregarDefinicion(String palabra, String definicion){
		this.getDefiniciones().put(palabra, definicion);
	}
	
	public String definicion(String palabra){
		return this.getDefiniciones().get(palabra);
	}
	
}
