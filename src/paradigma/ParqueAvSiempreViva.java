package paradigma;

import java.util.Arrays;

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

	public void agregarTodasLasAtracciones(Atraccion [] atracciones) {
		this.atracciones = atracciones;
	}

	public void agregarTodasLasPromociones(Promocion[] promociones) {
		this.promociones = promociones;
	}
	
	public void agregarTodosLosUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}
	
	public Atraccion obtenerAtraccionPorNombre(String nombre) {
		for (Atraccion atraccion : atracciones) {
			if(atraccion.getNombre().equals(nombre)) {
				return atraccion;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "ParqueAvSiempreViva [atracciones=" + Arrays.toString(atracciones) + ", promociones="
				+ Arrays.toString(promociones) + ", usuarios=" + Arrays.toString(usuarios) + "]";
	}
	
	
	
}
