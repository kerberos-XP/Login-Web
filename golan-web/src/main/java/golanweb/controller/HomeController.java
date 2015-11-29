package golanweb.controller;

import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controlador encargado de procesar las solicitudes al inicio del sitio
 * 
 * @author Omar Paché
 */
@Controller
public class HomeController {
    
    private final Logger log = Logger.getLogger(HomeController.class);
    
    @RequestMapping(value = {"/", "inicio"})
    public ModelAndView inicio(HttpServletResponse response) {
        return new ModelAndView("inicio");
    }
}
