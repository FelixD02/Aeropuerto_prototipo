package logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario {

    private String nombre;
    private long documento;
    private String contraseña;
    private static int cantidadUsuarios = 0;

    public Usuario(String nombre, long documento, String contraseña) {
            this.nombre = nombre;
            this.documento = documento;
            this.contraseña = contraseña;
            Usuario.cantidadUsuarios++;
    }

    public boolean iniciarSesion(long documento, String contraseña) {
        return (documento == getDocumento() && contraseña.equals(getContraseña()));
    }
    
    

    public void registrarVuelo(Aerolinea aerolinea, Vuelo vuelo) {
        aerolinea.registrarVuelo(vuelo);
    }

    public void cancelarVuelo(Aerolinea aerolinea, Vuelo vuelo) {
        aerolinea.cancelarVuelo(vuelo);
    }

    public ArrayList ListaVuelosAeropuerto(Aeropuerto aeropuerto) {
        return aeropuerto.listaVuelos();
    }
    /**
    public String informeVuelo(Vuelo vuelo){
        return vuelo.ConsultarVuelo();
    }
**/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
