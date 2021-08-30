package paradigma;

public class PromocionAbsoluta extends Promocion {
	private Atraccion atraccion1;
	private Atraccion atraccion2;
	private static final double DESCUENTO = 10;

	
	public PromocionAbsoluta(String nombre, TipoDeAtraccion tipoDePromocion, Atraccion atraccion, Atraccion otraAtraccion ) {
		super(nombre, tipoDePromocion);
		this.atraccion1 = atraccion;
		this.atraccion2 = otraAtraccion;
	}
	
	public int getDuracionDePromocionEnHoras() {
		return atraccion1.getDuracionEnHoras() + atraccion2.getDuracionEnHoras();
	}
	
	@Override
	public double getPrecioPromocion() {
		return (atraccion1.getPrecio() + atraccion2.getPrecio()) - DESCUENTO;
	}  

}