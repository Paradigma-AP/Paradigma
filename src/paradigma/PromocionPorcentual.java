package paradigma;

public class PromocionPorcentual extends Promocion {
	private Atraccion atraccion1;
	private Atraccion atraccion2;
	private static final double DESCUENTO = 0.2;
	
	public PromocionPorcentual(String nombre, TipoDeAtraccion tipoDePromocion, 
			Atraccion atraccion, Atraccion otraAtraccion ) {
		super(nombre, tipoDePromocion);
		this.atraccion1 = atraccion;
		this.atraccion2 = otraAtraccion;
	}
	public PromocionPorcentual () {
	}
	
	public Atraccion getAtraccion1() {
		return atraccion1;
	}
	public void setAtraccion1(Atraccion atraccion1) {
		this.atraccion1 = atraccion1;
	}
	public Atraccion getAtraccion2() {
		return atraccion2;
	}
	public void setAtraccion2(Atraccion atraccion2) {
		this.atraccion2 = atraccion2;
	}
	public int getDuracionDePromocionEnHoras() {
		return atraccion1.getDuracionEnHoras() + atraccion2.getDuracionEnHoras();
	}
	
	@Override
	public double getPrecioPromocion() {
		double precio = atraccion1.getPrecio() + atraccion2.getPrecio();
		double descuento = precio * DESCUENTO;
		double precioTotal = precio - descuento;
		return precioTotal;
	} 
 
}