package logica;

public class Destino {

    private String nombre;
    private double distancia;
    private int visitantes;

    public Destino(String nombre, double distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
        visitantes = 0;
    }
    
    public Destino(){ //Este constructuror está implementado para poder instanciar objetos con atributos nulos.
        this.nombre = "";
        this.distancia = 0;
        this.visitantes = 0;
    }
    
    public void agregarVisitantes(int visitantesNuevos){
        this.visitantes = visitantes + visitantesNuevos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(int visitantes) {
        this.visitantes = visitantes;
    }

    @Override
    public String toString() {
        return "Destino{" + "nombre=" + nombre + ", distancia=" + distancia + ", visitantes=" + visitantes + '}';
    }
    
    

}
