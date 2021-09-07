package paradigma;

import java.util.Arrays;

public abstract class Promocion extends Sugerencia {

	private String nombre;
	private TipoDeAtraccion tipoDePromocion;
	

	private Atraccion[] atracciones;
	private boolean esPromocion = true;

	public Promocion(String nombre, TipoDeAtraccion tipoDePromocion, Atraccion[] atracciones) {
		super();
		this.nombre = nombre;
		this.tipoDePromocion = tipoDePromocion;
		this.atracciones = atracciones;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getDuracionEnHoras() {
		int i = 0;
		int duracion = 0;
		while (i < atracciones.length) {
		}
		return duracion += atracciones[i].getDuracionEnHoras();
	}

	public TipoDeAtraccion getTipoDeAtraccion() {
		return this.tipoDePromocion;
	}

	@Override
	public String toString() {
		return "Promocion [nombre=" + nombre + ", tipoDePromocion=" + tipoDePromocion + ", atracciones="
				+ Arrays.toString(atracciones) + "]";
	}
	
	public abstract double getPrecio();

	public boolean esPromocion() {
		return esPromocion;
	}

}
