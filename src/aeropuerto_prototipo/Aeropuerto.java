
package aeropuerto_prototipo;

public class Aeropuerto {
    
    private String nombre;
    private Aerolinea[] aerolineas;
    private int cantidadAerolineas;
    
    public Aeropuerto(String nombre){
        this.nombre = nombre;
        aerolineas = new Aerolinea[5];
        cantidadAerolineas = 0;
    }
    
    public void agregarAerolineas(Aerolinea aerolinea){
        aerolineas[cantidadAerolineas] = aerolinea;
        cantidadAerolineas++;
    }
    
    public Vuelo seleccionarVuelo(int id){
        Vuelo x = new Vuelo();
        for(int i=0; i<cantidadAerolineas; i++){
            for(int a=0; a<aerolineas[i].getCantidadVuelos();a++){
            if(aerolineas[i].getVuelos()[a].getId() == id){
                x=aerolineas[i].getVuelos()[a];
            }
            }
        }
        return x;
    }
    
    public Vuelo consultarVuelo(long documento){
        Vuelo y = new Vuelo();
        for(int i=0; i<cantidadAerolineas;i++){
            for(int z=0; z<aerolineas[i].getCantidadVuelos();z++){
                if(aerolineas[i].getVuelos()[z].consultarPasajeros(documento)==true){
                    y = aerolineas[i].getVuelos()[z];
                }
            }
        }
        return y;
    }
    
    public void imprimirVuelosPasajero(){
        for(int i=0;i<cantidadAerolineas;i++){
            aerolineas[i].imprimirVuelosPasajero();
        }
    }
    
    public void imprimirAdministrado(){
        aerolineaTop();
        
    }
    
    public void aerolineaTop(){
        for (int i=0; i<cantidadAerolineas;i++){
            System.out.println("Aerolinea: "+aerolineas[i].getNombre()+"    Pasajes Vendidos: "+aerolineas[i].totalPasajesVendidos());
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Aerolinea[] getAerolineas() {
        return aerolineas;
    }

    public void setAerolineas(Aerolinea[] aerolineas) {
        this.aerolineas = aerolineas;
    }

    public int getCantidadAerolineas() {
        return cantidadAerolineas;
    }

    public void setCantidadAerolineas(int cantidadAerolineas) {
        this.cantidadAerolineas = cantidadAerolineas;
    }
    
    
}
