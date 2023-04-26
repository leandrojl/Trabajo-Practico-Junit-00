package ar.com.unlam.test.futsal;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ar.com.unlam.clases.futsal.Equipo;
import ar.com.unlam.clases.futsal.Jugador;
public class TestFutsal {
	
	@Test
	public void queSePuedaCrearUnEquipoCon5Jugadores() {
		Equipo equipo = new Equipo("Racing");
		Jugador jugador1 = new Jugador(150000,25);
		Jugador jugador2 = new Jugador(200000,19);
		Jugador jugador3 = new Jugador(100000,31);
		Jugador jugador4 = new Jugador(500000,22);
		Jugador jugador5 = new Jugador(120000,28);
		
		equipo.agregarJugador(jugador1);
		equipo.agregarJugador(jugador2);
		equipo.agregarJugador(jugador3);
		equipo.agregarJugador(jugador4);
		equipo.agregarJugador(jugador5);
		
		Assert.assertTrue(equipo.getJugadores().size() ==5);
	}
	
	@Test
	public void queSePuedaCalcularElValorDelEquipo() {
		Equipo equipo = new Equipo("Racing");
		Jugador jugador1 = new Jugador(1,25);
		Jugador jugador2 = new Jugador(2,19);
		Jugador jugador3 = new Jugador(1,31);
		Jugador jugador4 = new Jugador(5,22);
		Jugador jugador5 = new Jugador(1,28);
		
		equipo.agregarJugador(jugador1);
		equipo.agregarJugador(jugador2);
		equipo.agregarJugador(jugador3);
		equipo.agregarJugador(jugador4);
		equipo.agregarJugador(jugador5);
		
		Integer valorEsperado = equipo.calcularValorDelEquipo();
		
		Assert.assertTrue(valorEsperado == 10);
		
	}

}
