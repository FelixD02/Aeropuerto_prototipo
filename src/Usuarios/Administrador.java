package Usuarios;

public class Administrador extends Persona {

    private String contraseña;

    public Administrador(String contraseña, String nombre, long documento) {
        super(nombre, documento);
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
