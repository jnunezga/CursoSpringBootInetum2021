package com.domain.modelo.dao;

import java.sql.SQLException;
import java.util.List;

import com.domain.modelo.*;

public interface DAO {
	public void agregar(Model model) throws ClassNotFoundException, SQLException;
	public void modificar(Model model) throws ClassNotFoundException, SQLException;
	public void eliminar(Model model) throws ClassNotFoundException, SQLException;
	public List<Model> leer(Model model) throws ClassNotFoundException, SQLException;
}
