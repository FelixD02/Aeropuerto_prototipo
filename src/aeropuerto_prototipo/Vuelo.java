package aeropuerto_prototipo;

public class Vuelo {

    private Aeropuerto_Destino aeropuertoDestino;
    private Avion avion;
    private String dia;
    private String mes;
    private int año;
    private String hora;
    private double precio;
    private Pasajero[] pasajeros;
    private int cantidadPasajeros;
    private int id;

    public Vuelo() {

    }

    public Vuelo(Aeropuerto_Destino aeropuertoDestino, Avion avion, double precio, String dia, String mes, int año, String hora, int id) {
        this.aeropuertoDestino = aeropuertoDestino;
        this.avion = avion;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.precio = precio;
        this.id = id;
        pasajeros = new Pasajero[avion.getCapacidad()];
        cantidadPasajeros = 0;

    }

    public void agregarPasajeros(Pasajero pasajero) {
        pasajeros[cantidadPasajeros] = pasajero;
        cantidadPasajeros++;
    }

    public boolean consultarPasajeros(long documento) {
        boolean x = false;
        for (int i = 0; i<cantidadPasajeros; i++) {
            if (pasajeros[i].getDocumento() == documento) {
                x = true;
            }
        }
        return x;
    }

    public void ImprimirVueloPasajero() {
        System.out.println(aeropuertoDestino.getPais() + " - " + aeropuertoDestino.getNombre());
        System.out.println(avion.getModelo());
        System.out.println(dia + "/" + mes + "/" + año + "   Hora: " + hora);
        System.out.println("Precio: $"+precio);
        System.out.println("ID " + id);
        System.out.println();
    }
    
    public void ImprimirVueloAdministrador(){
        System.out.println("Pais Destino: "+aeropuertoDestino.getPais());
        System.out.println("Modelo del Avion: "+avion.getModelo());
        System.out.println("Fecha: "+dia + "/" + mes + "/" + año);
        System.out.println("Hora de Abordaje: "+hora);
        System.out.println("Pasajes Vendidos: "+cantidadPasajeros);
        System.out.println("Pasajes Disponibles a la venta: "+(avion.getCapacidad()-cantidadPasajeros));
        System.out.println("Precio: $"+precio);
        System.out.println("Ganancias: $"+(cantidadPasajeros*precio));
        
    }

    public Aeropuerto_Destino getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    public void setAeropuertoDestino(Aeropuerto_Destino aeropuertoDestino) {
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

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
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

}
