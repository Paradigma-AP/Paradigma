package paradigma;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private int tiempoDisponibleEnHoras;
	private int presupuesto;
	private TipoDeAtraccion atraccionPreferida;
	private ArrayList<String> itinerario = new ArrayList<String>();

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

	public ArrayList<String> getItinerario() {
		return itinerario;
	}
	
	public void agregarSugerenciaAlItinerario(Sugerencia sugerencia) {
			this.itinerario.add("Nombre: "+ sugerencia.getNombre()+", Precio: "+ sugerencia.getPrecio()+", Duracion: " + sugerencia.getDuracionEnHoras());
		}
	
	

	@Override
	public String toString() {
		return "Usuario [Nombre= " + nombre + ", Tiempo disponible en horas= " + tiempoDisponibleEnHoras
				+ ", Presupuesto= " + presupuesto + ", Atraccion preferida= " + atraccionPreferida + "]\n";
	}

}
