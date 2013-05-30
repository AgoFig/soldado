package ar.edu.unlam.tallerweb.soldado;

import junit.framework.Assert;

import org.junit.Test;

public class test {
	

	@Test
	public void queUnSoldadoPuedaDevolverEstado() {
		Soldado miSoldado = new Soldado();
		String estado = miSoldado.getEstado();

		Assert.assertEquals("Saludable", estado);
	}
	
	@Test
	public void queUnSoldadoPuedaRecibirDisparo() {
		Soldado miSoldado = new Soldado();
		String estado = miSoldado.getEstado();

		Assert.assertEquals("Saludable", estado);
	}
}
