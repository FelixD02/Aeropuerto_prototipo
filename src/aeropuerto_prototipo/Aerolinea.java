package aeropuerto_prototipo;

public class Aerolinea {

    private String nombre;
    private Vuelo[] vuelos;
    private int cantidadAviones;
    private int cantidadVuelos;

    public Aerolinea(String nombre) {
        this.nombre = nombre;
        vuelos = new Vuelo[10];
        cantidadAviones = 0;
        cantidadVuelos = 0;
    }

    public void agregarVuelos(Vuelo vuelo) {
        vuelos[cantidadVuelos] = vuelo;
        cantidadVuelos++;
    }
    
    public void imprimirVuelosPasajero(){
        System.out.println(nombre+":");
        for(int i=0; i<cantidadVuelos; i++){
            vuelos[i].ImprimirVueloPasajero();
        }
    }
    
    public void imprimirVuelosAdministrador(){
        System.out.println(nombre+":");
        for(int i=0; i<cantidadVuelos; i++){
            vuelos[i].ImprimirVueloAdministrador();
        }
    }
    
    public int totalPasajesVendidos(){
        int cantidad = 0;
        for(int i=0; i<cantidadVuelos; i++){
            cantidad = cantidad + vuelos[i].getCantidadPasajeros();
        }
        return cantidad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vuelo[] getVuelos() {
        return vuelos;
    }

    public void setVuelos(Vuelo[] vuelos) {
        this.vuelos = vuelos;
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

}
