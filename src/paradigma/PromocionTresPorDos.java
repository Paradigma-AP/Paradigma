package paradigma;

public class PromocionTresPorDos extends Promocion {
	
	public PromocionTresPorDos(String nombre, TipoDeAtraccion tipoDePromocion, Atraccion[] atracciones) {
		super(nombre, tipoDePromocion, atracciones);
	}

	@Override
	public double getPrecio() {
		int i = 0;
		int precio = 0;
		while (i < atracciones.length) {
			precio += atracciones[i].getPrecio();
		}
		return precio;
	}

}
