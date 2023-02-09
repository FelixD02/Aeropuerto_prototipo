package logica;

import java.util.ArrayList;

public class Aeropuerto {

    private String nombre;
    private ArrayList<Aerolinea> aerolineas;
    private int cantidadAerolineas;

    public Aeropuerto(String nombre) {
        this.nombre = nombre;
        aerolineas = new ArrayList();
        cantidadAerolineas = 0;
    }

    public void agregarAerolineas(Aerolinea aerolinea) {
        aerolineas.add(aerolinea);
        cantidadAerolineas++;
    }

    public ArrayList listaVuelos() {
        ArrayList vuelosAeropuerto = new ArrayList();
        for(Aerolinea aerolinea: aerolineas){
            vuelosAeropuerto.add(aerolinea.getVuelos());
        }
        return vuelosAeropuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadAerolineas() {
        return cantidadAerolineas;
    }

    public void setCantidadAerolineas(int cantidadAerolineas) {
        this.cantidadAerolineas = cantidadAerolineas;
    }

    public ArrayList<Aerolinea> getAerolineas() {
        return aerolineas;
    }

    public void setAerolineas(ArrayList<Aerolinea> aerolineas) {
        this.aerolineas = aerolineas;
    }

    
}
