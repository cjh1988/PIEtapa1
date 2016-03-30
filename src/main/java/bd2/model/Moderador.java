package bd2.model;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Moderador extends Usuario {

	private Collection<Idioma> idiomas;
	private Collection<Evaluacion> evaluaciones;
	
	public Moderador(String email, String nombre, Date fechaDeCreacion) {
		super(email, nombre, fechaDeCreacion);
		// TODO Auto-generated constructor stub
		this.setIdiomas(new HashSet<Idioma>());
		this.setEvaluaciones(new HashSet<Evaluacion>());
		
	}
	

	
	public boolean manejaIdioma(Idioma idioma){
		return this.getIdiomas().contains(idioma);
	}
	
	public int reputacion(){
		//if (this.sum() != 0)
			//return (this.sum()/this.getEvaluaciones().size());
		//else return 0;
		return this.getEvaluaciones().size();
	}
	
	public void evaluar(Traduccion traduccion, String descripcion, int puntaje) throws Exception{
		Calendar cal = Calendar.getInstance();
		Date hoy = cal.getTime();
		if(this.manejaIdioma(traduccion.getIdiomaOriginal()) && this.manejaIdioma(traduccion.getIdioma()))
			{this.getEvaluaciones().add(new Evaluacion(hoy,descripcion,true,traduccion,puntaje));}
		else throw new Exception("No se pueden evaluar traducciones de idiomas que el moderador no maneja.") ;
	}
	
	public Collection<Idioma> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(Collection<Idioma> idiomas) {
		this.idiomas = idiomas;
	}
	
	public void agregarIdioma(Idioma idioma){
		this.getIdiomas().add(idioma);
	}
	
	public Collection<Evaluacion> getEvaluaciones() {
		return evaluaciones;
	}

	public void setEvaluaciones(Collection<Evaluacion> evaluaciones) {
		this.evaluaciones = evaluaciones;
	}

	
}
