package com.domain.modelo.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.domain.modelo.Alumno;

public class AlumnoDAOTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAgregar() {
		Alumno alumno = new Alumno(0, "nombre", "apellido", "none", "github.com", "a@b.com", "observaciones");
		AlumnoDAO alumnoDao = new AlumnoDAO();
		
		try {
			alumnoDao.agregar(alumno);
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(false);
		}
	}

}
