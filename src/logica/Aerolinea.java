package logica;

import java.util.ArrayList;

public class Aerolinea {

    private String nombre;
    private ArrayList<Vuelo> vuelos;
    private static int cantidadVuelos;

    public Aerolinea(String nombre) {
        this.nombre = nombre;
        vuelos = new ArrayList();
        cantidadVuelos = 0;
    }

    public void registrarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
        cantidadVuelos++;
    }
    
    public void cancelarVuelo(Vuelo vuelo){
        vuelos.remove(vuelo);
        cantidadVuelos--;
    }

    public String consultarAerolinea() {
        return "Nombre " + nombre + ", cantidad de vuelos " + cantidadVuelos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadVuelos() {
        return cantidadVuelos;
    }


    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

}
