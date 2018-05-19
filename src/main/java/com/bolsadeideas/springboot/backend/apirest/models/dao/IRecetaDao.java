package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Receta;;

public interface IRecetaDao extends CrudRepository<Receta, Long> {

	@SuppressWarnings("unchecked")
	Receta save(Receta receta);
}
