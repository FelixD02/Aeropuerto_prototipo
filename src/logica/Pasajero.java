package logica;

public class Pasajero{

    private int edad;
    private String nacionalidad;
    private String genero;
    private long documento;
    private String nombre;

    public Pasajero(int edad, String nacionalidad, String genero, String nombre, long documento) {
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.documento = documento;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    

}
