package Luchadores;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PruebaTorneo {
	
	@Test
	public void pruebaSimple() {
		Luchador [] luchadores = new Luchador [5];
		int []deberiaDar= {4,0,0,2,1};
		int []loQueDa;
		luchadores[0] = new Luchador(555,128);
		luchadores[1] = new Luchador(345,124);
		luchadores[2] = new Luchador(123,125);
		luchadores[3] = new Luchador(435,126);
		luchadores[4] = new Luchador(343,127);
		Torneo torneito=new Torneo(luchadores);
		loQueDa=torneito.resolver();
		assertArrayEquals(deberiaDar, loQueDa);
	}

	@Test
	public void SinDominio() {
		Luchador [] luchadores = new Luchador [5];
		int []deberiaDar= {0,0,0,0,0};
		int []loQueDa;
		luchadores[0] = new Luchador(555,128);
		luchadores[1] = new Luchador(345,130);
		luchadores[2] = new Luchador(123,135);
		luchadores[3] = new Luchador(35,140);
		luchadores[4] = new Luchador(3,147);
		Torneo torneito=new Torneo(luchadores);
		loQueDa=torneito.resolver();
		assertArrayEquals(deberiaDar, loQueDa);
	}
	
	@Test
	public void TodosDominanAlUltimo() {
		Luchador [] luchadores = new Luchador [5];
		int []deberiaDar= {1,1,1,1,0};
		int []loQueDa;
		luchadores[0] = new Luchador(555,128);
		luchadores[1] = new Luchador(345,130);
		luchadores[2] = new Luchador(123,135);
		luchadores[3] = new Luchador(35,140);
		luchadores[4] = new Luchador(3,1);
		Torneo torneito=new Torneo(luchadores);
		loQueDa=torneito.resolver();
		assertArrayEquals(deberiaDar, loQueDa);
	}
}
