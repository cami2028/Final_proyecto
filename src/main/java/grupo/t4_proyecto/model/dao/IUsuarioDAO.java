package grupo.t4_proyecto.model.dao;

import org.springframework.data.repository.CrudRepository;

import grupo.t4_proyecto.model.entidad.usuario;

public interface IUsuarioDAO extends CrudRepository<usuario, Long>{
    public usuario findByUsername(String username);

}
