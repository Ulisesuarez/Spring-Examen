package org.mvpigs.cotxox.repo;

import java.util.List;

import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.data.repository.CrudRepository;

public interface ConductorRepo extends CrudRepository<Conductor, String>{

	public List<Conductor> findByOcupado(int i);

}
