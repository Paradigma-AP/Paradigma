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

	public String getNombre() {
		return this.nombre;
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
