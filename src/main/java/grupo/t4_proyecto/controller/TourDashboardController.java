package grupo.t4_proyecto.controller;


import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import grupo.t4_proyecto.model.Service.ITourService;
import grupo.t4_proyecto.model.entidad.tour;

@Controller
@RequestMapping("/tour")
public class TourDashboardController {
    @Autowired
    private ITourService tourService;
    @RequestMapping("/")
    public String inicio(Model model){
        tour tour = new tour();
        model.addAttribute("tour", tour);
        model.addAttribute("listaTours", tourService.cargarTours());
        return "dashboard/toursDashboard";
    }
    @RequestMapping("/registrar")
    public String registrartour(Model model){
        tour tour = new tour();
        model.addAttribute("tour", tour);
        return "dashboard/Registrarsetour";
    }

     @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(@RequestParam("file") MultipartFile file, tour tour){
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        if (fileName.contains("..")) {
            System.out.println("No es una imagen válida");
        }
        try {
            tour.setTour_imagen(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }        
        tourService.guardarTour(tour);
        return "redirect:/tour/";
    }
    @RequestMapping("/eliminar/{tour_id}")
    public String eliminar(@PathVariable(value = "tour_id") Long tour_id){
        tourService.eliminarTour(tour_id);
        return "redirect:/tour/";
    }
}
