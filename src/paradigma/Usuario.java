package paradigma;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nombre;
	private int tiempoDisponibleEnHoras;
	private int presupuesto;
	private TipoDeAtraccion atraccionPreferida;
	private ArrayList<Sugerencia> itinerario;

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

	public String getNombre() {
		return nombre;
	}

	public int getTiempoDisponibleEnHoras() {
		return tiempoDisponibleEnHoras;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public TipoDeAtraccion getAtraccionPreferida() {
		return atraccionPreferida;
	}

	public synchronized void restarPresupuestoYtiempo(double precio, int horas) {
		this.presupuesto -= precio;
		this.tiempoDisponibleEnHoras -= horas;
	}

	public ArrayList<Sugerencia> getItinerario() {
		return itinerario;
	}

	public void comprarSugerencias(Sugerencia sugerencia) {
		char respuesta;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Acepta S/N?");
		respuesta = sc.nextLine().charAt(0);
		sc.close();
		if (respuesta == 'S') {
			this.itinerario.add(sugerencia);
		}
	}
	
	

	@Override
	public String toString() {
		return "Usuario [Nombre= " + nombre + ", Tiempo disponible en horas= " + tiempoDisponibleEnHoras
				+ ", Presupuesto= " + presupuesto + ", Atraccion preferida= " + atraccionPreferida + "]\n";
	}

}
