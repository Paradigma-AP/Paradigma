package paradigma;

public class Atraccion extends Sugerencia {
	private String nombre;
	private int duracionEnHoras;
	private int precio;
	private int cupoDisponible;
	private TipoDeAtraccion tipoDeAtraccion;
	private boolean esPromocion = false;

	public Atraccion(String nombre, int duracionEnHoras, int precio, int cupo, TipoDeAtraccion tipoDeAtraccion) {
		this.nombre = nombre;
		this.duracionEnHoras = duracionEnHoras;
		this.precio = precio;
		this.cupoDisponible = cupo;
		this.tipoDeAtraccion = tipoDeAtraccion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDuracionEnHoras() {
		return duracionEnHoras;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCupoDisponible() {
		return cupoDisponible;
	}

	public boolean tieneCupoDisponible() {
		return this.cupoDisponible > 0;
	}

	public TipoDeAtraccion getTipoDeAtraccion() {
		return tipoDeAtraccion;
	}

	public void restarCupo() {
		this.cupoDisponible -= 1;
	}

	public boolean esPromocion() {
		return esPromocion;
	}

	@Override
	public String toString() {
		return " \nAtraccion: Nombre= " + nombre + ", Duracion= " + duracionEnHoras +" horas, Precio= " + precio
				+ "monedas de Tomy y Daly, Tipo De Atraccion= " + tipoDeAtraccion;
	}


}
