package paradigma;

public class PromocionPorcentual extends Promocion {

	private Atraccion [] atracciones;
	private static final double DESCUENTO = 0.2;
	
	public PromocionPorcentual(String nombre, TipoDeAtraccion tipoDePromocion, Atraccion[] atracciones) {
		super(nombre, tipoDePromocion, atracciones);
	}
	
	//ver metodo 
	public double getPrecio() {
		int i = 0;
		int precio = 0;
		while (i < atracciones.length) {
		precio += atracciones[i].getPrecio();
			}
		double descuento = precio * DESCUENTO;
		double precioTotal = precio - descuento;
		return precioTotal;
	} 
 
}