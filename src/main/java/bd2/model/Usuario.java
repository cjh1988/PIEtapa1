package bd2.model;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Usuario {
	
	private String email;
	private String nombre;
	private Date fechaDeCreacion;
	private Collection<Cursada> cursadasRealizadas;
	private Collection<Traduccion> traducciones;
	
	public Usuario(String email, String nombre, Date fechaDeCreacion){
		this.setEmail(email);
		this.setNombre(nombre);
		this.setFechaDeCreacion(fechaDeCreacion);
		this.cursadasRealizadas = new HashSet<Cursada>();
		this.traducciones = new HashSet<Traduccion>();
	}
	
	public Collection<Cursada> cursadasAprobadas(Idioma idioma){
		Collection<Cursada> aprobadas = new HashSet<Cursada>();
		if(!this.getCursadasRealizadas().isEmpty()){
			for(Cursada cur : this.getCursadasRealizadas()){
			  if(cur.finalizada()){
				if(cur.getCurso().getIdioma().getNombre().equals(idioma.getNombre()))					
					aprobadas.add(cur);
			  }
			}
		}
		return aprobadas;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public Collection<Cursada> getCursadasRealizadas() {
		return cursadasRealizadas;
	}

	public void agregarCursada(Cursada cursada) {
		this.getCursadasRealizadas().add(cursada);
	}

	public Collection<Traduccion> getTraducciones() {
		return traducciones;
	}

	public void agregarTraduccion(Traduccion traduccion) {
		this.getTraducciones().add(traduccion);
	}
	
	public int nivel(Idioma idioma){
	   int max=0;
		if(!this.cursadasAprobadas(idioma).isEmpty())
		{
			for(Cursada cursada : this.cursadasAprobadas(idioma)){
				if(cursada.getCurso().getNivel()>max)
					max = cursada.getCurso().getNivel();
			}
		}
	  return max;
		
	}
	
	
}
