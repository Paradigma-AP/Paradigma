package paradigma;

public class Atraccion {
	private String nombre;
	private int duracionEnHoras;
	private int precio;
	private int cupoDisponible;
	private TipoDeAtraccion tipoDeAtraccion;
	
	public Atraccion(String nombre, int duracionEnHoras, int precio, 
			int cupo, TipoDeAtraccion tipoDeAtraccion) {
		this.nombre = nombre;
		this.duracionEnHoras = duracionEnHoras;
		this.precio = precio;
		this.cupoDisponible = cupo;
		this.tipoDeAtraccion = tipoDeAtraccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Atraccion() {
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDuracionEnHoras(int duracionEnHoras) {
		this.duracionEnHoras = duracionEnHoras;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setCupoDisponible(int cupoDisponible) {
		this.cupoDisponible = cupoDisponible;
	}

	public void setTipoDeAtraccion(TipoDeAtraccion tipoDeAtraccion) {
		this.tipoDeAtraccion = tipoDeAtraccion;
	}

	@Override
	public String toString() {
		return "Atraccion [nombre=" + nombre + ", duracionEnHoras=" + duracionEnHoras + ", precio=" + precio
				+ ", cupoDisponible=" + cupoDisponible + ", tipoDeAtraccion=" + tipoDeAtraccion + "]";
	}

	public int getDuracionEnHoras() {
		return this.duracionEnHoras;
	}

	public int getPrecio() {
		return this.precio;
	}

	public int getCupoDisponible() {
		return this.cupoDisponible;
	}

	public TipoDeAtraccion getTipoDeAtraccion() {
		return this.tipoDeAtraccion;
	}
	
	public boolean estaLleno(){ 
			return cupoDisponible == 0;
	}

	public void restarCupo(){
		this.cupoDisponible -= 1;
	}

	
}
