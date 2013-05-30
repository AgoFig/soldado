package ar.edu.unlam.tallerweb.soldado;

public class Muerto implements EstadoSoldado {

	
	int cantidadSangre = 0;
	int cantidadAgujeros = 0;
	@Override
	public EstadoSoldado recibirCuracion() {
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public String getEstado() {
		return "Muerto";
	}

		@Override
	public EstadoSoldado recibirDisparo() {
		return null;
		
	}

}
