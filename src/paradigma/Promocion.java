package paradigma;

public abstract class Promocion {

	private String nombre;
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipoDePromocion(TipoDeAtraccion tipoDePromocion) {
		this.tipoDePromocion = tipoDePromocion;
	}

	private TipoDeAtraccion tipoDePromocion;

	public Promocion(String nombre, TipoDeAtraccion tipoDePromocion) {
		this.nombre = nombre;
		this.tipoDePromocion = tipoDePromocion;
	}
	
	public Promocion() {
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public TipoDeAtraccion getTipoDePromocion() {
		return this.tipoDePromocion;
	}
	
	public abstract double getPrecioPromocion();

	public abstract int getDuracionDePromocionEnHoras();
}
