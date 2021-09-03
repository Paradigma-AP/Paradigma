package paradigma;

public class ParqueAvSiempreViva {
	public Atraccion [] atracciones;
	public Promocion [] promociones;
	public Usuario [] usuarios;

	/*
	 CREAR ARCHIVO
	 LEERLO Y GUARDARLO EN ARRAYS 
	 Sugerir visitas por pref de usuario
	 generar itinerarios 
	 METODO Vender 
	 ordenar atraccioes y promociones, segun pref de usuario
	 */

	public Atraccion obtenerAtraccionPorNombre(String nombre) {
		for (Atraccion atraccion : atracciones) {
			if(atraccion.getNombre().equals(nombre)) {
				return atraccion;
			}
		}
		return null;
	}
	
	
	
}
