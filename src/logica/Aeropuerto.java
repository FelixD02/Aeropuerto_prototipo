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
