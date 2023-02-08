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

    public void registrarAerolineas(Aerolinea aerolinea) {
        aerolineas.add(aerolinea);
        cantidadAerolineas++;
    }

    public Vuelo seleccionarVuelo(int id) {
        Vuelo v = new Vuelo();
        for (Aerolinea aerolinea : aerolineas) {
            for (Vuelo vuelo : aerolinea.getVuelos()) {
                if (vuelo.getId() == id) {
                    v = vuelo;
                }
            }
        }
        return v;
    }
    
    public Vuelo consultarVueloDeUnPasajero(long documento) {
        Vuelo v  = new Vuelo();
        for(Aerolinea aerolinea : aerolineas){
            for(Vuelo vuelo : aerolinea.getVuelos()){
                if(vuelo.consultarPasajeros(documento) == true){
                    v = vuelo;
                }
            }
        }
        return v;
    }

    public void consultarPasajerosDeUnVuelo(){
        for(Aerolinea aerolinea : aerolineas){
            aerolinea.imprimirVuelosPasajero();
        }
    }

    public void consultarEstadisticasAeropuerto() {
        for(Aerolinea aerolinea : aerolineas){
            System.out.println("Aerolinea: " + aerolinea.getNombre() + "    Pasajes Vendidos: " + aerolinea.totalPasajesVendidos());
        }

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
