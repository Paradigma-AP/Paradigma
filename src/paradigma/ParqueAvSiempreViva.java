package paradigma;

import java.util.ArrayList;
import java.util.Arrays;

public class ParqueAvSiempreViva {
	private Atraccion[] atracciones;
	private Promocion[] promociones;
	private Usuario[] usuarios;
	private static Sugerencia[] sugerencias;

	/*
	 * CREAR ARCHIVO LEERLO Y GUARDARLO EN ARRAYS Sugerir visitas por pref de
	 * usuario generar itinerarios METODO Vender ordenar atraccioes y promociones,
	 * segun pref de usuario
	 */
	/*
	public ArrayList<String> obtenerItinerarioPorConsola() {
		ArrayList<String> itinerario = null;
		for(Usuario usuario : usuarios) {
		 itinerario = obtenerItinerario(usuario);
		}
		return itinerario; 
	}
	
	public static ArrayList<String> obtenerItinerario(Usuario usuario){
			sugerirActividades(usuario, usuario.getItinerario());
			return usuario.getItinerario();
	}*/

	public static void sugerirActividades(Usuario usuario, ArrayList<String> itinerario, Sugerencia [] sugerencias) {
			for (Sugerencia sugerencia : sugerencias) {
				//ordenarPorPreferencia(sugerencias, usuario.getAtraccionPreferida());

				//System.out.println(sugerencia.toString());
				//Consola.comprarSugerencia(usuario, sugerencia);
			while (usuario.puedeComprarSugerencia(sugerencia) && !sugerencia.estaLleno()){
					//&& !itinerario.contains("Nombre: "+ sugerencia.getNombre()+", Precio: "+ sugerencia.getPrecio()+", Duracion: " + sugerencia.getDuracionEnHoras())){
				System.out.println("Nombre: "+ sugerencia.getNombre()+", Precio: "+ sugerencia.getPrecio()+", Duracion: " + sugerencia.getDuracionEnHoras());
			
				Consola.comprarSugerencia(usuario, sugerencia);
			}
				/*if (sugerencia.esPromocion()) {
					// usuario.comprarSugerencias(guardar infor de atracciones de las promos );
				}
			if (itinerario.contains(sugerencia.getNombre())) {
				usuario.restarPresupuestoYtiempo(sugerencia.getPrecio(), 
						sugerencia.getDuracionEnHoras());
				sugerencia.restarCupo();
				System.out.println(itinerario);
			}*/
		}
	}

	public Atraccion[] getAtracciones() {
		return this.atracciones = LeerYguardarArchivos.getAtraccionesDesdeArchivos();
	}

	public Promocion[] getPromociones() {
		return this.promociones = LeerYguardarArchivos.getPromocionesDesdeArchivo();
	}

	public Usuario[] getUsuarios() {
		return this.usuarios = LeerYguardarArchivos.getUsuariosDesdeArchivos();
	}

	public static void ordenarPorPreferencia(Sugerencia[] sugerencias, TipoDeAtraccion tipo) {
		Arrays.sort(sugerencias, new OrdenarParaSugerir(tipo));
	}

	public Sugerencia[] getSugerencias() {
		sugerencias = new Sugerencia[atracciones.length + promociones.length];
		System.arraycopy( atracciones, 0, sugerencias, 0, atracciones.length );
		System.arraycopy( promociones, 0, sugerencias, atracciones.length, promociones.length );
		return sugerencias;
	}

	@Override
	public String toString() {
		return "ParqueAvSiempreViva [atracciones=" + Arrays.toString(atracciones) + ", promociones="
				+ Arrays.toString(promociones) + ", usuarios=" + Arrays.toString(usuarios) + "]";
	}

	
}
