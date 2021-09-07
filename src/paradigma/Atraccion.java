package paradigma;

public class Atraccion extends Sugerencia {
	private String nombre;
	private int duracionEnHoras;
	private double precio;
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

	public TipoDeAtraccion getTipoDeAtraccion() {
		return tipoDeAtraccion;
	}

	public boolean estaLleno() {
		return cupoDisponible == 0;
	}

	public void restarCupo() {
		this.cupoDisponible -= 1;
	}

	@Override
	public String toString() {
		return "Atraccion [nombre=" + nombre + ", duracionEnHoras=" + duracionEnHoras + ", precio=" + precio
				+ ", cupoDisponible=" + cupoDisponible + ", tipoDeAtraccion=" + tipoDeAtraccion + "]\n";
	}

	public boolean esPromocion() {
		return esPromocion;
	}

}
