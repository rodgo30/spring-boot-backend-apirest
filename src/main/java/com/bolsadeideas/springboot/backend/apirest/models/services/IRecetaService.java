package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Receta;

public interface IRecetaService {
	
	public List<Receta> findAll();

	
	public Receta findById(Long id);

	public Receta save(Receta receta);
	
	public void delete(Long id);
}
