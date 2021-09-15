package pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import paradigma.Atraccion;
import paradigma.TipoDeAtraccion;

public class AtraccionesTest {
	
	Atraccion a1;
	
	@Before
	public void setUp() {
		 a1 = new Atraccion("ElMonorriel", 1, 3, 5, TipoDeAtraccion.AVENTURA);
	}

	@Test
	public void corroborarSiTieneCupoDisponible() {
		
		assertTrue(a1.tieneCupoDisponible());
	}
	
	@Test
	public void corroborarSiRestaCupo() {
		
		a1.restarCupo();
		
		int esperado = 4;
		int obtenido = a1.getCupoDisponible();
		
		assertEquals(esperado, obtenido);
	}
	
	

}
