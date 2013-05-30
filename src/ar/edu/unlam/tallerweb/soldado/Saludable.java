package ar.edu.unlam.tallerweb.soldado;

public class Saludable implements EstadoSoldado{
	int cantidadSangre = 0;
	int cantidadAgujeros = 0;
	@Override
	public EstadoSoldado recibirDisparo() {
		return null;
		
		
	}

	@Override
	public EstadoSoldado recibirCuracion() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEstado() {
		return "Saludable";
		
	}

	

}
