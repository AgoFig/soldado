package ar.edu.unlam.tallerweb.soldado;

public class Soldado {
	
	private EstadoSoldado estado;
	public Integer cantidadAgujeros;

	public Soldado() {
		this.estado = new Saludable();
	}

	public void recibirDisparo() {
		this.estado = estado.recibirDisparo();		
	}

	public void recibirCuracion() {
		this.estado = estado.recibirCuracion();
	}

	public String getEstado() {
		return estado.getEstado();
	}
}
