package es.com.inetum.elementos.modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
		// Después de cada test
		this.piedra = null;
		this.papel = null;
		this.tijera = null;
	}

	@Test
	public void testCompararPiedraTijera() {
		assertEquals(1, piedra.comparar(tijera));
	}

	@Test
	public void testCompararPiedraPapel() {
		assertEquals(-1, piedra.comparar(papel));
	}

	@Test
	public void testCompararPiedraPiedra() {
		assertEquals(0, piedra.comparar(piedra));
	}

	@Test
	public void testGetInstance() {
		fail("Not yet implemented");
	}

}
