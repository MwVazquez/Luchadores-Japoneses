/// throws IOException
//que es esto?

package Luchadores;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArchivoTorneo {

	public static Torneo leer(String path) throws IOException {
		Scanner sc = new Scanner(new File(path));
		Luchador [] luchadores = new Luchador [sc.nextInt()];
		
		for (int i = 0; i < luchadores.length; i++) {
			luchadores[i] = new Luchador(sc.nextInt(), sc.nextInt());
		}
		sc.close();
		return new Torneo(luchadores);
	}
	
	public static void escribir (String salida, int[] is) throws IOException {
		PrintWriter archivoSalida = new PrintWriter(new FileWriter(salida + ".out"));
		for (int i = 0; i < is.length; i++) 
			archivoSalida.println(is[i]);
		archivoSalida.close();
	}
}
