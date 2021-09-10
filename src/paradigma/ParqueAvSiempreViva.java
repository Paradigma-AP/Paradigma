package paradigma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
	
	public void ordenarPorPreferencia(Sugerencia [] sugerencias, TipoDeAtraccion tipo) {
		Arrays.sort(sugerencias, new OrdenarParaSugerir(tipo));
	}
	
	
	
	
	public void sugerirActividades(Usuario usuarios) {
		//ArrayList<String> itinerario = new ArrayList<String>();
			for (Sugerencia sugerencia : sugerencias) {
				ordenarPorPreferencia(sugerencias, usuarios.getAtraccionPreferida());
				while (usuarios.puedeComprarSugerencia(sugerencia)
						&& !sugerencia.estaLleno() /* itinerario no contiene sugerencia si es promo que no muestre dsp atracciones */) {
					
					System.out.println(sugerencia);
					//itinerario.add(sugerencias);
					/*
					 * leer por consola si reponde s itinerario.add(sugerencia)
					 * sugerencia.restarCupo && usuario.restarPresupuestoYtiempo(sugerencia.getPrecio()
					 * , getsugerencia.getDuracionEnHoras()) si reponde n continuar, si reponde mal
					 * error. imprimirArrayList
					 */
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

	public void agregarTodasLasAtracciones() {
		this.atracciones = LeerYguardarArchivos.getAtraccionesDesdeArchivos();
	}

	public void agregarTodasLasPromociones() {
		this.promociones = LeerYguardarArchivos.getPromocionesDesdeArchivo();
	}

	public void agregarTodosLosUsuarios() {
		this.usuarios = LeerYguardarArchivos.getUsuariosDesdeArchivos();
	}

	@Override
	public String toString() {
		return "ParqueAvSiempreViva [sugerencias=" + Arrays.toString(sugerencias) + "]";
	}
}
