package paradigma;

import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivosDeBoleteria {

	public static void crearArchivo(Usuario usuario) {
		try {
			FileWriter fw = new FileWriter("Salida/" + usuario.getNombre() + ".txt");
			fw.write("Este es el itinerario de " + usuario.getNombre() + " \n");
			fw.write(usuario.getItinerario() + "\n");
			fw.write("Deberá pagar: " + usuario.getCostoTotalItinerario() + " fichas de Tomy y Daly."
					+ "\nY necesitará: " + usuario.getTiempoTotalItinerario()
					+ " horas para realizar todas las actividades!.");
			fw.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}