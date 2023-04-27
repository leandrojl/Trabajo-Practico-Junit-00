package ar.com.unlam.test.futsal;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ar.com.unlam.clases.futsal.Equipo;
import ar.com.unlam.clases.futsal.Evento;
import ar.com.unlam.clases.futsal.Jugador;
import ar.com.unlam.clases.futsal.Partido;
public class TestFutsal {
/*	
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
	
	@Test
	public void queSePuedaCalcularLaEdadPromedioDelEquipo() {
		Equipo equipo = new Equipo("Racing");
		Jugador jugador1 = new Jugador(1,20);
		Jugador jugador2 = new Jugador(2,20);
		Jugador jugador3 = new Jugador(1,20);
		Jugador jugador4 = new Jugador(5,20);
		Jugador jugador5 = new Jugador(1,20);
		
		equipo.agregarJugador(jugador1);
		equipo.agregarJugador(jugador2);
		equipo.agregarJugador(jugador3);
		equipo.agregarJugador(jugador4);
		equipo.agregarJugador(jugador5);
		
		Integer valorEsperado = equipo.calcularEdadDelEquipo();
		
		System.out.print(valorEsperado);
		
		Assert.assertTrue(valorEsperado == 20);
	}
	
	@Test
	public void queSePuedaCrearUnPartidoConEquipoLocalYEquipoVisitante() {
		Partido partido = new Partido();
		
		//CREACION EQUIPO 1 LOCAL
		Equipo equipoLocal = new Equipo("Racing");
		Jugador jugador1 = new Jugador(1,20);
		Jugador jugador2 = new Jugador(2,20);
		Jugador jugador3 = new Jugador(1,20);
		Jugador jugador4 = new Jugador(5,20);
		Jugador jugador5 = new Jugador(1,20);
		
		equipoLocal.agregarJugador(jugador1);
		equipoLocal.agregarJugador(jugador2);
		equipoLocal.agregarJugador(jugador3);
		equipoLocal.agregarJugador(jugador4);
		equipoLocal.agregarJugador(jugador5);
		
		//CREACION EQUIPO 2 VISITANTE
		Equipo equipoVisitante = new Equipo("Independiente");
		Jugador jugador11 = new Jugador(2,30);
		Jugador jugador22 = new Jugador(2,30);
		Jugador jugador33 = new Jugador(2,30);
		Jugador jugador44= new Jugador(2,30);
		Jugador jugador55 = new Jugador(2,30);
		
		equipoVisitante.agregarJugador(jugador11);
		equipoVisitante.agregarJugador(jugador22);
		equipoVisitante.agregarJugador(jugador33);
		equipoVisitante.agregarJugador(jugador44);
		equipoVisitante.agregarJugador(jugador55);
		
		//AGREGO EQUIPOS AL PARTIDO
		partido.agregarEquipoLocalYVisitante(equipoLocal,equipoVisitante);
		
		Assert.assertEquals(equipoLocal, partido.getEquipoLocal());
		Assert.assertEquals(equipoVisitante, partido.getEquipoVisitante());
	}
	
	@Test
	public void queSePuedaCrearUnGolYConocerAlAutoYElMinuto() {
		
		Partido partido = new Partido();
		
		//CREACION EQUIPO 1 LOCAL
		Equipo equipoLocal = new Equipo("Racing");
		Jugador jugador1 = new Jugador(1,20);
		Jugador jugador2 = new Jugador(2,20);
		Jugador jugador3 = new Jugador(1,20);
		Jugador jugador4 = new Jugador(5,20);
		Jugador jugador5 = new Jugador(1,20);
		
		equipoLocal.agregarJugador(jugador1);
		equipoLocal.agregarJugador(jugador2);
		equipoLocal.agregarJugador(jugador3);
		equipoLocal.agregarJugador(jugador4);
		equipoLocal.agregarJugador(jugador5);
		
		//CREACION EQUIPO 2 VISITANTE
		Equipo equipoVisitante = new Equipo("Independiente");
		Jugador jugador11 = new Jugador(2,30);
		Jugador jugador22 = new Jugador(2,30);
		Jugador jugador33 = new Jugador(2,30);
		Jugador jugador44= new Jugador(2,30);
		Jugador jugador55 = new Jugador(2,30);
		
		equipoVisitante.agregarJugador(jugador11);
		equipoVisitante.agregarJugador(jugador22);
		equipoVisitante.agregarJugador(jugador33);
		equipoVisitante.agregarJugador(jugador44);
		equipoVisitante.agregarJugador(jugador55);
		//CUANDO CREO UN GOL
		Evento gol = new Evento(jugador55, 12.25);
		//AGREGO EQUIPOS AL PARTIDO
		partido.agregarEquipoLocalYVisitante(equipoLocal,equipoVisitante);
		
		partido.registrarGol(gol);
		
		
		Assert.assertTrue(partido.getGoles().contains(gol));
		
	}
	
	@Test
	public void queSePuedaAmonestarUnJugadorYConocerElMinuto() {
		
		Partido partido = new Partido();
		
		//CREACION EQUIPO 1 LOCAL
		Equipo equipoLocal = new Equipo("Racing");
		Jugador jugador1 = new Jugador(1,20);
		Jugador jugador2 = new Jugador(2,20);
		Jugador jugador3 = new Jugador(1,20);
		Jugador jugador4 = new Jugador(5,20);
		Jugador jugador5 = new Jugador(1,20);
		
		equipoLocal.agregarJugador(jugador1);
		equipoLocal.agregarJugador(jugador2);
		equipoLocal.agregarJugador(jugador3);
		equipoLocal.agregarJugador(jugador4);
		equipoLocal.agregarJugador(jugador5);
		
		//CREACION EQUIPO 2 VISITANTE
		Equipo equipoVisitante = new Equipo("Independiente");
		Jugador jugador11 = new Jugador(2,30);
		Jugador jugador22 = new Jugador(2,30);
		Jugador jugador33 = new Jugador(2,30);
		Jugador jugador44= new Jugador(2,30);
		Jugador jugador55 = new Jugador(2,30);
		
		equipoVisitante.agregarJugador(jugador11);
		equipoVisitante.agregarJugador(jugador22);
		equipoVisitante.agregarJugador(jugador33);
		equipoVisitante.agregarJugador(jugador44);
		equipoVisitante.agregarJugador(jugador55);
		//CUANDO CREO UN GOL
		Evento amonestado = new Evento(jugador55, 12.25);
		//AGREGO EQUIPOS AL PARTIDO
		partido.agregarEquipoLocalYVisitante(equipoLocal,equipoVisitante);
		
		partido.registrarAmonestado(amonestado);
		
		
		Assert.assertTrue(partido.getAmonestados().contains(amonestado));
		
	}
	
	@Test
	public void queSePuedaExpulsarAUnJugador() {
		
		Partido partido = new Partido();
		
		//CREACION EQUIPO 1 LOCAL
		Equipo equipoLocal = new Equipo("Racing");
		Jugador jugador1 = new Jugador(1,20);
		Jugador jugador2 = new Jugador(2,20);
		Jugador jugador3 = new Jugador(1,20);
		Jugador jugador4 = new Jugador(5,20);
		Jugador jugador5 = new Jugador(1,20);
		
		equipoLocal.agregarJugador(jugador1);
		equipoLocal.agregarJugador(jugador2);
		equipoLocal.agregarJugador(jugador3);
		equipoLocal.agregarJugador(jugador4);
		equipoLocal.agregarJugador(jugador5);
		
		//CREACION EQUIPO 2 VISITANTE
		Equipo equipoVisitante = new Equipo("Independiente");
		Jugador jugador11 = new Jugador(2,30);
		Jugador jugador22 = new Jugador(2,30);
		Jugador jugador33 = new Jugador(2,30);
		Jugador jugador44= new Jugador(2,30);
		Jugador jugador55 = new Jugador(2,30);
		
		equipoVisitante.agregarJugador(jugador11);
		equipoVisitante.agregarJugador(jugador22);
		equipoVisitante.agregarJugador(jugador33);
		equipoVisitante.agregarJugador(jugador44);
		equipoVisitante.agregarJugador(jugador55);
		//CUANDO CREO UN GOL
		Evento expulsado = new Evento(jugador55, 12.25);
		//AGREGO EQUIPOS AL PARTIDO
		partido.agregarEquipoLocalYVisitante(equipoLocal,equipoVisitante);
		
		partido.registrarExpulsado(expulsado);
		
		
		Assert.assertTrue(partido.getExpulsados().contains(expulsado));
		
	}
	*/
	@Test
	public void cuandoAmonestoADosVecesAUnJugadorLoExpulsa() {
		
		Partido partido = new Partido();
		
		//CREACION EQUIPO 1 LOCAL
		Equipo equipoLocal = new Equipo("Racing");
		Jugador jugador1 = new Jugador(1,20);
		Jugador jugador2 = new Jugador(2,20);
		Jugador jugador3 = new Jugador(1,20);
		Jugador jugador4 = new Jugador(5,20);
		Jugador jugador5 = new Jugador(1,20);
		
		equipoLocal.agregarJugador(jugador1);
		equipoLocal.agregarJugador(jugador2);
		equipoLocal.agregarJugador(jugador3);
		equipoLocal.agregarJugador(jugador4);
		equipoLocal.agregarJugador(jugador5);
		
		//CREACION EQUIPO 2 VISITANTE
		Equipo equipoVisitante = new Equipo("Independiente");
		Jugador jugador11 = new Jugador(2,30);
		Jugador jugador22 = new Jugador(2,30);
		Jugador jugador33 = new Jugador(2,30);
		Jugador jugador44= new Jugador(2,30);
		Jugador jugador55 = new Jugador(2,30);
		
		equipoVisitante.agregarJugador(jugador11);
		equipoVisitante.agregarJugador(jugador22);
		equipoVisitante.agregarJugador(jugador33);
		equipoVisitante.agregarJugador(jugador44);
		equipoVisitante.agregarJugador(jugador55);
		//CUANDO CREO UN GOL
		Evento amonestado = new Evento(jugador55, 12.25);
		Evento amonestado1 = new Evento(jugador55, 15.25);
		//AGREGO EQUIPOS AL PARTIDO
		partido.agregarEquipoLocalYVisitante(equipoLocal,equipoVisitante);
		
		partido.registrarAmonestado(amonestado);
		partido.registrarAmonestado(amonestado1);
		
		
		Assert.assertTrue(partido.getExpulsados().contains(amonestado1));
		
	}
	
	

}
