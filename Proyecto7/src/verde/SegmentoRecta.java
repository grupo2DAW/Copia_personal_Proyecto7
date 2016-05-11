package verde;

public class SegmentoRecta {

	verde.Punto puntoInicio;
	verde.Punto puntoFin;
	
	//Constructor convencional
	public SegmentoRecta(Punto puntoInicio, Punto puntoFin) {

		this.puntoInicio = puntoInicio;
		this.puntoFin = puntoFin;
	}
	//Constructor por defecto
	public SegmentoRecta(){

		this (new Punto(), new Punto());

	}
	//Constructor copia
	public SegmentoRecta(SegmentoRecta recta){

		this (recta.puntoInicio, recta.puntoFin);
	}
	
	//Métodos Getters y Setters
	public verde.Punto getPuntoInicio() {
		return puntoInicio;
	}
	public void setPuntoInicio(verde.Punto puntoInicio) {
		this.puntoInicio = puntoInicio;
	}
	public verde.Punto getPuntoFin() {
		return puntoFin;
	}
	public void setPuntoFin(verde.Punto puntoFin) {
		this.puntoFin = puntoFin;
	}
	
}//Class
