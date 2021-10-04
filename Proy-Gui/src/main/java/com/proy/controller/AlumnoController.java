package com.proy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.proy.model.Alumno;
import com.proy.util.AbstractHandler;
import com.proy.util.JsonMessageResult;

@RestController
public class AlumnoController extends AbstractHandler {

	@Autowired
	RestTemplate restTemplate;

	private static final String url = "https://proyservice.herokuapp.com/alumno";

	@GetMapping("/alumno")
	public JsonMessageResult consultarAlumno() {
		try {
			ResponseEntity<List<Alumno>> res = restTemplate.exchange(url, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<Alumno>>() {
					});

			return resultSuccessList(res.getBody());
		} catch (Exception e) {
			return resultFail(e.getMessage());
		}

	}

	@GetMapping(value = "/alumno/{id}")
	public JsonMessageResult obtenerAlumnoById(@PathVariable("id") Integer id) {
		try {
			RestTemplate restTemplate = new RestTemplate();
			Alumno res = restTemplate.getForObject(url + "/" + id, Alumno.class);

			return resultSuccessList(res);
		} catch (Exception e) {
			return resultFail(e.getMessage());
		}

	}

	@PostMapping(value = "/alumno", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public JsonMessageResult registrarAlumno(@RequestBody Alumno alumno) {
		int edadLimite = 50;
		try {
			if (alumno.equals(null)) {
				return result("Ingresar datos del Alumno.");

			} else {
				if (alumno.getEdad() > edadLimite) {
					RestTemplate restTemplate = new RestTemplate();
					HttpEntity<Alumno> request = new HttpEntity<>(alumno);
					Alumno res = restTemplate.postForObject(url, request, Alumno.class);
					return resultSuccessList(res);
				} else {
					return result("Ingresar solo personas mayores de " + edadLimite + " años.");
				}
			}
		} catch (Exception e) {
			return resultFail(e.getMessage());
		}

	}

	@PutMapping(value = "/alumno", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public JsonMessageResult actualizarAlumno(@RequestBody Alumno alumno) {

		try {
			if (alumno.getCodigo() == null) {
				return result("Ingrese código del alumno.");

			} else {

				RestTemplate restTemplate = new RestTemplate();
				HttpEntity<Alumno> request = new HttpEntity<>(alumno);
				restTemplate.postForObject(url, request, Alumno.class);
				return resultSuccessUpdate(alumno);

			}
		} catch (Exception e) {
			return resultFail(e.getMessage());
		}
	}

	@DeleteMapping(value = "/alumno/{id}")
	public JsonMessageResult eliminarAlumno(@PathVariable("id") Integer id) {
		try {
			if (id == null) {
				return result("Ingrese código del alumno.");

			} else {
				RestTemplate restTemplate = new RestTemplate();
				Alumno alumno = restTemplate.getForObject(url + "/" + id, Alumno.class);

				if (alumno== null) {
					return result("No existe el código ingresado.");
				}else
				{
					HttpEntity<Integer> request = new HttpEntity<>(id);
					restTemplate.delete(url + "/" + id, request);
					return resultSuccessDelete(alumno);
				}
			}
		}
		catch (Exception e) {
			return resultFail(e.getMessage());
		}
	}
}
