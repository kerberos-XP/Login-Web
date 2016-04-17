package golanweb.controller;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controlador responsable de la recuperación de una contraseña de acceso al sistema
 * 
 * @author Omar Paché
 */
@Controller
public class RecuperarController {
    
    private final Logger log = Logger.getLogger(RecuperarController.class);
    
    @RequestMapping("recuperar")
    public ModelAndView recuperacion() {
        return new ModelAndView("recuperar");
    }
}
