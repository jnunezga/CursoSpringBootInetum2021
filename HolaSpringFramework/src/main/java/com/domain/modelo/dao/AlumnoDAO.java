package com.domain.modelo.dao;

import java.sql.*;
import java.util.List;

import com.domain.modelo.*;
import com.domain.util.ConnectionManager;

public class AlumnoDAO implements DAO {

	public AlumnoDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void agregar(Model model) throws ClassNotFoundException, SQLException {
		ConnectionManager.conectar();
		
		Connection conn = ConnectionManager.getConnection();
		String sql = "INSERT INTO inetum.alumnos (ALU_APELLIDO, ALU_NOMBRE, ALU_EMAIL, ALU_CONOCIMIENTOS, ALU_GIT, ALU_OBSERVACIONES) VALUES(?, ?, ?, ?, ?, ?)";
		
		Alumno alumno = (Alumno) model;
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, alumno.getApellido());
		ps.setString(2, alumno.getNombre());
		ps.setString(3, alumno.getEmail());
		ps.setString(4, alumno.getEstudios());
		ps.setString(5, alumno.getLinkRepositorio());
		ps.setString(6, alumno.getObservaciones());
		
		ps.execute();
		
		conn.close();
		ConnectionManager.desconectar();
	}

	@Override
	public void modificar(Model model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Model model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Model> leer(Model model) {
		// TODO Auto-generated method stub
		return null;
	}

}
