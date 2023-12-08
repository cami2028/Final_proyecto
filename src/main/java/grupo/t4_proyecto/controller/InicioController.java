package grupo.t4_proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import grupo.t4_proyecto.model.Service.IContactoService;
import grupo.t4_proyecto.model.Service.IHotelService;
import grupo.t4_proyecto.model.Service.ITourService;
import grupo.t4_proyecto.model.Service.IVueloService;
import grupo.t4_proyecto.model.entidad.contacto;
import grupo.t4_proyecto.model.entidad.hotel;
import grupo.t4_proyecto.model.entidad.tour;
import grupo.t4_proyecto.model.entidad.vuelo;

@Controller
public class InicioController {
    /*Index*/
    @RequestMapping("/")
    public String index(){
        return "Index";
    }
  
    @Autowired
    private IContactoService contactoService;   
     /*Contacto*/
    @RequestMapping("/Contacto")
    public String Contacto(Model Model){
        contacto contacto = new contacto();
        Model.addAttribute("contacto", contacto);
        return "Contacto";
    }   
    
    @RequestMapping(value = "/Contacto/guardar", method = RequestMethod.POST)
    public String guardar( @ModelAttribute("contacto") contacto contacto){
        contactoService.guardarContacto(contacto);
        return "redirect:/Contacto";
    }
   

     /*Hoteles*/
    @Autowired
     private IHotelService hotelService;
    @RequestMapping("/Hoteles")
    public String Hoteles(Model model){
        hotel Hoteles = new hotel();
        model.addAttribute("hotel", Hoteles);
        model.addAttribute("listaHotels", hotelService.cargarHotels());
        return "Hoteles";
    }
     /*Tours*/
     @Autowired
     private ITourService tourService;
    @RequestMapping("/Tours")
    public String Tours(Model model){
        tour tour = new tour();
        model.addAttribute("tour", tour);
        model.addAttribute("listaTour", tourService.cargarTours());
        return "Tours";
    }
     /*Vuelos*/
     @Autowired
    private IVueloService vueloService;
    @RequestMapping("/Vuelos")
    public String Vuelos(Model model){
        vuelo vuelo = new vuelo();
        model.addAttribute("vuelo", vuelo);
        model.addAttribute("listaVuelos", vueloService.cargarVuelos());
        return "Vuelos";
    }
}