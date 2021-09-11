package paradigma;

import java.util.Scanner;

public class Consola {
		
	public void imprimirPorConsola(Usuario [] usuarios, Sugerencia[] sugerencias) {
		for(Usuario usuario : usuarios) {
		System.out.println("Hola "+usuario.getNombre());
		ParqueAvSiempreViva.sugerirActividades(usuario, usuario.getItinerario(), sugerencias);
		}
	}
	
	public static void comprarSugerencia(Usuario usuario,Sugerencia sugerencia) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Acepta esta Actividad Si o No?");
		char respuesta;
		respuesta = sc.nextLine().charAt(0);
		if (respuesta == 'S') {
			usuario.agregarSugerenciaAlItinerario(sugerencia);
			sc.close();
		}
	}
}
