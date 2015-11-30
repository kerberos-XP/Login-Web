package golanweb.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Omar Paché
 */
public class RecuperarContraseñaControllerTest {
    
    /**
     * Test del method recuperación de la clase RecuperarContraseñaController.
     * Se espera que retorne a la vista nombrada recuperación.
     */
    @Test
    public void testRecuperacion() {
        RecuperarController controller = new RecuperarController();
        ModelAndView modelAndView = controller.recuperacion();
        
        assertEquals("recuperar", modelAndView.getViewName());
    }
    
}
