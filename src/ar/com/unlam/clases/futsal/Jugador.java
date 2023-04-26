package ar.com.unlam.clases.futsal;

public class Jugador {
	
	Integer precio;
	Integer edad;
	
	public Jugador() {
		
	}

	public Jugador(Integer precio, Integer edad) {
		this.precio = precio;
		this.edad = edad;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	
}
