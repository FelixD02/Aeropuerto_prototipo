package logica;

import persistencia.registro;
import java.util.ArrayList;

public class Vuelo {

    private String destino;
    private Avion avion;
    private String dia;
    private String mes;
    private int año;
    private String hora;
    private double precio;
    private ArrayList<Pasajero> pasajeros;
    private int id;
    private final registro registroPasajeros;

    public Vuelo(String destino, Avion avion, double precio, String dia, String mes, int año, String hora, int id) {
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

    public void registrarPasajeros(Pasajero pasajero) {
        try {
            pasajeros.add(pasajero);
            registroPasajeros.actualizarPasajeros(pasajeros, id);
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public String ConsultarVuelo() {
        return "Vuelo " + id + ",destino " + destino + ", avion " + avion + ", dia " + dia + ", mes " + mes + ", año " + año + ", hora " + hora + ", precio " + ", id " + id + ", ganancias " + pasajeros.size() * precio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }



    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
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

}
