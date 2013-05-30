package ar.edu.unlam.tallerweb.soldado;

public class Herido implements EstadoSoldado {
	int cantidadSangre = 0;
	int cantidadAgujeros = 0;
	@Override
	public EstadoSoldado recibirDisparo() {		
		Muerto muerto = new Muerto();
		muerto.cantidadSangre=0;
		muerto.cantidadAgujeros++;
		return muerto;
	}

	@Override
	public EstadoSoldado recibirCuracion() {
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public String getEstado() {
		return "Herido";

	}

}
