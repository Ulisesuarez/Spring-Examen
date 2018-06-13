package org.mvpigs.cotxox.repo;

import java.util.List;

import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConductorRepo extends CrudRepository<Conductor, String>{

	//@Query("select * from t_conductores  where co_ocupado = ?1")
	public List<Conductor> findByOcupado(int i);

}
