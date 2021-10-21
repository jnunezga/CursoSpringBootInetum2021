package com.gabrielcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gabrielcode.service.IPersonaService;
import com.gabrielcode.service.PersonaServiceImplem;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {
	private static Logger log = LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	@Autowired
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//service = new PersonaServiceImplem();
		service.registrarHandler("Gabriel");
	}

}
