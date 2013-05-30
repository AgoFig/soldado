package ar.edu.unlam.tallerweb.soldado;

public interface EstadoSoldado {
	
	int cantidadSangre = 0;
	int cantidadAgujeros = 0;
	public EstadoSoldado recibirDisparo();	
	public EstadoSoldado recibirCuracion();
	public String getEstado();
}
