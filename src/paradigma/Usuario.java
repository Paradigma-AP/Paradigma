package paradigma;

public class Usuario {
	private String nombre;
	private int tiempoDisponibleEnHoras;
	private double presupuesto;
	private TipoDeAtraccion atraccionPreferida;

	
	public Usuario(String nombre, int tiempoDisponibleEnHoras, double presupuesto, TipoDeAtraccion atraccionPreferida) {
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
	public double getPresupuesto() {
		return this.presupuesto;
	}
	public TipoDeAtraccion getAtraccionPreferida() {
		return this.atraccionPreferida;
	}
	
	public void puedoComprar() { // si atraccion o promocion. get precio y get cupo <= this.presupuesto y this.tiempoDisp entonces si. 
	}
	
	public void elegirAtracciones() {
		// implementar
	}
	
	public void restarDineroDelPresupuesto() {
		//implementar
	}
	
	public void restarTiempoDisponible(){
		//implementar
	}
	
	
	
	

}
