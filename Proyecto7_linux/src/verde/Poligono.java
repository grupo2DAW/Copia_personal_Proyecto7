package verde;

public class Poligono {


	//Suponemos formas como cuadrado, rectángulo,
	//rombo, trapecio, etc...
	//Para polígonos de más lados, cambiar esta constante:
	private final int LADOS_POLIGONO = 4;

	private Punto punto1;
	private Punto punto2;
	private Punto punto3;
	private Punto punto4;

	//Constructor convencional
	public Poligono(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {

		this.punto1 = punto1;
		this.punto2 = punto2;
		this.punto3 = punto3;
		this.punto4 = punto4;
	}

	//Constructor por defecto

	public Poligono(){

		this (new Punto(0.0,0.0),new Punto(0.0,0.0),new Punto(0.0,0.0),new Punto(0.0,0.0));
	}

	//Constructor copia

	public Poligono (Poligono poligono){

		this ( poligono.punto1, poligono.punto2, poligono.punto3, poligono.punto4 );
	}

	//Métodos Getters y Setters

	public Punto getPunto1() {
		return punto1;
	}

	public void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}

	public Punto getPunto2() {
		return punto2;
	}

	public void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}

	public Punto getPunto3() {
		return punto3;
	}

	public void setPunto3(Punto punto3) {
		this.punto3 = punto3;
	}

	public Punto getPunto4() {
		return punto4;
	}

	public void setPunto4(Punto punto4) {
		this.punto4 = punto4;
	}

}//Class
