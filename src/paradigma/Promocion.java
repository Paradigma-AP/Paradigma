package paradigma;

import java.util.Arrays;

public abstract class Promocion {

	private String nombre;
	private TipoDeAtraccion tipoDePromocion;
	private Atraccion[] atracciones;


	public Promocion(String nombre, TipoDeAtraccion tipoDePromocion, Atraccion[] atracciones) {
		super();
		this.nombre = nombre;
		this.tipoDePromocion = tipoDePromocion;
		this.atracciones = atracciones;
	}

	public int getDuracionDePromocionEnHoras() {
		int i = 0;
		int duracion = 0;
		while (i < atracciones.length) {
		}
		return duracion += atracciones[i].getDuracionEnHoras();
	}

	@Override
	public String toString() {
		return "Promocion [nombre=" + nombre + ", tipoDePromocion=" + tipoDePromocion + ", atracciones="
				+ Arrays.toString(atracciones) + "]";
	}
	
	public abstract double getPrecioPromocion();

}
