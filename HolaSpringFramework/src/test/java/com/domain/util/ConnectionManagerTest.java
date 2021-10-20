package com.domain.util;

import static org.junit.Assert.*;

import java.sql.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConnectionManagerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConectar() {		
		try {
			ConnectionManager.conectar();
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(false);
		}
	}
	
	@Test
	public void testDesconectar() {		
		try {
			ConnectionManager.conectar();
			ConnectionManager.desconectar();
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(false);
		}
	}

}
