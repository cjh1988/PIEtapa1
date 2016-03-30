package bd2.model;

import java.util.Collection;
import java.util.HashSet;

public class Sitio {
	
	private Collection<Usuario> usuarios;
	private Collection<Curso> cursos;
	private Collection<Documento> documentos;

	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}

	public Sitio() {
		this.usuarios = new HashSet<Usuario>();
		this.cursos = new HashSet<Curso>();
		this.documentos = new HashSet<Documento>();
	}

	public void registrarUsuario(Usuario usr){
		this.getUsuarios().add(usr);	
	}
	
	public Collection<Curso> getCursos() {
		return cursos;
	}

	public void agregarCurso(Curso curso) {
		this.getCursos().add(curso);
	}

	public Collection<Documento> getDocumentos() {
		return documentos;
	};

	public void agregarDocumento(Documento doc) {
		this.getDocumentos().add(doc);
	}

}
