package com.gabrielcode.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("Persona2")
public class PersonaRepoImplem2 implements IPersona {
	private static Logger log = LoggerFactory.getLogger(PersonaRepoImplem2.class);

	@Override
	public void registrar(String pNombre) {
		log.info("Se registró felizmente: " + pNombre);
	}

}
