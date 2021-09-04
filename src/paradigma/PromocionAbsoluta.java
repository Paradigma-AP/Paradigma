package paradigma;



public class PromocionAbsoluta extends Promocion {

	private Atraccion[] atracciones;
	private static final double DESCUENTO = 3;

	public PromocionAbsoluta(String nombre, TipoDeAtraccion tipoDePromocion, Atraccion[] atracciones) {
		super(nombre, tipoDePromocion, atracciones);
	}

	//ver metodo
	public double getPrecioPromocion() {
		int i = 0;
		int precio = 0;
		while (i < atracciones.length) {
		precio += atracciones[i].getPrecio();
			}
		return precio - DESCUENTO;
	}

}