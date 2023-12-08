package grupo.t4_proyecto.model.Service;

import java.util.List;

import grupo.t4_proyecto.model.entidad.vuelo;

public interface IVueloService {
    public void guardarVuelo(vuelo vuelo);
    public List<vuelo> cargarVuelos();
    public void eliminarVuelo(Long vuelo_id);
}
