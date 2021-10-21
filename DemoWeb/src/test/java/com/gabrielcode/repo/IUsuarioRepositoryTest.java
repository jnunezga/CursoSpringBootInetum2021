package com.gabrielcode.repo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.gabrielcode.model.Usuario;

import ch.qos.logback.core.encoder.Encoder;

@SpringBootTest
class IUsuarioRepositoryTest {
	@Autowired
	IUsuarioRepository usuRepo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAgregar() {
		Usuario usu = new Usuario(0, "Gabriel", encoder.encode("gcasas"));
		Usuario usuRetorno = usuRepo.save(usu);
		assertEquals(usu.getClave(), usuRetorno.getClave());
	}

}
