package Luchadores;

public class Torneo {

	private Luchador [] Luchadores;
	
	public Torneo(Luchador[] luchadores2) {
			this.Luchadores = luchadores2;
	}

	public int [] resolver () {
		int [] res = new int [Luchadores.length];
		for(int i = 0; i<Luchadores.length; i++) {
			res[i]=0;
			for(int j = 0; j<Luchadores.length; j++) {
				if(Luchadores[i]!=Luchadores[j]) {
					if(Luchadores[i].domina(Luchadores[j])) 
						res[i]++;
				}	
			}
		}
		return res;
	}

}
