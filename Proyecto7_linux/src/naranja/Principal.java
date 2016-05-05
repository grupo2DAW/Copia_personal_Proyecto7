package naranja;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto puntoPrueba1 = new Punto (2.7, 8.1);
		Punto puntoPrueba2 = new Punto (5.1, 12.7);
		Punto puntoPrueba3 = new Punto ();
		Punto puntoPrueba4 = new Punto ();
		
		puntoPrueba4.setX(5.0);
		puntoPrueba4.setY(30.0);
		
		System.out.println(puntoPrueba1 
				+ "\n" +puntoPrueba2 
				+ "\n" +puntoPrueba3
				+ "\n" +puntoPrueba4);
		
	}

}
