package golanweb.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Omar Paché
 */
public class HomeControllerTest {
    
    public HomeControllerTest() {
    }
    
    /**
     * Test del method inicio de la clase HomeController.
     * Se espera que retorne a la vista nombrada inicio.
     */
    @Test
    public void testInicio() {
        HomeController controller = new HomeController();
        ModelAndView modelAndView = controller.inicio(null);
        
        assertEquals("inicio", modelAndView.getViewName());
    }
    
}
