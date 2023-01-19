package aeropuerto_prototipo;

import java.util.ArrayList;

public class Aeropuerto {

    private String nombre;
    private ArrayList<Aerolinea> aerolineas;
    private int cantidadAerolineas;

    public Aeropuerto(String nombre) {
        this.nombre = nombre;
        aerolineas = new ArrayList();
    }

    public void agregarAerolineas(Aerolinea aerolinea) {
        aerolineas.add(aerolinea);
    }

    public Vuelo seleccionarVuelo(int id) {
        Vuelo x = new Vuelo();
        for (Aerolinea aerolinea : aerolineas) {
            for (Vuelo vuelo : aerolinea.getVuelos()) {
                if (vuelo.getId() == id) {
                    x = vuelo;
                }
            }
        }
        return x;
    }

    public Vuelo consultarVuelo(long documento) {
        Vuelo y  = new Vuelo();
        for(Aerolinea aerolinea : aerolineas){
            for(Vuelo vuelo : aerolinea.getVuelos()){
                if(vuelo.consultarPasajeros(documento) == true){
                    y = vuelo;
                }
            }
        }
        return y;
    }

    public void imprimirVuelosPasajero(){
        for(Aerolinea aerolinea : aerolineas){
            aerolinea.imprimirVuelosPasajero();
        }
    }

    public void imprimirAdministrado() {
        aerolineaTop();
    }
    
    public void aerolineaTop(){
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
