package Usuarios;

import java.util.Scanner;

public class Pasajero extends Persona {

    private int edad;
    private String nacionalidad;
    private String sexo;
    Scanner in = new Scanner(System.in);
    
    public Pasajero(int edad, String nacionalidad, String sexo, String nombre, long documento) {
        super(nombre, documento);
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
    }
    
    public Pasajero(){
        super();
        edad = 0;
        nacionalidad = "";
        sexo = "";
    }
    
    public void crearPasajero(){
        System.out.println("Ingrese los siguientes datos para completar la compra: ");
        System.out.println();
        
        System.out.print("Nombre: ");
        super.setNombre(in.nextLine());
        System.out.print("Documento: ");
        super.setDocumento(in.nextLong());
        System.out.print("Edad: ");
        setEdad(in.nextInt());
        in.nextLine();
        System.out.print("Sexo: ");
        setSexo(in.nextLine());
        System.out.print("Nacionalidad: ");
        setNacionalidad(in.nextLine());
        System.out.println("");
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
