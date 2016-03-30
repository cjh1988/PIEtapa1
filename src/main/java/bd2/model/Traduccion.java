package bd2.model;

import java.util.Date;

public class Traduccion extends Tarea {

	private String texto;
	private Idioma idioma;
	private Parrafo parrafo;

	
	public Traduccion(Date fecha,String descripcion,boolean completa, String texto,Parrafo parrafo, Idioma idioma ){
		super(fecha,descripcion,completa);
		this.setTexto(texto);
		this.parrafo = parrafo;
		this.idioma = idioma;
	}
	
	public Idioma getIdiomaOriginal(){
	 return this.getParrafo().getDocumento().getIdioma();	
	}
	
	public Idioma getIdioma() {
		return idioma;
	}
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	public Parrafo getParrafo() {
		return this.parrafo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
