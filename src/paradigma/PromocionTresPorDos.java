package paradigma;

public class PromocionTresPorDos extends Promocion {
	
	private Atraccion[] atracciones;

	
	public PromocionTresPorDos(String nombre, TipoDeAtraccion tipoDePromocion, Atraccion[] atracciones) {
		super(nombre, tipoDePromocion, atracciones);
	}

	//VER METODO 
	public double getPrecioPromocion() {
		int i = 0;
		int precio = 0;
		while (i < atracciones.length) {
		}
		return precio += atracciones[i].getDuracionEnHoras();
	}

}
