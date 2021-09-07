package paradigma;

import java.util.Arrays;

public class ParqueAvSiempreViva {
	private Atraccion[] atracciones;
	private Promocion[] promociones;
	private Usuario[] usuarios;
	private Sugerencia[] sugerencias;

	/*
	 * CREAR ARCHIVO LEERLO Y GUARDARLO EN ARRAYS Sugerir visitas por pref de
	 * usuario generar itinerarios METODO Vender ordenar atraccioes y promociones,
	 * segun pref de usuario
	 */

	/*
	 * Creo metodo itinerario que sea una Arraylist de objetos donde se vayan
	 * guardadno las sugerencias.-
	 * 
	 * 
	 */

	public void sugerirActividades() {

		for (int i = 0; i < usuarios.length; i++) {
//ArrayList new..llame itinerario..
			System.out.print(usuarios);
//itinerario.add(usuario)
			for (int j = 0; j < sugerencias.length; j++) {
				Arrays.sort(sugerencias, new OrdenarParaSugerir(usuarios[i].getAtraccionPreferida()));
				while (usuarios[i].puedeComprarSugerencia(sugerencias[j])
						&& !sugerencias[j].estaLleno() /* itinerario no contiene sugerencia si es promo que no muestre dsp atracciones */) {
					System.out.println(sugerencias[j]);
					/*
					 * leer por consola si reponde s itinerario.add(sugerencia)
					 * sugerencia.restarCupo && usuario.restarPresupuestoYtiempo(sugerencia.getPrecio()
					 * , getsugerencia.getDuracionEnHoras()) si reponde n continuar, si reponde mal
					 * error. imprimirArrayList
					 */
				}
			}
		}
	}

	public Sugerencia[] getSugerencias(Atraccion[] atracciones, Promocion[] promociones) {
		this.sugerencias = new Sugerencia[atracciones.length + promociones.length];
		for (int i = 0; i < atracciones.length; i++) {
			sugerencias[i] = atracciones[i];
		}
		int contador = 0;
		for (int i = atracciones.length; i < atracciones.length + promociones.length; i++) {
			sugerencias[i] = promociones[contador++];
		}
		return sugerencias;
	}

	public void agregarTodasLasAtracciones(Atraccion[] atracciones) {
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
			if (atraccion.getNombre().equals(nombre)) {
				return atraccion;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "ParqueAvSiempreViva [sugerencias=" + Arrays.toString(sugerencias) + "]";
	}
}
