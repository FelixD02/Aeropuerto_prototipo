package aeropuerto_prototipo;

import static java.lang.System.exit;
import java.util.Scanner;

public class Aeropuerto_prototipo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Administrador administrador = new Administrador("felix123", "Felix Nieto", 123);

        Aeropuerto_Destino destino1 = new Aeropuerto_Destino("Aeropuerto Internacional de Hong Kong", 16636, "China");
        Aeropuerto_Destino destino2 = new Aeropuerto_Destino("Aeropuerto Internacional Benito Juárez", 3121, "Mexico");
        Aeropuerto_Destino destino3 = new Aeropuerto_Destino("Aeropuerto Internacional John F. Kennedy", 3734, "EE.UU");
        Aeropuerto_Destino destino4 = new Aeropuerto_Destino("Aeropuerto Internacional Adolfo Suárez Madrid-Barajas", 7752, "España");
        Aeropuerto_Destino destino5 = new Aeropuerto_Destino("Aeropuerto de Copenhague-Kastrup", 9079, "Dinamarca");
        Aeropuerto_Destino destino6 = new Aeropuerto_Destino("Aeropuerto Internacional Eleftherios Venizelos", 9927, "Grecia");

        Avion avion1 = new Avion("AIRBUS 320", 220);
        Avion avion2 = new Avion("AIRBUS 330", 335);
        Avion avion3 = new Avion("AIRBUS 340", 419);
        Avion avion4 = new Avion("BOEING 737", 215);
        Avion avion5 = new Avion("BOEING 777", 550);
        Avion avion6 = new Avion("BOEING 747", 416);

        Vuelo vuelo1 = new Vuelo(destino1, avion1, 1500, "Lunes", "Enero", 2022, "15:00", 2456);
        Vuelo vuelo2 = new Vuelo(destino2, avion2, 200, "Martes", "Marzo", 2022, "22:45", 3485);
        Vuelo vuelo3 = new Vuelo(destino3, avion3, 600, "Miercoles", "Mayo", 2022, "06:30", 7985);
        Vuelo vuelo4 = new Vuelo(destino4, avion4, 900, "Jueves", "Julio", 2022, "12:50", 1954);
        Vuelo vuelo5 = new Vuelo(destino5, avion5, 1300, "Viernes", "Septiembre", 2022, "14:00", 6832);
        Vuelo vuelo6 = new Vuelo(destino6, avion6, 2000, "Sabado", "Diciembre", 2022, "23:20", 5743);

        Aerolinea aerolinea1 = new Aerolinea("American Airlines");
        Aerolinea aerolinea2 = new Aerolinea("Turkish Airlines");
        Aerolinea aerolinea3 = new Aerolinea("United Airlines");

        aerolinea1.agregarVuelos(vuelo1);
        aerolinea1.agregarVuelos(vuelo2);
        aerolinea2.agregarVuelos(vuelo3);
        aerolinea2.agregarVuelos(vuelo4);
        aerolinea3.agregarVuelos(vuelo5);
        aerolinea3.agregarVuelos(vuelo6);

        Aeropuerto aeropuerto = new Aeropuerto("Aeropuerto Internacional Palonegro");
        aeropuerto.agregarAerolineas(aerolinea1);
        aeropuerto.agregarAerolineas(aerolinea2);
        aeropuerto.agregarAerolineas(aerolinea3);

        Pasajero pasajero1 = new Pasajero(18, "Venezolano", "Masculino", "Jimmy", 12345);
        Pasajero pasajero2 = new Pasajero(23, "Colombiana", "Femenino", "Gabriela", 56789);
        Pasajero pasajero3 = new Pasajero(43, "Argentina", "Femenino", "Sandra", 29938);
        Pasajero pasajero4 = new Pasajero(55, "Mexicano", "Maculino", "Gustavo", 48249);
        Pasajero pasajero5 = new Pasajero(65, "Mexicano", "Masculino", "Matheo", 28374);
        Pasajero pasajero6 = new Pasajero(18, "Colombiano", "Masculino", "Felix", 38428);
        Pasajero pasajero7 = new Pasajero(66, "Panameño", "Masculino", "Javier", 78245);
        Pasajero pasajero8 = new Pasajero(20, "Mexicano", "Masculino", "Juan", 62804);
        Pasajero pasajero9 = new Pasajero(20, "Colombiana", "Femenino", "Maria", 20945);
        Pasajero pasajero10 = new Pasajero(20, "Venezolana", "Femenino", "Johana", 98762);
        Pasajero pasajero11 = new Pasajero(37, "Panameño", "Masculino", "Felipe", 11109);
        Pasajero pasajero12 = new Pasajero (37, "Argentino", "Masculino", "Carlos", 13842);
        Pasajero pasajero13 = new Pasajero(65, "Colombiana", "Femenino", "Rosa", 66473); 
        

        vuelo1.agregarPasajeros(pasajero1);
        vuelo1.agregarPasajeros(pasajero2);
        vuelo2.agregarPasajeros(pasajero3);
        vuelo2.agregarPasajeros(pasajero4);
        vuelo2.agregarPasajeros(pasajero5);
        vuelo3.agregarPasajeros(pasajero6);
        vuelo3.agregarPasajeros(pasajero7);
        vuelo3.agregarPasajeros(pasajero8);
        vuelo3.agregarPasajeros(pasajero9);
        vuelo4.agregarPasajeros(pasajero10);
        vuelo5.agregarPasajeros(pasajero11);
        vuelo5.agregarPasajeros(pasajero12);
        vuelo6.agregarPasajeros(pasajero13);

        System.out.println("**SISTEMA DE COMPRA Y ADMINISTRACION DE BOLETOS DE UN AEROPUERTO**");
        System.out.println();

        System.out.println("1) PASAJERO");
        System.out.println("2) ADMINISTRADOR");

        System.out.print("...");
        int x = in.nextInt();

        switch (x) {
            case 1:
                //INTERFAZ DEL USUARIO
                System.out.println();
                System.out.println("**SISTEMA DE PASAJEROS**");
                System.out.println();

                System.out.println("1) COMPRAR ");
                System.out.println("2) CONSULTAR ");

                System.out.print("...");
                int opcion = in.nextInt();

                if (opcion == 1) {
                    System.out.println();
                    System.out.println("**VUELOS DISPONIBLES**");
                    System.out.println();

                    aeropuerto.imprimirVuelosPasajero();

                    System.out.print("DIGITE EL ID DEL VUELO QUE DESEA COMPRAR: ");
                    int idCompra = in.nextInt();

                    System.out.println("Ingrese los siguientes datos para completar la compra: ");
                    System.out.println();

                    System.out.print("Nombre: ");
                    String nombre = in.nextLine();
                    in.nextLine();
                    System.out.print("Documento de Identidad: ");
                    long documento = in.nextLong();
                    in.nextLine();
                    System.out.print("Edad: ");
                    int edad = in.nextInt();
                    in.nextLine();
                    System.out.print("Sexo: ");
                    String sexo = in.nextLine();
                    System.out.print("Nacionalidad: ");
                    String nacionalidad = in.nextLine();
                    System.out.println();

                    Pasajero pasajero = new Pasajero(edad, nacionalidad, sexo, nombre, documento);
                    aeropuerto.seleccionarVuelo(idCompra).agregarPasajeros(pasajero);

                    System.out.println("COMPRA DE BOLETO COMPLETADA PARA EL VUELO: ");
                    aeropuerto.seleccionarVuelo(idCompra).ImprimirVueloPasajero();
                }

                if (opcion == 2) {
                    System.out.print("INGRESE SU DOCUMENTO DE IDENTIDAD: ");
                    long documento = in.nextLong();

                    aeropuerto.consultarVuelo(documento).ImprimirVueloPasajero();
                }

                break;

            case 2:
                //INTERFAZ DEL ADMINISTRADOR
                long documento;
                String contraseña;
                int intentos = 1,
                 intentosRestantes = 2;
                do {
                    System.out.println();
                    System.out.println("**SISTEMA DE ADMINISTRACION**");
                    System.out.println();

                    System.out.println("Intentos Restantes: " + intentosRestantes);
                    intentosRestantes--;

                    System.out.print("Documento: ");
                    documento = in.nextLong();
                    in.nextLine();

                    System.out.print("Contraseña: ");
                    contraseña = in.nextLine();

                    if (intentos == 3) {
                        System.out.println("**SISTEMA BLOAQUEADO**");
                        exit(0);
                    }

                    intentos++;
                } while (documento != administrador.getDocumento() || contraseña.equals(administrador.getContraseña()) == false);

                System.out.println();
                System.out.println("**LISTA DE VUELOS**");
                System.out.println();

                aeropuerto.imprimirVuelosPasajero();
                
                System.out.println("A)ESTADISTICAS POR GENERALES");
                System.out.println("B)ESTADISTICAS POR VUELO");
                System.out.println("C)CERRAR SESION");
                
                System.out.println("...");
                String opcionAdministracion = in.nextLine();
                
                if(opcionAdministracion.equals("A")){
                    aeropuerto.imprimirAdministrado();
                }
                
                if(opcionAdministracion.equals("B")){
                    System.out.println("Digite el ID del vuelo que desea consultar: ");
                    int idConsulta = in.nextInt();
                    
                    System.out.println();
                    System.out.println("DETALLES DEL VUELO");
                    System.out.println();
                    
                    aeropuerto.seleccionarVuelo(idConsulta).ImprimirVueloAdministrador();
                }
                
                if(opcionAdministracion.equals("C")){
                    System.out.println("**SISTEMA CERRADO**");
                    exit(0);
                }

                break;

            default:
                System.out.println("**OPCION NO VALIDA**");
                break;
        }
    }

}
