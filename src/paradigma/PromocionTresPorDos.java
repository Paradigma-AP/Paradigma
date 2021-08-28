package paradigma;

public class PromocionTresPorDos extends Promocion {
	private Atraccion atraccion1;
	private Atraccion atraccion2;
	private Atraccion atraccion3;

	public PromocionTresPorDos(String nombre, TipoDeAtraccion tipoDePromocion, Atraccion atraccion, Atraccion otraAtraccion, Atraccion atraccionBonificada ) {
		super(nombre, tipoDePromocion);
		this.atraccion1 = atraccion;
		this.atraccion2 = otraAtraccion;
		this.atraccion3 = atraccionBonificada;
	}
	
	public int getDuracionDePromocionEnHoras() {
		return atraccion1.getDuracionEnHoras() + atraccion2.getDuracionEnHoras() + atraccion3.getDuracionEnHoras();
	}
	
	public double getPrecioPromocion() {
		return atraccion1.getPrecio() + atraccion2.getPrecio();
	}  
	
}
