package paradigma;

public class Atraccion {
	private String nombre;
	private int duracionEnHoras;
	private double precio;
	private int cupoDisponible;
	private TipoDeAtraccion tipoDeAtraccion;
	private boolean vendida;
	
	public Atraccion(String nombre, int duracionEnHoras, double precio, 
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

	public double getPrecio() {
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
		
	public boolean vendida() {
		return this.vendida;
	}
	
	public void restarCupo(){
		if (vendida == true) {
			this.cupoDisponible -= 1;
		}
	}
	
	public boolean puedeVenderse() {
		return !this.estaLleno();
	}
	
} 
