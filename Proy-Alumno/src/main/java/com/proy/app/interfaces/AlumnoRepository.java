package com.proy.app.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proy.app.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>	{

}
