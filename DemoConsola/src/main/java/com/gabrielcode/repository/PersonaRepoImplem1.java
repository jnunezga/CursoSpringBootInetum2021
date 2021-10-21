package com.gabrielcode.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("Persona1")
public class PersonaRepoImplem1 implements IPersona {
	private static Logger log = LoggerFactory.getLogger(PersonaRepoImplem1.class);

	@Override
	public void registrar(String pNombre) {
		log.info("Se registró: " + pNombre);
	}

}
