package grupo.t4_proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/Login")
    public String login(){
        return "Login";
    }
}
