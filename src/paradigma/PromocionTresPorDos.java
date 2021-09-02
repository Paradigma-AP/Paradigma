package paradigma;

public class PromocionTresPorDos extends Promocion {
	private Atraccion atraccion1;
	private Atraccion atraccion2;
	private Atraccion atraccion3;

	public Atraccion getAtraccion1() {
		return atraccion1;
	}
	public void setAtraccion1(Atraccion atraccion1) {
		this.atraccion1 = atraccion1;
	}
	public Atraccion getAtraccion2() {
		return atraccion2;
	}
	public void setAtraccion2(Atraccion atraccion2) {
		this.atraccion2 = atraccion2;
	}
	public Atraccion getAtraccion3() {
		return atraccion3;
	}
	public void setAtraccion3(Atraccion atraccion3) {
		this.atraccion3 = atraccion3;
	}
	public PromocionTresPorDos(String nombre, TipoDeAtraccion tipoDePromocion, Atraccion atraccion, Atraccion otraAtraccion, Atraccion atraccionBonificada ) {
		super(nombre, tipoDePromocion);
		this.atraccion1 = atraccion;
		this.atraccion2 = otraAtraccion;
		this.atraccion3 = atraccionBonificada;
	}
	public PromocionTresPorDos() {
	
	}
	public int getDuracionDePromocionEnHoras() {
		return atraccion1.getDuracionEnHoras() + atraccion2.getDuracionEnHoras() + atraccion3.getDuracionEnHoras();
	}
	
	@Override
	public double getPrecioPromocion() {
		return atraccion1.getPrecio() + atraccion2.getPrecio();
	}  
	
}
