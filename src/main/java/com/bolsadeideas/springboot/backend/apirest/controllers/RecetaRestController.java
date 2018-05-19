package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Receta;
import com.bolsadeideas.springboot.backend.apirest.models.services.IRecetaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class RecetaRestController {
	
	@Autowired
	private IRecetaService recetaService;

	@GetMapping("/recetas")
	public List<Receta> index(){
		return recetaService.findAll();
	}
	
	@GetMapping("/recetas/{id}")
	public Receta mostrar(@PathVariable Long id) {
		return recetaService.findById(id);
	}
	
	@PostMapping("/recetas")
	@ResponseStatus(HttpStatus.CREATED)
	public Receta crear(@RequestBody Receta receta) {	
		return recetaService.save(receta);
	}
	
	@PutMapping("/recetas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Receta actualizar(@RequestBody Receta receta, @PathVariable Long id) {
		Receta recetaActual = recetaService.findById(id);
		
		recetaActual.setNombre(receta.getNombre());
		recetaActual.setIngredientes(receta.getIngredientes());
		recetaActual.setPreparacion(receta.getPreparacion());
		
		return recetaService.save(recetaActual);
	}
	
	@DeleteMapping("/recetas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Long id) {
		recetaService.delete(id);
	}
}
