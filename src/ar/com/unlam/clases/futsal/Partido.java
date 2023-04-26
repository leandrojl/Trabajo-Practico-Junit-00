package ar.com.unlam.clases.futsal;

public class Partido {
	
	Equipo equipoLocal=null;
	Equipo equipoVisitante=null;
	
	public Partido() {
		
	}

	public void agregarEquipoLocalYVisitante(Equipo equipoLocal, Equipo equipoVisitante) {
		setEquipoLocal(equipoLocal);
		setEquipoVisitante(equipoVisitante);
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
	
	

}
