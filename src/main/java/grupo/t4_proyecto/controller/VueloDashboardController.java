package grupo.t4_proyecto.controller;

import java.io.IOException;
import java.util.Base64;

import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import grupo.t4_proyecto.model.Service.IVueloService;
import grupo.t4_proyecto.model.entidad.vuelo;


@Controller
@RequestMapping("/vuelo")
public class VueloDashboardController {
    @Autowired
    private IVueloService vueloService;
    @RequestMapping("/")
    public String inicio(Model model){
        vuelo vuelo = new vuelo();
        model.addAttribute("vuelo", vuelo);
        model.addAttribute("listaVuelos", vueloService.cargarVuelos());
        return "dashboard/vuelosDashboard";
    }

    @RequestMapping("/registrar")
    public String registrarvuelo(Model model){
        vuelo vuelo = new vuelo();
        model.addAttribute("vuelo", vuelo);
        return "dashboard/Registrarsevuelo";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(@RequestParam("file") MultipartFile file, vuelo vuelo) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        if (fileName.contains("..")) {
            System.out.println("No es una imagen válida");
        }
        try {
            vuelo.setVuelo_imagen(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        vueloService.guardarVuelo(vuelo);
        return "redirect:/vuelo/";
    }
    
    @RequestMapping("/eliminar/{vuelo_id}")
    public String eliminar(@PathVariable(value = "vuelo_id") Long vuelo_id){
        vueloService.eliminarVuelo(vuelo_id);
        return "redirect:/vuelo/";
    }
}
