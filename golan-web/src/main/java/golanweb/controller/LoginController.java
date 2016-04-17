package golanweb.controller;

import golanweb.model.LoginError;
import golanweb.model.LoginForm;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controlador encargado de procesar las solicitudes al inicio del sitio
 *
 * @author Omar Paché
 */
@Controller
public class LoginController {

    private final Logger log = Logger.getLogger(LoginController.class);

    @ModelAttribute("loginForm")
    public LoginForm getForm() {
        log.debug("getForm: Begin/End");
        return new LoginForm();
    }

    @ModelAttribute("errors")
    public LoginError getErrors() {
        log.debug("getErrors: Begin/End");
        return new LoginError();
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    ModelAndView getView(@ModelAttribute("errors") LoginError errors) {
        log.debug("getView: Begin");
        ModelAndView view = new ModelAndView("login", "errors", errors);
        log.debug("getView: End");
        return view;
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView hacerLogin(@ModelAttribute("loginForm") LoginForm loginForm, @ModelAttribute("errors") LoginError errors) {

        log.info("Haciendo Login");

        String correo = loginForm.getCorreo();
        log.info(correo);
        String contraseña = loginForm.getContraseña();
        log.info(contraseña);
        if (correo.equals("golan@golan.cl")) {
            return new ModelAndView("success");
        } else {
            return new ModelAndView("error");
        }
    }

    private ModelAndView handleLoginSuccess(LoginForm loginForm) {
        ModelAndView view;
        view = new ModelAndView("success", "loginForm", loginForm);
        log.debug("doLogin: Username or password entered. Sending user to success page.");
        return view;
    }

    private ModelAndView handleLoginError(LoginError errors) {
        ModelAndView view;
        errors.setCssClass("loginerror");
        errors.setErrorMessage("Invalid Username or Password.");
        view = new ModelAndView("login", "errors", errors);
        log.debug("doLogin: Username or password was invalid. Sending user to login.");
        return view;
    }
}
