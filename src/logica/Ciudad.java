package logica;

public class Ciudad {

    private String nombre;
    private int distancia;
    private String pais;

    public Ciudad(String nombre, int distancia, String pais) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
