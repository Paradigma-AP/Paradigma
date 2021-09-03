package paradigma;

import java.util.Arrays;

public class Promocion {

	private String nombre;
	private TipoDeAtraccion tipoDePromocion;
	private Atraccion[] atracciones;

	public Promocion(String nombre, TipoDeAtraccion tipoDePromocion) {
		this.nombre = nombre;
		this.tipoDePromocion = tipoDePromocion;
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
	
	//public abstract double getPrecioPromocion();


	

}
