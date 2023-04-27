package ar.com.unlam.clases.futsal;

import java.util.Objects;

public class Evento {
	private Jugador autor;
    private Double minuto;

    public Evento(Jugador autor, Double minuto) {
        this.autor = autor;
        this.minuto = minuto;
    }
	public Evento() {
		
	}
	public Jugador getAutor() {
		return autor;
	}
	public void setAutor(Jugador autor) {
		this.autor = autor;
	}
	public Double getMinuto() {
		return minuto;
	}
	public void setMinuto(Double minuto) {
		this.minuto = minuto;
	}
	@Override
	public int hashCode() {
		return Objects.hash(autor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(autor, other.autor);
	}
	
	
	
}
