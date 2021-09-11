package paradigma;

import java.util.Arrays;

public abstract class Promocion extends Sugerencia {

	private String nombre;
	private TipoDeAtraccion tipoDePromocion;
	protected Atraccion[] atracciones;
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

	public Atraccion[] getAtracciones() {
		return atracciones;
	}

	public int getDuracionEnHoras() {
		int i = 0;
		int duracion = 0;
		while (i < atracciones.length) {
		duracion += atracciones[i].getDuracionEnHoras();
		i++;
		}
		return duracion;
	}
	
	public void restarCupo() {
		int i = 0;
		while (i < atracciones.length) {
		atracciones[i].restarCupo();
		i++;
		}
	}
	
	public boolean tieneCupoDisponible() {
		int i = 0;
		while (i < atracciones.length) {
		if (atracciones[i].tieneCupoDisponible()) {
			i++;
			}
		return true;
		}
		return false;
	}
	
	/*public boolean tieneCupoDisponible() {
		for(Atraccion atr : atracciones) {
			atr.tieneCupoDisponible();
	}
		return true;
	}*/
	
	public TipoDeAtraccion getTipoDeAtraccion() {
		return this.tipoDePromocion;
	}

	public abstract double getPrecio();

	public boolean esPromocion() {
		return esPromocion;
	}

	//AGREGAR ACA LOS DATOS DE ATRACCIONES PARA QUE ME LO GUARDE EN EL ARCHIVO. 
	@Override
	public String toString() {
		return "Promocion: Nombre= " + nombre + ", TipoDePromocion= " + tipoDePromocion + "\n Atracciones= "
				+ Arrays.toString(atracciones) + "\n";
	}

}
