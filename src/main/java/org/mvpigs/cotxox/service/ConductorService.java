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
	public void crearConductor( String id, String nombre, String matricula, String modelo) {
		Conductor conductor =new Conductor(id);
		conductor.setNombre(nombre);
		conductor.setMatricula(matricula);
		conductor.setModelo(modelo);
		conductorRepo.save(conductor);
	}
	

	public Conductor recuperarConductorLibre() {
		// TODO Auto-generated method stub
		return null;
	}

}
