package paradigma;

import java.util.ArrayList;
import java.util.Arrays;

public class ParqueAvSiempreViva {
	private Atraccion[] atracciones = LeerYguardarArchivos.getAtraccionesDesdeArchivos();
	private Promocion[] promociones;
	private Usuario[] usuarios;
	private static Sugerencia[] sugerencias;

	/*
	 * CREAR ARCHIVO LEERLO Y GUARDARLO EN ARRAYS Sugerir visitas por pref de
	 * usuario generar itinerarios METODO Vender ordenar atraccioes y promociones,
	 * segun pref de usuario
	 */
	public ArrayList<Sugerencia> obtenerItinerarioPorConsola() {
		for(Usuario usuario : usuarios) {
			obtenerItinerario(usuario);
		}
		return null;
	}
	
	public static ArrayList<Sugerencia> obtenerItinerario(Usuario usuario){
			sugerirActividades(usuario, usuario.getItinerario());
			return usuario.getItinerario();
	}

	public static void sugerirActividades(Usuario usuario, ArrayList<Sugerencia> itinerario) {
		for (Sugerencia sugerencia : sugerencias) {
			ordenarPorPreferencia(sugerencias, usuario.getAtraccionPreferida());
			while (usuario.puedeComprarSugerencia(sugerencia) && !sugerencia.estaLleno()
					&& !itinerario.contains(sugerencia)) {
				usuario.comprarSugerencias(sugerencia);
				/*if (sugerencia.esPromocion()) {
					// usuario.comprarSugerencias(guardar infor de atracciones de las promos );
				}*/
			}
			if (itinerario.contains(sugerencia)) {
				usuario.restarPresupuestoYtiempo(sugerencia.getPrecio(), 
						sugerencia.getDuracionEnHoras());
				sugerencia.restarCupo();
				//System.out.println(itinerario);
			}
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
		return "Parque Av. Siempre Viva \n"
				+ "Sugerencias : \n" + Arrays.toString(sugerencias) + ".";
	}
}
