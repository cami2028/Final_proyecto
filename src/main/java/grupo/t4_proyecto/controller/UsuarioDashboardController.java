package grupo.t4_proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import grupo.t4_proyecto.model.Service.IUsuarioService;
import grupo.t4_proyecto.model.entidad.usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioDashboardController {
    @Autowired
    private IUsuarioService usuarioService;
    @RequestMapping("/")
    public String inicio(Model model){
        usuario usuario = new usuario();
        model.addAttribute("usuario", usuario);
        model.addAttribute("listaUsuarios", usuarioService.cargarUsuarios());
        return "dashboard/usuariosDashboard";
    }
    @RequestMapping("/registrar")
    public String registrarusuario(Model model){
        usuario usuario = new usuario();
        model.addAttribute("usuario", usuario);
        return "dashboard/Registrarseusu";
    }
    
    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(usuario usuario){
        usuarioService.guardarUsuario(usuario);
        return "redirect:/usuario/";
    }
    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id){
        usuarioService.eliminarUsuario(id);
        return "redirect:/usuario/";
    }
}
