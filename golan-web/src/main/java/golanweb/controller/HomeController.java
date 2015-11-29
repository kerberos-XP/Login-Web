package golanweb.controller;


import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador principal responsable de enrutar las peticiones
 * 
 * @author Omar Paché
 */
@Controller
public class HomeController {
    
    private final Logger log = Logger.getLogger(HomeController.class);
    
    @RequestMapping(value = {"/", "home"})
    public String inicio(HttpServletResponse response) {
        log.info("retornando pagina home");
        return "home";
    }

    @RequestMapping("/recuperacion")
    public String recuperacion() {
        log.info("retornando pagina recuperacion");
        return "recuperacion";
    }
}
