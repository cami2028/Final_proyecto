package grupo.t4_proyecto.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupo.t4_proyecto.model.dao.IVueloDAO;
import grupo.t4_proyecto.model.entidad.vuelo;

@Service
public class VueloService implements IVueloService {
    @Autowired
    private IVueloDAO vueloDAO;

    @Override
    public void guardarVuelo(vuelo vuelo){
        vueloDAO.save(vuelo);
    }

    @Override
    public List<vuelo> cargarVuelos(){
        return(List<vuelo>) vueloDAO.findAll();
    }

    @Override
    public void eliminarVuelo(Long vuelo_id){
        vueloDAO.deleteById(vuelo_id);
    }
}
