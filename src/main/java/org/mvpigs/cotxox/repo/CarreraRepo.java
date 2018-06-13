package org.mvpigs.cotxox.repo;

import org.mvpigs.cotxox.domain.Carrera;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepo extends CrudRepository<Carrera, Long> {

}
