package bd2.model;

public class Prueba {
	 private int puntaje;	 
	 private Leccion leccion;
	 	
//falta implmentar metodo setPuntaje();
	 
	
	 
	public Prueba(Leccion leccion, int puntaje) throws Exception{

		this.setLeccion(leccion);
		this.setPuntaje(puntaje);
	}
		
	private boolean esValido(int numero){
		return(numero>=0&&numero<=100);
	} 
	
	public boolean aprobada(){
		return(this.getPuntaje()>=60); 
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) throws Exception{
		
		if(this.esValido(puntaje)){
			this.puntaje = puntaje; 
		}
		else{
			  if(puntaje<0)
				throw new Exception("No se puede usar valores negativos como puntaje de una prueba."); //{
			  else
			  {
				if(puntaje>100)
					throw new Exception("No se puede usar valores mayores a 100 como puntaje de una prueba.");
			  }
			// if(puntaje<0){
				// this.puntaje = 1; 
			 //}
			 //else{
				// this.puntaje = 100;
			 //}
				 
		}
		
	}
		
	
	public Leccion getLeccion() {
		return leccion;
	}
	public void setLeccion(Leccion leccion) {
		
		this.leccion = leccion;
	}

}
