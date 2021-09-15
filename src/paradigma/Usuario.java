package paradigma;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private int tiempoDisponibleEnHoras;
	private int presupuesto;
	private TipoDeAtraccion atraccionPreferida;
	private ArrayList<String> itinerario = new ArrayList<String>();
	private double costoTotalItinerario;
	private int tiempoTotalItinerario;

	public Usuario(String nombre, int tiempoDisponibleEnHoras, int presupuesto, TipoDeAtraccion atraccionPreferida) {
		this.nombre = nombre;
		this.tiempoDisponibleEnHoras = tiempoDisponibleEnHoras;
		this.presupuesto = presupuesto;
		this.atraccionPreferida = atraccionPreferida;
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

	public ArrayList<String> getItinerario() {
		return itinerario;
	}

	public double getCostoTotalItinerario() {
		return costoTotalItinerario;
	}

	public int getTiempoTotalItinerario() {
		return tiempoTotalItinerario;
	}

	public boolean puedeComprarSugerencia(Sugerencia sugerencia) {
		return this.presupuesto >= sugerencia.getPrecio()
				&& this.tiempoDisponibleEnHoras >= sugerencia.getDuracionEnHoras();
	}

	public synchronized void restarPresupuestoYtiempo(double precio, int horas) {
		this.presupuesto -= precio;
		this.tiempoDisponibleEnHoras -= horas;
	}

	public void agregarSugerenciaAlItinerario(Sugerencia sugerencia) {
		this.itinerario.add(sugerencia.getNombre() + ", Precio: " + sugerencia.getPrecio() + " fichas de Tomy y Daly"
				+ ", Duracion: " + sugerencia.getDuracionEnHoras() + " horas");
		this.costoTotalItinerario += sugerencia.getPrecio();
		this.tiempoTotalItinerario += sugerencia.getDuracionEnHoras();
		this.itinerario.add("\n");
		if (sugerencia.esPromocion()) {
			Promocion auxPromocion = (Promocion) sugerencia;
			for (Atraccion atraccionDePromocion : auxPromocion.getAtracciones()) {
				this.itinerario.add(atraccionDePromocion.getNombre() + ", Precio: " + atraccionDePromocion.getPrecio()
						+ " fichas de Tomy y Daly" + ", Duracion: " + atraccionDePromocion.getDuracionEnHoras()
						+ " horas");
				this.itinerario.add("\n");
			}
		}
	}

	@Override
	public String toString() {
		return "Nombre= " + nombre + ", Tiempo disponible= " + tiempoDisponibleEnHoras
				+ " horas, Presupuesto= " + presupuesto + " monedas de Tomy y Daly, Atraccion preferida= " + atraccionPreferida + "\n";
	}

}
