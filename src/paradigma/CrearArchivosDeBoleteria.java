package paradigma;

import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivosDeBoleteria {

	public static void crearArchivo(Usuario usuario) {
		try {
			FileWriter fw = new FileWriter("Salida/" + usuario.getNombre() + ".txt");
			fw.write("Este es el itinerario de " + usuario.getNombre() + " \n");
			String itinerarioString = "";
			for (String itinerario : usuario.getItinerario()) {
				itinerarioString += itinerario;	
			}
			fw.write(itinerarioString + "\n");
			fw.write("Deberá pagar: " + usuario.getCostoTotalItinerario() + " fichas de Tomy y Daly."
					+ "\nY necesitará: " + usuario.getTiempoTotalItinerario()
					+ " horas para realizar todas las actividades!.");
			fw.close();
		} catch (IOException e) {
			System.out.println("Error al crear el archivo");
			e.printStackTrace();
		}
	}
}