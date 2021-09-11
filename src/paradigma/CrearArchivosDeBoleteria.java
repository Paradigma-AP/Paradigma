package paradigma;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivosDeBoleteria {
	
	public static void guardarItinerario(Usuario usuario) throws IOException{
		PrintWriter salida = new PrintWriter(new FileWriter("salida/" + usuario.getNombre() + ".txt"));
		//salida.println(ParqueAvSiempreViva.obtenerItinerario(usuario));
		salida.close();
		}
	
}
