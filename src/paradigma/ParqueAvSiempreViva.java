package paradigma;

import java.util.Arrays;

public class ParqueAvSiempreViva {
	private Atraccion [] atracciones;
	private Promocion [] promociones;
	private Usuario [] usuarios;
	private Sugerencia [] sugerencias;


	/*
	 CREAR ARCHIVO
	 LEERLO Y GUARDARLO EN ARRAYS 
	 Sugerir visitas por pref de usuario
	 generar itinerarios 
	 METODO Vender 
	 ordenar atraccioes y promociones, segun pref de usuario
	 */
	
	public Sugerencia[] getSugerencias(Atraccion [] atracciones, Promocion [] promociones) {
		Sugerencia [] sugerencias = new Sugerencia[atracciones.length + promociones.length];
		for(int i = 0; i < atracciones.length; i++) {
			sugerencias [i] = atracciones[i];
		}
		int contador = 0;
		for(int i = atracciones.length; i < atracciones.length + promociones.length; i++) {
			sugerencias[i] = promociones[contador++];
		}
		System.out.println(sugerencias);
		return sugerencias;
	}

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
				+ Arrays.toString(promociones) + ", usuarios=" + Arrays.toString(usuarios) + ", sugerencias=" + Arrays.toString(sugerencias) +"]";
	}
}
