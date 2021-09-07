package paradigma;

public abstract class Sugerencia {
	
		public abstract int getDuracionEnHoras();
		public abstract TipoDeAtraccion getTipoDeAtraccion();
		public abstract boolean esPromocion();
		public abstract double getPrecio();
		public abstract String getNombre();

		
		@Override
		public String toString() {
			return "Sugerencia [nombre=" + getNombre() + ", duracionEnHoras=" + getDuracionEnHoras() + ", precio=" + getPrecio()
					 + ", tipoDeAtraccion=" + getTipoDeAtraccion() + "]";
		}
		
}
