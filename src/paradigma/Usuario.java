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

	public boolean puedeComprarAtraccion(Sugerencia [] sugerencia) { 
		int i = 0;
		while(i < sugerencia.length) {
			boolean disponeDePresupuesto = this.presupuesto >= sugerencia[i].getPrecio();
			boolean disponeDeTiempo = this.tiempoDisponibleEnHoras >= sugerencia[i].getDuracionEnHoras();
			return disponeDePresupuesto && disponeDeTiempo;
		}
		return false;
	}

/*	public boolean puedeComprarPromocion(Promocion [] promocion) { 
		int i = 0;
		while(i < promocion.length) {
			boolean disponeDePresupuesto = this.presupuesto >= promocion[i].getPrecio();
			boolean disponeDeTiempo = this.tiempoDisponibleEnHoras >= promocion[i].getDuracionEnHoras();
			return disponeDePresupuesto && disponeDeTiempo;
		}
		return false;
	}*/

	public synchronized void restarPresupuestoYtiempo(int precio, int horas) {
		this.presupuesto -= precio;
		this.tiempoDisponibleEnHoras -= horas;
	}

	@Override
	public String toString() {
		return "Usuario [Nombre= " + nombre + ", Tiempo disponible en horas= " + tiempoDisponibleEnHoras + ", Presupuesto= "
				+ presupuesto + ", Atraccion preferida= " + atraccionPreferida + "]";
	}

}

