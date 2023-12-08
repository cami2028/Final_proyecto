package grupo.t4_proyecto.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupo.t4_proyecto.model.dao.ITourDAO;
import grupo.t4_proyecto.model.entidad.tour;

@Service
public class TourService implements ITourService {
    @Autowired
    private ITourDAO tourDAO;

    @Override
    public void guardarTour(tour tour){
        tourDAO.save(tour);
    }

    @Override
    public List<tour> cargarTours(){
        return(List<tour>) tourDAO.findAll();
    }

    @Override
    public void eliminarTour(Long tour_id){
        tourDAO.deleteById(tour_id);
    }
}
