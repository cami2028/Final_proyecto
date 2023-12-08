package grupo.t4_proyecto.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupo.t4_proyecto.model.dao.IContactoDAO;
import grupo.t4_proyecto.model.entidad.contacto;

@Service
public class ContactoService implements IContactoService{
    
    @Autowired
    private IContactoDAO contactoDAO;

    @Override
    public void guardarContacto(contacto contacto){
        contactoDAO.save(contacto);
    }

    @Override
    public List<contacto> cargarContactos(){
        return(List<contacto>) contactoDAO.findAll();
    }

    @Override
    public void eliminarContacto(Long contacto_id ){
        contactoDAO.deleteById(contacto_id);
    }
}
