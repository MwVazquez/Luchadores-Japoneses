package Luchadores;

public class Luchador {

	private int altura, peso;
	

	public Luchador(int altu, int peso) {
		this.altura = altu;
		this.peso = peso;
	}


	public boolean domina(Luchador l2) {
		if(this.altura > l2.altura && this.peso > l2.peso)
			return true;
		if(this.altura == l2.altura && this.peso > l2.peso)
			return true;
		if(this.peso == l2.peso && this.altura > l2.altura)
			return true;
		return false;
	}

}
