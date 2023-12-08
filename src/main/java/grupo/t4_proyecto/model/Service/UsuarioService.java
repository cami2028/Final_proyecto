package grupo.t4_proyecto.model.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import grupo.t4_proyecto.model.dao.IUsuarioDAO;
import grupo.t4_proyecto.model.entidad.usuario;

@Service
public class UsuarioService implements IUsuarioService{
    
    private final IUsuarioDAO usuarioDAO;
    private final BCryptPasswordEncoder passwordEncoder;

    public UsuarioService(IUsuarioDAO usuarioDAO, BCryptPasswordEncoder passwordEncoder) {
        this.usuarioDAO = usuarioDAO;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void guardarUsuario(usuario usuario){
        String passwordEncriptado = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(passwordEncriptado);
        usuarioDAO.save(usuario);
    }

    @Override
    public List<usuario> cargarUsuarios(){
        return(List<usuario>) usuarioDAO.findAll();
    }

    @Override
    public void eliminarUsuario(Long id){
        usuarioDAO.deleteById(id);
    }
}
