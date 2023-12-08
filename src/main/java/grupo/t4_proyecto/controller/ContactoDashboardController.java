package grupo.t4_proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import grupo.t4_proyecto.model.Service.IContactoService;
import grupo.t4_proyecto.model.entidad.contacto;

@Controller
@RequestMapping("/contacto")
public class ContactoDashboardController {
  @Autowired
 private IContactoService contactoService;
    @RequestMapping("/")
    public String inicio(Model model){
        contacto contacto = new contacto();
        model.addAttribute("contacto", contacto);
        model.addAttribute("listaContactos", contactoService.cargarContactos());
        return "dashboard/contactoDashboard";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String contac(contacto contacto){
        contactoService.guardarContacto(contacto);
        return "redirect:/contacto/";
    }
    @RequestMapping("/eliminar/{contacto_id}")
    public String eliminar(@PathVariable(value = "contacto_id") Long contacto_id){
        contactoService.eliminarContacto(contacto_id);
        return "redirect:/contacto/";
    }
}
