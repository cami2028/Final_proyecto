package grupo.t4_proyecto.model.Service;

import java.util.List;

import grupo.t4_proyecto.model.entidad.usuario;

public interface IUsuarioService {
    public void guardarUsuario(usuario usuario);
    public List<usuario> cargarUsuarios();
    public void eliminarUsuario(Long id);
}
