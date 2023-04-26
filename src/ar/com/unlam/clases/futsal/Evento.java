package ar.com.unlam.clases.futsal;

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
	
	
}
