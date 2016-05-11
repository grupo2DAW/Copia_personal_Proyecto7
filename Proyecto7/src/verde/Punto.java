package verde;



public class Punto {

	private double x ;
	private double y ;
	
	//Constructores
	public Punto(double x, double y){
		super();
		this.x=x;
		this.y=y;
		
	}
	public Punto (){
		
		this ( 0.0, 0.0);
	}
	
	public Punto(Punto punto){
		
		this (punto.x, punto.y);
	}		
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	//M�todo toString reescrito
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	
}//Class
