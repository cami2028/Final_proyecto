package grupo.t4_proyecto.controller;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;

import grupo.t4_proyecto.model.Service.IHotelService;
import grupo.t4_proyecto.model.entidad.hotel;

@Controller
@RequestMapping("/hotel")
public class HotelDashboardController {
    @Autowired
    private IHotelService hotelService;
    @RequestMapping("/")
    public String inicio(Model model){
        hotel hotel = new hotel();
        model.addAttribute("hotel", hotel);
        model.addAttribute("listaHotels", hotelService.cargarHotels());
        return "dashboard/hotelesDashboard";
    }
    @RequestMapping("/registrar")
    public String registrarhotel(Model model){
        hotel hotel = new hotel();
        model.addAttribute("hotel", hotel);
        return "dashboard/Registrarsehotel";
    }
    
     @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(@RequestParam("file") MultipartFile file ,hotel hotel){
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        if (fileName.contains("..")) {
            System.out.println("No es una imagen válida");
        }
        try {
            hotel.setHotel_imagen(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }     
        hotelService.guardarHotel(hotel);
        return "redirect:/hotel/";
    }
    @RequestMapping("/eliminar/{hotel_id}")
    public String eliminar(@PathVariable(value = "hotel_id") Long hotel_id){
        hotelService.eliminarHotel(hotel_id);
        return "redirect:/hotel/";
    }
}
