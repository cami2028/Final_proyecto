package grupo.t4_proyecto.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupo.t4_proyecto.model.dao.IHotelDAO;
import grupo.t4_proyecto.model.entidad.hotel;

@Service
public class HotelService implements IHotelService {
    @Autowired
    private IHotelDAO hotelDAO;

    @Override
    public void guardarHotel(hotel hotel){
        hotelDAO.save(hotel);
    }

    @Override
    public List<hotel> cargarHotels(){
        return(List<hotel>) hotelDAO.findAll();
    }

    @Override
    public void eliminarHotel(Long hotel_id){
        hotelDAO.deleteById(hotel_id);
    }
}
