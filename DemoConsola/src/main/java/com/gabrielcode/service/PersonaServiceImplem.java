package com.gabrielcode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gabrielcode.repository.IPersona;

@Service
public class PersonaServiceImplem implements IPersonaService {
	@Autowired
	@Qualifier("Persona2")
	IPersona repo;

	@Override
	public void registrarHandler(String pNombre) {
		repo.registrar(pNombre);
	}
}