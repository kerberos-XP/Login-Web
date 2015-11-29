package golanweb.controller;


import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador principal responsable de servir las peticiones
 * 
 * @author Omar Paché
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "home"})
    public String inicio(HttpServletResponse response) {
        return "home";
    }

    @RequestMapping("/recuperacion")
    public String recuperacion() {
        return "recuperacion";
    }
}
