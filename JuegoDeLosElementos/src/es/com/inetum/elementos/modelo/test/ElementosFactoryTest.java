package es.com.inetum.elementos.modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import es.com.inetum.elementos.modelo.ElementosFactory;
import es.com.inetum.elementos.modelo.Lagarto;
import es.com.inetum.elementos.modelo.Papel;
import es.com.inetum.elementos.modelo.Piedra;
import es.com.inetum.elementos.modelo.Spock;
import es.com.inetum.elementos.modelo.Tijera;

public class ElementosFactoryTest {
	// Pruebas
	Piedra piedra;
	Papel papel;
	Tijera tijera;
	Lagarto lagarto;
	Spock spock;

	@Before
	public void setUp() throws Exception {
		// Antes de cada test
		this.piedra = new Piedra();
		this.papel = new Papel();
		this.tijera = new Tijera();
		this.lagarto = new Lagarto();
		this.spock = new Spock();
	}

	@After
	public void tearDown() throws Exception {
		// Despu�s de cada test
		this.piedra = null;
		this.papel = null;
		this.tijera = null;
		this.lagarto = null;
		this.spock = null;
	}
	
	// Tests Comparar-Piedra
	@Test
	public void testCompararPiedraTijera() {
		assertEquals(1, piedra.comparar(tijera));
		assertEquals("Piedra gan� contra tijera", piedra.getDescripcionResultado());
	}
	
	@Test
	public void testCompararPiedraLagarto() {
		assertEquals(1, piedra.comparar(lagarto));
		assertEquals("Piedra gan� contra lagarto", piedra.getDescripcionResultado());
	}

	@Test
	public void testCompararPiedraPapel() {
		assertEquals(-1, piedra.comparar(papel));
		assertEquals("Piedra perdi� contra papel", piedra.getDescripcionResultado());
	}

	@Test
	public void testCompararPiedraSpock() {
		assertEquals(-1, piedra.comparar(spock));
		assertEquals("Piedra perdi� contra Spock", piedra.getDescripcionResultado());
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
	public void testCompararPapelSpock() {
		assertEquals(1, papel.comparar(spock));
		assertEquals("Papel gan� contra Spock", papel.getDescripcionResultado());
	}

	@Test
	public void testCompararPapelTijera() {
		assertEquals(-1, papel.comparar(tijera));
		assertEquals("Papel perdi� contra tijera", papel.getDescripcionResultado());
	}

	@Test
	public void testCompararPapelLagarto() {
		assertEquals(-1, papel.comparar(lagarto));
		assertEquals("Papel perdi� contra lagarto", papel.getDescripcionResultado());
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
	public void testCompararTijeraLagarto() {
		assertEquals(1, tijera.comparar(lagarto));
		assertEquals("Tijera gan� contra lagarto", tijera.getDescripcionResultado());
	}

	@Test
	public void testCompararTijeraPiedra() {
		assertEquals(-1, tijera.comparar(piedra));
		assertEquals("Tijera perdi� contra piedra", tijera.getDescripcionResultado());
	}

	@Test
	public void testCompararTijeraSpock() {
		assertEquals(-1, tijera.comparar(spock));
		assertEquals("Tijera perdi� contra Spock", tijera.getDescripcionResultado());
	}

	@Test
	public void testCompararTijeraTijera() {
		assertEquals(0, tijera.comparar(tijera));
		assertEquals("EMPATE", tijera.getDescripcionResultado());
	}
	
	// Tests Comparar-Lagarto
	@Test
	public void testCompararLagartoSpock() {
		assertEquals(1, lagarto.comparar(spock));
		assertEquals("Lagarto gan� contra Spock", lagarto.getDescripcionResultado());
	}

	@Test
	public void testCompararLagartoPapel() {
		assertEquals(1, lagarto.comparar(papel));
		assertEquals("Lagarto gan� contra papel", lagarto.getDescripcionResultado());
	}

	@Test
	public void testCompararLagartoPiedra() {
		assertEquals(-1, lagarto.comparar(piedra));
		assertEquals("Lagarto perdi� contra piedra", lagarto.getDescripcionResultado());
	}

	@Test
	public void testCompararLagartoTijera() {
		assertEquals(-1, lagarto.comparar(tijera));
		assertEquals("Lagarto perdi� contra tijera", lagarto.getDescripcionResultado());
	}

	@Test
	public void testCompararLagartoLagarto() {
		assertEquals(0, lagarto.comparar(lagarto));
		assertEquals("EMPATE", lagarto.getDescripcionResultado());
	}
	
	// Tests Comparar-Spock
	@Test
	public void testCompararSpockTijera() {
		assertEquals(1, spock.comparar(tijera));
		assertEquals("Spock gan� contra tijera", spock.getDescripcionResultado());
	}

	@Test
	public void testCompararSpockPiedra() {
		assertEquals(1, spock.comparar(piedra));
		assertEquals("Spock gan� contra piedra", spock.getDescripcionResultado());
	}

	@Test
	public void testCompararSpockPapel() {
		assertEquals(-1, spock.comparar(papel));
		assertEquals("Spock perdi� contra papel", spock.getDescripcionResultado());
	}

	@Test
	public void testCompararSpockLagarto() {
		assertEquals(-1, spock.comparar(lagarto));
		assertEquals("Spock perdi� contra lagarto", spock.getDescripcionResultado());
	}

	@Test
	public void testCompararSpockSpock() {
		assertEquals(0, spock.comparar(spock));
		assertEquals("EMPATE", spock.getDescripcionResultado());
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

	@Test
	public void testGetInstanceLagarto() {
		assertTrue(ElementosFactory.getInstance(3) instanceof Lagarto);
	}

	@Test
	public void testGetInstanceSpock() {
		assertTrue(ElementosFactory.getInstance(4) instanceof Spock);
	}

}
