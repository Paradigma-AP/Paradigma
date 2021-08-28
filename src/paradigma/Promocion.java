package paradigma;

public class Promocion {

	private String nombre;
	private TipoDeAtraccion tipoDePromocion;

	public Promocion(String nombre, TipoDeAtraccion tipoDePromocion) {
		this.nombre = nombre;
		this.tipoDePromocion = tipoDePromocion;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public TipoDeAtraccion getTipoDePromocion() {
		return this.tipoDePromocion;
	}

	
}
