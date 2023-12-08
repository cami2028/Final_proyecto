package grupo.t4_proyecto.model.Service;

import java.util.List;

import grupo.t4_proyecto.model.entidad.tour;

public interface ITourService {
    public void guardarTour(tour tour);
    public List<tour> cargarTours();
    public void eliminarTour(Long tour_id);
}
