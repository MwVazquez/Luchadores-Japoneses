package Luchadores;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PruebaLuchador {
	

	@Test
	public void pruebaSimple() {
		Luchador luchador1=new Luchador(123,124);
		Luchador luchador2=new Luchador(122,123);
		assertTrue(luchador1.domina(luchador2));
	}
	
	@Test
	public void pruebaSuperaSoloPorPeso() {
		Luchador luchador1=new Luchador(122,124);
		Luchador luchador2=new Luchador(122,123);
		assertTrue(luchador1.domina(luchador2));
	}	
	
	@Test
	public void pruebaSuperaSoloPorAltura() {
		Luchador luchador1=new Luchador(123,123);
		Luchador luchador2=new Luchador(122,123);
		assertTrue(luchador1.domina(luchador2));
	}
	
	@Test
	public void sinDominador() {
		Luchador luchador1=new Luchador(123,123);
		Luchador luchador2=new Luchador(122,124);
		assertFalse(luchador1.domina(luchador2));
	}
}
