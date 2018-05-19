package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IRecetaDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Receta;

@Service
public class RecetaServicesImpl implements IRecetaService {

	@Autowired
	private IRecetaDao recetaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Receta> findAll() {
		return (List<Receta>) recetaDao.findAll();
	}

	@Override
	@Transactional
	public Receta save(Receta receta) {

		return this.recetaDao.save(receta);
	}

	@Override
	@Transactional(readOnly = true)
	public Receta findById(Long id) {
		
		return recetaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		
		recetaDao.deleteById(id);
	}


}
