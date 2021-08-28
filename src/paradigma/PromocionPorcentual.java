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
	
	public int getDuracionDePromocionEnHoras() {
		return atraccion1.getDuracionEnHoras() + atraccion2.getDuracionEnHoras();
	}
	
	public double getPrecioPromocion() {
		double precio = atraccion1.getPrecio() + atraccion2.getPrecio();
		double descuento = precio * DESCUENTO;
		double precioTotal = precio - descuento;
		return precioTotal;
	} 
 
}
