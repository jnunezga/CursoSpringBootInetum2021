package es.com.inetum.elementos.modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import es.com.inetum.elementos.modelo.ElementosFactory;
import es.com.inetum.elementos.modelo.Papel;
import es.com.inetum.elementos.modelo.Piedra;
import es.com.inetum.elementos.modelo.Tijera;

public class ElementosFactoryTest {
	// Pruebas
	Piedra piedra;
	Papel papel;
	Tijera tijera;

	@Before
	public void setUp() throws Exception {
		// Antes de cada test
		this.piedra = new Piedra();
		this.papel = new Papel();
		this.tijera = new Tijera();
	}

	@After
	public void tearDown() throws Exception {
		// Despu�s de cada test
		this.piedra = null;
		this.papel = null;
		this.tijera = null;
	}
	
	// Tests Comparar-Piedra
	@Test
	public void testCompararPiedraTijera() {
		assertEquals(1, piedra.comparar(tijera));
		assertEquals("Piedra gan� contra tijera", piedra.getDescripcionResultado());
	}

	@Test
	public void testCompararPiedraPapel() {
		assertEquals(-1, piedra.comparar(papel));
		assertEquals("Piedra perdi� contra papel", piedra.getDescripcionResultado());
	}

	@Test
	public void testCompararPiedraPiedra() {
		assertEquals(0, piedra.comparar(piedra));
		assertEquals("EMPATE", piedra.getDescripcionResultado());
	}
	
	// Tests Comparar-Papel
	@Test
	public void testCompararPapelPiedra() {
		assertEquals(1, papel.comparar(piedra));
		assertEquals("Papel gan� contra piedra", papel.getDescripcionResultado());
	}

	@Test
	public void testCompararPapelTijera() {
		assertEquals(-1, papel.comparar(tijera));
		assertEquals("Papel perdi� contra tijera", papel.getDescripcionResultado());
	}

	@Test
	public void testCompararPapelPapel() {
		assertEquals(0, papel.comparar(papel));
		assertEquals("EMPATE", papel.getDescripcionResultado());
	}
	
	// Tests Comparar-Tijera
	@Test
	public void testCompararTijeraPapel() {
		assertEquals(1, tijera.comparar(papel));
		assertEquals("Tijera gan� contra papel", tijera.getDescripcionResultado());
	}

	@Test
	public void testCompararTijeraPiedra() {
		assertEquals(-1, tijera.comparar(piedra));
		assertEquals("Tijera perdi� contra piedra", tijera.getDescripcionResultado());
	}

	@Test
	public void testCompararTijeraTijera() {
		assertEquals(0, tijera.comparar(tijera));
		assertEquals("EMPATE", tijera.getDescripcionResultado());
	}	

	// Tests GetInstance
	@Test
	public void testGetInstancePiedra() {
		assertTrue(ElementosFactory.getInstance(0) instanceof Piedra);
	}

	@Test
	public void testGetInstancePapel() {
		assertTrue(ElementosFactory.getInstance(1) instanceof Papel);
	}

	@Test
	public void testGetInstanceTijera() {
		assertTrue(ElementosFactory.getInstance(2) instanceof Tijera);
	}

}
