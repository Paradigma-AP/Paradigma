package paradigma;

public class Usuario {
	private String nombre;
	private int tiempoDisponibleEnHoras;
	private int presupuesto;
	private TipoDeAtraccion atraccionPreferida;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", tiempoDisponibleEnHoras=" + tiempoDisponibleEnHoras + ", presupuesto="
				+ presupuesto + ", atraccionPreferida=" + atraccionPreferida + "]";
	}

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTiempoDisponibleEnHoras(int tiempoDisponibleEnHoras) {
		this.tiempoDisponibleEnHoras = tiempoDisponibleEnHoras;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public void setAtraccionPreferida(TipoDeAtraccion atraccionPreferida) {
		this.atraccionPreferida = atraccionPreferida;
	}

	public int getTiempoDisponibleEnHoras() {
		return this.tiempoDisponibleEnHoras;
	}
	public int getPresupuesto() {
		return this.presupuesto;
	}
	public TipoDeAtraccion getAtraccionPreferida() {
		return this.atraccionPreferida;
	}
	
	public boolean puedeComprarAtraccion(Atraccion atraccion) { 
		boolean disponeDePresupuesto = this.presupuesto >= atraccion.getPrecio();
		boolean disponeDeTiempo = this.tiempoDisponibleEnHoras >= atraccion.getDuracionEnHoras();
		return disponeDePresupuesto && disponeDeTiempo;
	}
	
	public boolean puedeComprarPromocion(Promocion promocion) { 
		boolean disponeDePresupuesto = this.presupuesto >= promocion.getPrecioPromocion();
		boolean disponeDeTiempo = this.tiempoDisponibleEnHoras >= promocion.getDuracionDePromocionEnHoras();
		return disponeDePresupuesto && disponeDeTiempo;
	}
	
	public synchronized void restarPresupuestoYtiempo(int precio, int horas) {
		this.presupuesto -= precio;
		this.tiempoDisponibleEnHoras -= horas;
	}


}

