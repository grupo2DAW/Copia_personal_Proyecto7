package verde;

import java.util.Date;

public class Manzana {

	private String variedad;
	private String calibre;
	private String temporada;
	private String color;
	private Date fechaCompra;
	private int caducidadEnDias;

	public Manzana(String variedad, String calibre, String temporada,
			String color, Date fechaCompra, int caducidadEnDias) {

		this.variedad = variedad;
		this.calibre = calibre;
		this.temporada = temporada;
		this.color = color;
		this.fechaCompra = fechaCompra;
		this.caducidadEnDias = caducidadEnDias;
	}


	public Manzana (){

		this ( "Golden", "1", "verano", "dorado", new Date(), 20);

	}

	public Manzana (Manzana manzana){

		this (manzana.variedad, manzana.calibre, manzana.temporada, manzana.color, manzana.fechaCompra, manzana.caducidadEnDias);
	}


	public String getVariedad() {
		return variedad;
	}


	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}


	public String getCalibre() {
		return calibre;
	}


	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}


	public String getTemporada() {
		return temporada;
	}


	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Date getFechaCompra() {
		return fechaCompra;
	}


	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}


	public int getCaducidadEnDias() {
		return caducidadEnDias;
	}


	public void setCaducidadEnDias(int caducidadEnDias) {
		this.caducidadEnDias = caducidadEnDias;
	}

	

}//Class
