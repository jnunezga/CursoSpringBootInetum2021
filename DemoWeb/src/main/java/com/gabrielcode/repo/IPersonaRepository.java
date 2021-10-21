package com.gabrielcode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielcode.model.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Integer> {

}
