package paradigma;

import java.util.Arrays;

public class ParqueAvSiempreViva {
	private static Atraccion[] atracciones;
	private static Promocion[] promociones;
	private static Usuario[] usuarios;
	private static Sugerencia[] sugerencias;

	/*
	 * CREAR ARCHIVO LEERLO Y GUARDARLO EN ARRAYS Sugerir visitas por pref de
	 * usuario generar itinerarios METODO Vender ordenar atraccioes y promociones,
	 * segun pref de usuario
	 */
	/*
	 * public ArrayList<String> obtenerItinerarioPorConsola() { ArrayList<String>
	 * itinerario = null; for(Usuario usuario : usuarios) { itinerario =
	 * obtenerItinerario(usuario); } return itinerario; }
	 * 
	 * public static ArrayList<String> obtenerItinerario(Usuario usuario){
	 * sugerirActividades(usuario, usuario.getItinerario()); return
	 * usuario.getItinerario(); }
	 */

	public static Atraccion[] getAtracciones() {
		return atracciones = LeerYguardarArchivos.getAtraccionesDesdeArchivos();
	}

	public static Promocion[] getPromociones() {
		return promociones = LeerYguardarArchivos.getPromocionesDesdeArchivo();
	}

	public static Usuario[] getUsuarios() {
		return usuarios = LeerYguardarArchivos.getUsuariosDesdeArchivos();
	}

	public static void ordenarPorPreferencia(Sugerencia[] sugerencias, TipoDeAtraccion tipo) {
		Arrays.sort(sugerencias, new OrdenarParaSugerir(tipo));
	}

	public static Sugerencia[] getSugerencias() {
		sugerencias = new Sugerencia[atracciones.length + promociones.length];
		System.arraycopy(promociones, 0, sugerencias, 0, promociones.length);
		System.arraycopy(atracciones, 0, sugerencias, promociones.length, atracciones.length);
		return sugerencias;
	}

	@Override
	public String toString() {
		return "ParqueAvSiempreViva [atracciones=" + Arrays.toString(atracciones) + ", promociones="
				+ Arrays.toString(promociones) + ", usuarios=" + Arrays.toString(usuarios) + "]";
	}

}
