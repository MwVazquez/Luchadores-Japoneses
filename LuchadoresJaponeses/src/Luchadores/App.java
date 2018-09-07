package Luchadores;

import java.io.IOException;
// que es trows IOException
// ver mañana como funcion
//xk sale error si no lo agrego
public class App {

	public static void main(String[] args) throws IOException {
		Torneo torneo = ArchivoTorneo.leer("casoBase");
		ArchivoTorneo.escribir("outFile", torneo.resolver());		
		System.out.println("Nada");
	}

}
