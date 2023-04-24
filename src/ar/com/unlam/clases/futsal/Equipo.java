package ar.com.unlam.clases.futsal;

import java.util.ArrayList;

public class Equipo {
	String nombre;
	ArrayList<Jugador> jugadores = new ArrayList<>();

	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Equipo() {
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void agregarJugador(Jugador jugador) {

		jugadores.add(jugador);
		
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	
	
}
