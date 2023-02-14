package logica;

import java.util.*;

public class Aeropuerto {

    private String nombre;
    private ArrayList<Aerolinea> aerolineas;
    private int cantidadAerolineas;
    private ArrayList<Destino> destinos;

    public Aeropuerto(String nombre) {
        this.nombre = nombre;
        aerolineas = new ArrayList();
        cantidadAerolineas = 0;
        destinos = new ArrayList();
    }

    public void agregarAerolineas(Aerolinea aerolinea) {
        aerolineas.add(aerolinea);
        cantidadAerolineas++;
    }

    public void agregarDestinos(Destino destino) {
        destinos.add(destino);
    }

    public ArrayList listaVuelos() {
        ArrayList vuelosAeropuerto = new ArrayList();
        for (Aerolinea aerolinea : aerolineas) {
            vuelosAeropuerto.add(aerolinea.getVuelos());
        }
        return vuelosAeropuerto;
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
    
    public ArrayList<String> consultarVuelosAeropuertos(){
        ArrayList<String> vuelosConsultados = new ArrayList<String>();
        for(Aerolinea a: aerolineas){
            for(Vuelo v: a.getVuelos()){
                vuelosConsultados.add(a.getNombre() + " " + v.ConsultarVuelo()); 
            }
        } 
        
        return vuelosConsultados;
    }

    public ArrayList destinosMasVisitados() {
        for (Aerolinea aerolinea : aerolineas) {
            for (Vuelo vuelo : aerolinea.getVuelos()) {
                for (Destino destino : destinos) {
                    if (vuelo.getDestino() == destino) {
                        destino.agregarVisitantes(vuelo.getPasajeros().size());
                    }
                }
            }
        }
        ArrayList<Destino> destinosMasVisitados = new ArrayList();
        Destino top1, top2, top3;
        top1 = new Destino();
        top2 = new Destino();
        top3 = new Destino();
        for (Destino destino : destinos) {
            if (destino.getVisitantes() > top1.getVisitantes()) {
                top3 = top2;
                top2 = top1;
                top1 = destino;
            } else if (destino.getVisitantes() > top2.getVisitantes()) {
                top3 = top2;
                top2 = destino;
            } else if (destino.getVisitantes() > top3.getVisitantes()) {
                top3 = destino;
            }
        }
        destinosMasVisitados.add(top1);
        destinosMasVisitados.add(top2);
        destinosMasVisitados.add(top3);
        return destinosMasVisitados;
    }
    
    public Aerolinea aerolineaMasUsada(){
        Aerolinea aerolineaMasUsada = new Aerolinea();
        int pasajesVendidos = 0;
        for(Aerolinea aerolinea : aerolineas){
            if(aerolinea.totalPasajesVendidos() > pasajesVendidos ){
                pasajesVendidos = aerolinea.totalPasajesVendidos();
                aerolineaMasUsada = aerolinea;
            }
        }
        return aerolineaMasUsada;
    }
    
    public Aerolinea seleccionarAerolinea(String str){
        Aerolinea aerolineaSeleccionada = new Aerolinea();
        for(Aerolinea aerolinea : aerolineas){
            if(aerolinea.getNombre().equalsIgnoreCase(str)){
                aerolineaSeleccionada = aerolinea;
            }
        }
        return aerolineaSeleccionada;
    }
    
    public String pasajerosPorEdad(){
        String  pasajerosPorEdad;
        int menores = 0, mayores = 0;
        for(Aerolinea aerolinea : aerolineas){
            for(Vuelo vuelo : aerolinea.getVuelos()){
                for(Pasajero pasajero : vuelo.getPasajeros()){
                    if(pasajero.getEdad()<18){
                        menores++;
                    }
                    if(pasajero.getEdad()>=18){
                        mayores++;
                    }
                }
            }
        }
        pasajerosPorEdad = "Menores: " + menores + "  Mayores: " + mayores;
        return pasajerosPorEdad;
    }
    
    public String pasajerosPorNacionalidad(){
        String pasajerosPorNacionalidad;
        int colombianos = 0, extranjeros = 0;
        for(Aerolinea aerolinea : aerolineas){
            for(Vuelo vuelo : aerolinea.getVuelos()){
                for(Pasajero pasajero : vuelo.getPasajeros()){
                    if(pasajero.getNacionalidad()==Nacionalidad.Colombiana){
                        colombianos++;
                    }
                    if(pasajero.getNacionalidad()==Nacionalidad.Extranjera){
                        extranjeros++;
                    }
                }
            }
        }
        pasajerosPorNacionalidad = "Colombianos: " + colombianos + "  Extranjeros: " + extranjeros;
        return pasajerosPorNacionalidad;
    }
    
    public String pasajerosPorSexo(){
        String pasajerosPorSexo;
        int masculino=0, femenino=0;
        for(Aerolinea aerolinea : aerolineas){
            for(Vuelo vuelo : aerolinea.getVuelos()){
                for(Pasajero pasajero : vuelo.getPasajeros()){
                    if(pasajero.getSexo()==Sexo.Masculino){
                        masculino++;
                    }
                    if(pasajero.getSexo()==Sexo.Femenino){
                        femenino++;
                    }
                }
            }
        }
        pasajerosPorSexo = "Masculinos: " + masculino + "  Femenino: " + femenino;
        return pasajerosPorSexo;
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

    public ArrayList<Destino> getDestinos() {
        return destinos;
    }

    public void setDestinos(ArrayList<Destino> destinos) {
        this.destinos = destinos;
    }
    
}
