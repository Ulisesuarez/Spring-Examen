package org.mvpigs.cotxox.service;


import java.util.List;

import javax.annotation.PostConstruct;

import org.mvpigs.cotxox.domain.Conductor;
import org.mvpigs.cotxox.repo.ConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ConductorService {

	@Autowired
	private ConductorRepo conductorRepo;
	/**
	 * Modifica el servei de l'entitat conductor amb un mètode init() per a inserir 
	 * a la base de dades les conductores següents, totes dues desocupades:
	 * String[] nombres = {"Sabrina", "Cici"};
	 * String[] matricula = {"5DHJ444", "7JKK555"};
	 * String[] modelos = {"Toyota Prius", "Mercedes A"} 
	 */
	
	//@PostConstruct
	public void init() {
		Conductor conductor =new Conductor("2222222222222222");
		conductor.setNombre("Sabrina");
		conductor.setMatricula("5DHJ444");
		conductor.setModelo("Toyota Prius");
		//conductor.setOcupado(false);
		Conductor conductor2 =new Conductor("3333333333333333");
		conductor2.setNombre("Cici");
		conductor2.setMatricula("7JKK555");
		conductor2.setModelo("Mercedes A");
		conductor2.setOcupado(false);
		conductorRepo.save(conductor);
		conductorRepo.save(conductor2);
	}
	
	public Conductor recuperarConductor(String id) {
		
		return conductorRepo.findOne(id);
	}

	public void crearConductor( String id, String nombre, String matricula, String modelo) {
		Conductor conductor =new Conductor(id);
		conductor.setNombre(nombre);
		conductor.setMatricula(matricula);
		conductor.setModelo(modelo);
		conductorRepo.save(conductor);
	}
	

	public Conductor recuperarConductorLibre() {
		List<Conductor> condlist=conductorRepo.findByOcupado(0);
		
		if(condlist.isEmpty()) {
			return null;
		} else {
		return condlist.get(0);
	}
	}
}
