package bd2.model;

import java.util.Date;

public class Tarea {
	
	private Date fecha;
	private String descripcion;
	private boolean completa;

	public Tarea(Date fecha, String descripcion, boolean completa){
		this.fecha= fecha;
		this.descripcion = descripcion;
		this.completa = completa;
	}
	
	
	public void completar(){
		
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean getCompleta() {
		return completa;
	}

	public void setCompleta(boolean completa) {
		this.completa = completa;
	}
	
	
}
