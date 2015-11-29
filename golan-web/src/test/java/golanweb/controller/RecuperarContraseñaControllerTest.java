package golanweb.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Omar Paché
 */
public class RecuperarContraseñaControllerTest {
    
    public RecuperarContraseñaControllerTest() {
    }
    
    /**
     * Test del método recuperación de la clase RecuperarContraseñaController.
     * Se espera que retorne a la vista nombrada recuperación.
     */
    @Test
    public void testRecuperacion() {
        RecuperarContraseñaController controller = new RecuperarContraseñaController();
        ModelAndView modelAndView = controller.recuperacion();
        
        assertEquals("recuperacion", modelAndView.getViewName());
    }
    
}
