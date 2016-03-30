package bd2.model;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Cursada {

	private Date inicio;
	private Collection<Prueba> pruebas;
	private Usuario usuario;
	private Curso curso;
	
//Falta implementar metodo lecciones aprobadas.
//metodo Finalizada;	
	
	public Cursada(Curso curso, Date inicio, Usuario usuario){
		this.setInicio(inicio);
		this.setUsuario(usuario);
		this.setCurso(curso);
		this.pruebas = new HashSet<Prueba>();
		
	}
	
	public boolean finalizada(){
		return (this.leccionesAprobadas().size()==this.getCurso().getLecciones().size());
	}
	
	public Collection<Leccion> leccionesAprobadas(){
		
		Collection<Leccion> lecciones = new HashSet<Leccion>();
		for(Prueba prueba : this.getPruebas()){
			if(prueba.aprobada())
				lecciones.add(prueba.getLeccion());
		}	
		return lecciones;
	}
	
	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Collection<Prueba> getPruebas() {
		return pruebas;
	}

	public void agregarPrueba(Prueba prueba) {
		this.getPruebas().add(prueba);
		this.getUsuario().getCursadasRealizadas().add(this);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public Integer getNivel(){
		return this.getCurso().getNivel();
	}
	
	public Idioma getIdioma(){
		return this.getCurso().getIdioma();
	}
}
