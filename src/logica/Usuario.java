package logica;

public class Usuario{
    
    private String nombre;
    private long documento;
    private String contraseña;
    private int edad;
    private String nacionalidad;
    private String genero;
    private String tipoCuenta;

    public Usuario(String nombre, long documento, String contraseña, int edad, String nacionalidad, String genero, String tipoCuenta) {
        this.nombre = nombre;
        this.documento = documento;
        this.contraseña = contraseña;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.tipoCuenta = tipoCuenta;
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

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void iniciarSesion(){
        
    }
    
    public void consultarEstadisticasAeropuerto(Aeropuerto a){
        
    }
    
    public void registrarVuelo(Vuelo v){
        
    }
    
    public void cancelarVuelo(Vuelo v){
        
    }
    
    public void comprarPasaje(Pasajero p, Vuelo v){
        
    }
    
    public void cancelarPasaje(Pasajero p, Vuelo v){
        
    }


}