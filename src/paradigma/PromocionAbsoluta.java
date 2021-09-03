package paradigma;

import java.util.Arrays;

public class PromocionAbsoluta extends Promocion {
	@Override
	public String toString() {
		return "PromocionAbsoluta [atracciones=" + Arrays.toString(atracciones) + ", getPrecioPromocion()="
				+ getPrecioPromocion() + ", getDuracionDePromocionEnHoras()=" + getDuracionDePromocionEnHoras() + "]";
	}

	private Atraccion[] atracciones;
	private static final double DESCUENTO = 3;


	public PromocionAbsoluta(String nombre, TipoDeAtraccion tipoDePromocion, 
			Atraccion[] atracciones ) {
		super(nombre, tipoDePromocion);
		this.atracciones = atracciones;
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