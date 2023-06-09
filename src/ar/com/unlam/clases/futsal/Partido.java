package ar.com.unlam.clases.futsal;

import java.util.ArrayList;
import java.util.List;

public class Partido {
	
	Equipo equipoLocal=null;
	Equipo equipoVisitante=null;
	private List<Evento> goles = new ArrayList<>();
	private List<Evento> amonestados = new ArrayList<>();
	private List<Evento> expulsados = new ArrayList<>();
	
	public Partido() {
		
	}
	
	public List<Evento> getExpulsados() {
		return expulsados;
	}

	public void setExpulsados(List<Evento> expulsados) {
		this.expulsados = expulsados;
	}

	
	public void registrarAmonestado(Evento evento) {
			if(amonestados.isEmpty()) {
				amonestados.add(evento);
			}else {
				for(Evento amonestado : amonestados) {
					if(amonestado.getAutor().equals(evento.getAutor())) {
						registrarExpulsado(evento);
					}else {
						amonestados.add(evento);
					}
						
					}
				
			}
			
	}
	public void registrarGol(Evento evento) {
		goles.add(evento);
	}
	public void registrarAmonestado(Jugador autor, Double minuto) {
        Evento amonestado = new Evento(autor, minuto);
        amonestados.add(amonestado);
    }
	
	public void registrarGol(Jugador autor, Double minuto) {
        Evento gol = new Evento(autor, minuto);
        goles.add(gol);
    }

	public void agregarEquipoLocalYVisitante(Equipo equipoLocal, Equipo equipoVisitante) {
		setEquipoLocal(equipoLocal);
		setEquipoVisitante(equipoVisitante);
	}

	public List<Evento> getGoles() {
		return goles;
	}

	public void setGoles(List<Evento> goles) {
		this.goles = goles;
	}

	public List<Evento> getAmonestados() {
		return amonestados;
	}

	public void setAmonestados(List<Evento> amonestados) {
		this.amonestados = amonestados;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public void registrarExpulsado(Evento expulsado) {
		expulsados.add(expulsado);
		
	}

	}
