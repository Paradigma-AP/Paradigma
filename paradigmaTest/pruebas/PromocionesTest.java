package pruebas;

import static org.junit.Assert.*;
import org.junit.Test;
import paradigma.Atraccion;
import paradigma.Promocion;
import paradigma.PromocionAbsoluta;
import paradigma.PromocionPorcentual;
import paradigma.PromocionTresPorDos;
import paradigma.TipoDeAtraccion;

public class PromocionesTest {

	@Test
	public void calcularPrecioDeAtraccionAbsoluta() {
		Atraccion a1 = new Atraccion("ElMonorriel", 1, 3, 1, TipoDeAtraccion.AVENTURA);
		Atraccion a2 = new Atraccion("LaFabricaDeCajas", 3, 2, 5, TipoDeAtraccion.AVENTURA);
		Atraccion [] atracciones = {a1,a2};
		Promocion promoAventura = new PromocionAbsoluta("PromoAventura", TipoDeAtraccion.AVENTURA, atracciones);
		
		double esperado = 2;
		double obtenido = promoAventura.getPrecio();
		
		assertEquals(esperado, obtenido, 0);
	}

	@Test
	public void calcularPrecioDeAtraccionPorcentual() {
		Atraccion a1 = new Atraccion("KrustyBurguer", 2, 4, 5, TipoDeAtraccion.GASTRONOMIA);
		Atraccion a2 = new Atraccion("TabernaDeMoe", 4, 6, 4, TipoDeAtraccion.GASTRONOMIA);
		Atraccion [] atracciones = {a1,a2};
		Promocion promoGastronomica = new PromocionPorcentual("PromoGastronomica", TipoDeAtraccion.GASTRONOMIA, atracciones);

		double esperado = 8;
		double obtenido = promoGastronomica.getPrecio();

		assertEquals(esperado, obtenido, 0);
	}
	
	@Test
	public void calcularPrecioDeAtraccionTresPorDos() {
		Atraccion a1 = new Atraccion("LaPlantaNuclear", 3, 2, 4, TipoDeAtraccion.VISITA_GUIADA);
		Atraccion a2 = new Atraccion("PenitenciariaDeSpringfield", 2, 4, 4, TipoDeAtraccion.VISITA_GUIADA);
		Atraccion a3 = new Atraccion("MuseoJeremiasSpringfield", 1, 1, 2, TipoDeAtraccion.VISITA_GUIADA);
		Atraccion [] atracciones2 = {a1,a2,a3};
		Promocion promoDePaseo = new PromocionTresPorDos("PromoDePaseo", TipoDeAtraccion.VISITA_GUIADA, atracciones2);
		
		double esperado = 6;
		double obtenido = promoDePaseo.getPrecio();
		
		assertEquals(esperado, obtenido, 0);
	}
	
	@Test
	public void calcularTiempoDePromociones() {
		Atraccion a1 = new Atraccion("LaPlantaNuclear", 3, 2, 4, TipoDeAtraccion.VISITA_GUIADA);
		Atraccion a2 = new Atraccion("PenitenciariaDeSpringfield", 2, 4, 4, TipoDeAtraccion.VISITA_GUIADA);
		Atraccion a3 = new Atraccion("MuseoJeremiasSpringfield", 1, 1, 2, TipoDeAtraccion.VISITA_GUIADA);
		Atraccion [] atracciones2 = {a1,a2,a3};
		Promocion promoDePaseo = new PromocionTresPorDos("PromoDePaseo", TipoDeAtraccion.VISITA_GUIADA, atracciones2);
		
		int esperado = 6;
		int obtenido = promoDePaseo.getDuracionEnHoras();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void verificarSiTieneCupo() {
		Atraccion a1 = new Atraccion("ElMonorriel", 1, 3, 1, TipoDeAtraccion.AVENTURA);
		Atraccion a2 = new Atraccion("LaFabricaDeCajas", 3, 2, 5, TipoDeAtraccion.AVENTURA);
		Atraccion [] atracciones = {a1,a2};
		Promocion promoAventura = new PromocionAbsoluta("PromoAventura", TipoDeAtraccion.AVENTURA, atracciones);
		
		assertTrue(promoAventura.tieneCupoDisponible());
	}
	
	@Test
	public void verificarSiRestaCupoDeAtracciones() {
		Atraccion a1 = new Atraccion("ElMonorriel", 1, 3, 1, TipoDeAtraccion.AVENTURA);
		Atraccion a2 = new Atraccion("LaFabricaDeCajas", 3, 2, 5, TipoDeAtraccion.AVENTURA);
		Atraccion [] atracciones = {a1,a2};
		Promocion promoAventura = new PromocionAbsoluta("PromoAventura", TipoDeAtraccion.AVENTURA, atracciones);
		
		promoAventura.restarCupo();
		int esperado = 0;
		int obtenido = a1.getCupoDisponible();
		
		int esperado2 = 4;
		int obtenido2 = a2.getCupoDisponible();
		
		assertEquals(esperado, obtenido);
		assertEquals(esperado2, obtenido2);
	}
	
	@Test
	public void calcularSiTieneCupo() {
		Atraccion a1 = new Atraccion("KrustyBurguer", 2, 4, 1, TipoDeAtraccion.GASTRONOMIA);
		Atraccion a2 = new Atraccion("TabernaDeMoe", 4, 6, 4, TipoDeAtraccion.GASTRONOMIA);
		Atraccion [] atracciones = {a1,a2};
		Promocion promoGastronomica = new PromocionPorcentual("PromoGastronomica", TipoDeAtraccion.GASTRONOMIA, atracciones);
		
		a1.restarCupo();

		assertFalse(promoGastronomica.tieneCupoDisponible());
	}
	

}
