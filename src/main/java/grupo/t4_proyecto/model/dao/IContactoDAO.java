package grupo.t4_proyecto.model.dao;

import org.springframework.data.repository.CrudRepository;

import grupo.t4_proyecto.model.entidad.contacto;

public interface IContactoDAO extends CrudRepository<contacto, Long>{

    
}