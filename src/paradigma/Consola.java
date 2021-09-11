package paradigma;

import java.util.Scanner;

public class Consola {
	static Scanner teclado = new Scanner(System.in);

	public static void bienvenidaAlParque() {
		Usuario[] usuarios = ParqueAvSiempreViva.getUsuarios();
		Sugerencia[] sugerencias = ParqueAvSiempreViva.getSugerencias();
		for (Usuario usuario : usuarios) {
			//ParqueAvSiempreViva.ordenarPorPreferencia(sugerencias, usuario.getAtraccionPreferida());
			System.out.println("Hola " + usuario.getNombre()
					+ " Bienvenide al Parque Av. Siempre Viva, donde nada puede MALIR SAL!");
			for (Sugerencia sugerencia : sugerencias) {
				System.out.println(sugerencia);
				System.out.println(sugerencia.getPrecio());
				//System.out.println(usuario.getItinerario());
				if (usuario.puedeComprarSugerencia(sugerencia) /*&& !sugerencia.estaLleno()
						/*&& !usuario.getItinerario().contains("Nombre: " + sugerencia.getNombre() + ", Precio: "
								+ sugerencia.getPrecio() + ", Duracion: " + sugerencia.getDuracionEnHoras())*/) {
				System.out.println(sugerencia);

					//System.out.println("Nombre: " + sugerencia.getNombre() + ", Precio: " + sugerencia.getPrecio() + ", Duracion: " + sugerencia.getDuracionEnHoras());

					Consola.comprarSugerencia(usuario, sugerencia);
				}
			}
				/*
				 * if (sugerencia.esPromocion()) { // usuario.comprarSugerencias(guardar infor
				 * de atracciones de las promos ); }
				 */
		}
		teclado.close();
	}

	public static void comprarSugerencia(Usuario usuario, Sugerencia sugerencia) {
		System.out.println("¿Acepta esta Actividad Si o No?");
		char respuesta;
		respuesta = teclado.nextLine().charAt(0);
		if (respuesta == 'S') {
			usuario.agregarSugerenciaAlItinerario(sugerencia);
			usuario.restarPresupuestoYtiempo(sugerencia.getPrecio(), sugerencia.getDuracionEnHoras());
			sugerencia.restarCupo();
		}
	}
}
