package golanweb.model;

/**
 *
 * @author Omar Paché
 */
public class LoginForm {

    private String correo;
    private String contraseña;

    public LoginForm() {
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
