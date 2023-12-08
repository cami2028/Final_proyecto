package grupo.t4_proyecto.model.Service;

import java.util.List;

import grupo.t4_proyecto.model.entidad.hotel;

public interface IHotelService {
    public void guardarHotel(hotel hotel);
    public List<hotel> cargarHotels();
    public void eliminarHotel(Long hotel_id);
}
