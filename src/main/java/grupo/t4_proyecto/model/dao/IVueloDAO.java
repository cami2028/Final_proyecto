package grupo.t4_proyecto.model.dao;

import org.springframework.data.repository.CrudRepository;

import grupo.t4_proyecto.model.entidad.vuelo;

public interface IVueloDAO extends CrudRepository<vuelo, Long> {
    
}
