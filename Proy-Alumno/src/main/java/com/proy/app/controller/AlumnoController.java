package com.proy.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proy.app.interfaces.AlumnoRepository;
import com.proy.app.model.Alumno;

@RestController
public class AlumnoController {
	
	@Autowired
	AlumnoRepository alumnoRepository;

	@GetMapping("/alumno")
	private List<Alumno> consultarAlumno() {
		return alumnoRepository.findAll();
	}

	@GetMapping("/alumno/{id}")
	public Optional<Alumno> obtenerAlumnoById(@PathVariable("id") Integer id) {
		return alumnoRepository.findById(id);	
	}

	@PostMapping("/alumno")
	public Alumno crearActualizarAlumno(@RequestBody Alumno alumno) {
		if (alumno ==  null && !alumnoRepository.existsById(alumno.getCodigo())) {
			return alumnoRepository.save(alumno);
		}
		else
		{
			return alumnoRepository.save(alumno);
		}
	}

	@DeleteMapping("/alumno/{id}")
	public void eliminarAlumno(@PathVariable("id") Integer id) {
		alumnoRepository.deleteById(id);
	}

}
