package paradigma;

public abstract class Sugerencia {

	public abstract int getDuracionEnHoras();

	public abstract TipoDeAtraccion getTipoDeAtraccion();

	public abstract boolean esPromocion();

	public abstract double getPrecio();

	public abstract String getNombre();

	public abstract boolean estaLleno();
	
	public abstract void restarCupo();

	

}
