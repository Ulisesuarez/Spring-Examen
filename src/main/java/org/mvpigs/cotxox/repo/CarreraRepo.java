package org.mvpigs.cotxox.repo;

import javax.transaction.Transactional;

import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepo extends CrudRepository<Carrera, Long> {
	@Transactional
	@Modifying
	@Query(value ="update t_carreras set c_conductor= ?1  where c_id= ?2 ;", nativeQuery = true)
	public void updateConductor(Conductor conductor, long i);

}
