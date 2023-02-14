package logica;

import persistencia.registro;
import java.util.ArrayList;

public class Vuelo {

    private Destino destino;
    private String avion;
    private int dia;
    private int mes;
    private int año;
    private String hora;
    private double precio;
    private ArrayList<Pasajero> pasajeros;
    private int id;
    private final registro registroPasajeros;

    public Vuelo() {
        registroPasajeros = new registro();
    }

    public Vuelo(Destino destino, String avion, double precio, int dia, int mes, int año, String hora, int id) {
        this.destino = destino;
        this.avion = avion;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.precio = precio;
        this.id = id;
        pasajeros = new ArrayList();
        registroPasajeros = new registro();

    }

    public void registrarPasajeros(Pasajero pasajero) { //ESTE NO SE USA
        try {
            pasajeros.add(pasajero);
            registroPasajeros.actualizarPasajeros(pasajeros, id);
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public String ConsultarVuelo() {
        return destino + " " + dia + "/" + mes + "/" + año + " " + "ID " + id + "\n";
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public String getAvion() {
        return avion;
    }

    public void setAvion(String avion) {
        this.avion = avion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public void imprimir(){
        for(Pasajero pasajero : pasajeros){
            System.out.println(pasajero.toString());
        }
    }

    @Override
    public String toString() {
        return "Vuelo{" + "destino=" + destino + ", avion=" + avion + ", dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + ", hora=" + hora + ", precio=" + precio + ", id=" + id + '}';
    }
    
    

}
