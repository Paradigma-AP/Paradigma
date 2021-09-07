package paradigma;

import java.util.Comparator;

public class OrdenarParaSugerir  implements Comparator<Sugerencia> {
	TipoDeAtraccion atraccionFavorita;

	public OrdenarParaSugerir(TipoDeAtraccion atraccionFavorita) {
		this.atraccionFavorita = atraccionFavorita;
	}

	@Override
	public int compare(Sugerencia o1, Sugerencia o2) {
		// Prioridad atraccion favorita
		if (o1.getTipoDeAtraccion() == atraccionFavorita &&
				o2.getTipoDeAtraccion() != atraccionFavorita) {
			return 1;
		} else if (o1.getTipoDeAtraccion() != atraccionFavorita &&
				o2.getTipoDeAtraccion() == atraccionFavorita) {
			return -1;
		}

		// Prioridad promocion
		if (o1.esPromocion() && !o2.esPromocion()) {
			return 1;
		} else if (!o1.esPromocion() && o2.esPromocion()) {
			return -1;
		}

		// Prioridad por oro
		if(o1.getPrecio() > o2.getPrecio()) {
			return 1;
		}
		else if(o1.getPrecio() < o2.getPrecio()){
			return -1;
		}
		// Prioridad por tiempo
		return (int) (o1.getDuracionEnHoras() - o2.getDuracionEnHoras());
	}

}