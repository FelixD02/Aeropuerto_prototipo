package aeropuerto_prototipo;

import java.util.ArrayList;

public class Aerolinea {

    private String nombre;
    private ArrayList<Vuelo> vuelos;
    private int cantidadAviones;
    private int cantidadVuelos;

    public Aerolinea(String nombre) {
        this.nombre = nombre;
        vuelos = new ArrayList();
        cantidadAviones = 0;
        cantidadVuelos = 0;
    }

    public void agregarVuelos(Vuelo vuelo) {
        vuelos.add(vuelo);
    }
    
    public void imprimirVuelosPasajero() {
        System.out.println(nombre + ":");
        for (Vuelo vuelo : vuelos) {
            vuelo.imprimirVueloPasajero();
        }
    }

    public void imprimirVuelosAdministrador() {
        System.out.println(nombre + ":");
        for (Vuelo vuelo : vuelos) {
            vuelo.ImprimirVueloAdministrador();
        }
    }

    public int totalPasajesVendidos() {
        int cantidad = 0;
        for (Vuelo vuelo : vuelos) {
            cantidad = cantidad + vuelo.getPasajeros().size();
        }
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadAviones() {
        return cantidadAviones;
    }

    public void setCantidadAviones(int cantidadAviones) {
        this.cantidadAviones = cantidadAviones;
    }

    public int getCantidadVuelos() {
        return cantidadVuelos;
    }

    public void setCantidadVuelos(int cantidadVuelos) {
        this.cantidadVuelos = cantidadVuelos;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

}
