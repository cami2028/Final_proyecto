package grupo.t4_proyecto.model.Service;

import java.util.List;

import grupo.t4_proyecto.model.entidad.contacto;

public interface IContactoService {
    public void guardarContacto(contacto contacto);
    public List<contacto> cargarContactos();
    public void eliminarContacto(Long contacto_id);

    
}
