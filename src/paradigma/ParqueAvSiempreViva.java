package paradigma;

import java.util.Arrays;

public class ParqueAvSiempreViva {
	private static Atraccion[] atracciones;
	private static Promocion[] promociones;
	private static Usuario[] usuarios;
	private static Sugerencia[] sugerencias;

	public static Atraccion[] getAtracciones() {
		return atracciones = LeerYguardarArchivos.getAtraccionesDesdeArchivos();
	}

	public static Promocion[] getPromociones() {
		return promociones = LeerYguardarArchivos.getPromocionesDesdeArchivos();
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
