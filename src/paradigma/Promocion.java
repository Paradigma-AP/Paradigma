package paradigma;

import java.util.Arrays;

public abstract class Promocion {

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
		while (i <= atracciones.length) {
		}
		return duracion += atracciones[i].getDuracionEnHoras();
	}
	
	public abstract double getPrecioPromocion();

	@Override
	public String toString() {
		return "Promocion [Nombre= " + nombre + ", Atracciones= "
				+ Arrays.toString(atracciones) + ", Duracion de promocion en horas= " + getDuracionDePromocionEnHoras()
				+ ", Precio de la promocion= " + getPrecioPromocion() + "]";
	}

	

}
