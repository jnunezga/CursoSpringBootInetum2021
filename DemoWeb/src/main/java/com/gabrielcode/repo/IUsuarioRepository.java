package com.gabrielcode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielcode.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
	Usuario findByNombre(String username);
}
