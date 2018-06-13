package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Conductor;
import org.mvpigs.cotxox.repo.ConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ConductorService {

	@Autowired
	private ConductorRepo conductorRepo;
	
	public Conductor recuperarConductor(String id) {
		
		return conductorRepo.findOne(id);
	}

	public void init() {
		// TODO Auto-generated method stub
		
	}

	public Conductor recuperarConductorLibre() {
		// TODO Auto-generated method stub
		return null;
	}

}
