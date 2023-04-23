package ar.com.unlam.clases.callcenter;

public class Operador {

	public void realizarLlamada() {
		
		
	}

	public void realizarLlamada(Contacto contacto) {
		
		contacto.cambiarEstadoDeLlamado();
		
	}

	public Contacto buscarAlCandidato(Plantilla plantilla) {
		
		Contacto candidato = plantilla.obtenerCandidato();
		
		return candidato;
	}

}
