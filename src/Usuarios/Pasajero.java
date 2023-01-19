package Usuarios;

public class Pasajero extends Persona {

    private int edad;
    private String nacionalidad;
    private String sexo;

    public Pasajero(int edad, String nacionalidad, String sexo, String nombre, long documento) {
        super(nombre, documento);
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
