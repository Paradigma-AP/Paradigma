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
