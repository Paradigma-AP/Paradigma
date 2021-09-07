package paradigma;

public class Usuario {
	private String nombre;
	private int tiempoDisponibleEnHoras;
	private int presupuesto;
	private TipoDeAtraccion atraccionPreferida;

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

	@Override
	public String toString() {
		return "Usuario [Nombre= " + nombre + ", Tiempo disponible en horas= " + tiempoDisponibleEnHoras
				+ ", Presupuesto= " + presupuesto + ", Atraccion preferida= " + atraccionPreferida + "]\n";
	}

}
