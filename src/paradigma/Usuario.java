package paradigma;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nombre;
	private int tiempoDisponibleEnHoras;
	private int presupuesto;
	private TipoDeAtraccion atraccionPreferida;
	private ArrayList<String> itinerario;
	

	public Usuario(String nombre, int tiempoDisponibleEnHoras, int presupuesto, TipoDeAtraccion atraccionPreferida) {
		this.nombre = nombre;
		this.tiempoDisponibleEnHoras = tiempoDisponibleEnHoras;
		this.presupuesto = presupuesto;
		this.atraccionPreferida = atraccionPreferida;
	}

	public boolean puedeComprarSugerencia(Sugerencia sugerencia) {
			boolean disponeDePresupuesto = this.presupuesto >= sugerencia.getPrecio();
			boolean disponeDeTiempo = this.tiempoDisponibleEnHoras >= sugerencia.getDuracionEnHoras();
			return disponeDePresupuesto && disponeDeTiempo;
	}

	public TipoDeAtraccion getAtraccionPreferida() {
		return atraccionPreferida;
	}

	public synchronized void restarPresupuestoYtiempo(int precio, int horas) {
		this.presupuesto -= precio;
		this.tiempoDisponibleEnHoras -= horas;
	}
/*
	public void getItinerario() {
		this.itinerario = ParqueAvSiempreViva.sugerirActividades();
	}
*/
	//VER METODO
		public void comprarSugerencias(String sugerencia) {
			char respuesta;
			Scanner sc = new Scanner(System.in);
			System.out.println("¿Acepta S/N?");
			respuesta = sc.nextLine().charAt(0);
			sc.close();
			if(respuesta == 'S') {
			this.itinerario.add(sugerencia);
			}
		}
	/*
	public crearArchivo(){
		recorre for de usuario 
		cree archi = ("/archivo"+ usuario[i].getNombre + ".txt")
		parque.sugerirActividades(usuario[i])
		cierre archi
		}
	}
	*/

	@Override
	public String toString() {
		return "Usuario [Nombre= " + nombre + ", Tiempo disponible en horas= " + tiempoDisponibleEnHoras
				+ ", Presupuesto= " + presupuesto + ", Atraccion preferida= " + atraccionPreferida + "]\n";
	}

}
