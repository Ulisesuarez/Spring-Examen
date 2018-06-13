package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.repo.CarreraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CarreraService {
	@Autowired
	private CarreraRepo carreraRepo;
	
	public Long crearCarrera(String tarjeta, String origen, String destino, int tiempoCarrera, int tiempoEsperado) {
		Carrera carrera=new Carrera(tarjeta);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setTiempoCarrera(tiempoCarrera);
		carrera.setTiempoEsperado(tiempoEsperado);
		carreraRepo.save(carrera);
		return carrera.getId();
	}

	public Carrera recuperaCarrera(Long idCarrera) {
		
		return carreraRepo.findOne(idCarrera);
	}

	public void updateCarrera(Carrera carrera) {
		// TODO Auto-generated method stub
		
	}

}
