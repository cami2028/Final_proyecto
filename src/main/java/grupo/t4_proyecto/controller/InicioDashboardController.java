package grupo.t4_proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class InicioDashboardController {
    @RequestMapping("/")
    public String inicio(){
        return "dashboard/indexDashboard";
    }
}
