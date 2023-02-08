package logica;

import persistencia.LecturaEscritura;
import java.util.ArrayList;

public class Vuelo {

    private Ciudad aeropuertoDestino;
    private Avion avion;
    private String dia;
    private String mes;
    private int año;
    private String hora;
    private double precio;
    private ArrayList<Pasajero> pasajeros;
    private int id;
    private LecturaEscritura LE;

    public Vuelo() {

    }

    public Vuelo(Ciudad aeropuertoDestino, Avion avion, double precio, String dia, String mes, int año, String hora, int id) {
        this.aeropuertoDestino = aeropuertoDestino;
        this.avion = avion;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.precio = precio;
        this.id = id;
        pasajeros = new ArrayList();
        LE = new LecturaEscritura();

    }

    public void agregarPasajeros(Pasajero pasajero) {
        boolean x = true;
        for(Pasajero pasajeroFor : pasajeros){
            if (pasajero.getDocumento()==pasajeroFor.getDocumento()){
                x = false;
                System.out.println("**DOCUMENTO NO VALIDO**");
            }
        }
        
        if (x==true){
        try{
        pasajeros.add(pasajero);
        LE.actualizarPasajeros(pasajeros, id);
        System.out.println("COMPRA DE BOLETO COMPLETADA PARA EL VUELO: ");
        imprimirVueloPasajero();
        }catch (Exception e){
            e.getMessage();
        }
        }
    }

    public boolean consultarPasajeros(long documento) {
        boolean x = false;
        for (Pasajero pasajero : pasajeros) {
            if (pasajero.getDocumento() == documento) {
                System.out.println("Sr/Sra: "+pasajero.getNombre());
                x = true;
            }
        }
        return x;
    }
    
    public void cancelarPasaje(Long documento){
        try{
        for(Pasajero pasajero : pasajeros){
            if(pasajero.getDocumento()==documento){
                pasajeros.remove(pasajero);
                LE.actualizarPasajeros(pasajeros, id);
                System.out.println("Sr/Sra: "+pasajero.getNombre());
                System.out.println("**SU PASAJE HA SIDO CANCELADO**");
            }
        }
        }catch (Exception e){
            e.getMessage();
        }
    }
    
    public void imprimirVueloPasajero() {
        System.out.println(aeropuertoDestino.getPais() + " - " + aeropuertoDestino.getNombre());
        System.out.println(avion.getModelo());
        System.out.println(dia + "/" + mes + "/" + año + "   Hora: " + hora);
        System.out.println("Precio: $" + precio);
        System.out.println("ID " + id);
        System.out.println();
    }

    public void ImprimirVueloAdministrador() {
        System.out.println("Pais Destino: " + aeropuertoDestino.getPais());
        System.out.println("Modelo del Avion: " + avion.getModelo());
        System.out.println("Fecha: " + dia + "/" + mes + "/" + año);
        System.out.println("Hora de Abordaje: " + hora);
        System.out.println("Pasajes Vendidos: " + pasajeros.size());
        System.out.println("Pasajes Disponibles a la venta: " + (avion.getCapacidad() - pasajeros.size()));
        System.out.println("Precio: $" + precio);
        System.out.println("Ganancias: $" + (pasajeros.size() * precio));

    }
    
    public void MostrarListaPasajeros(){
        for(Pasajero pasajero : pasajeros){
            System.out.println("#" + (pasajeros.indexOf(pasajero)+1) + "   Nombre: " + pasajero.getNombre() + "  Edad: " + pasajero.getEdad() + "  Nacionalidad: " + pasajero.getNacionalidad() + "  Sexo: " + pasajero.getGenero() + "  Documento: " + pasajero.getDocumento());
        }
    }

    public Ciudad getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    public void setAeropuertoDestino(Ciudad aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
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
