package aeropuerto_prototipo;

import Usuarios.Administrador;
import Usuarios.Pasajero;
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

        LecturaEscritura pasajerosTxt = new LecturaEscritura();
        vuelo1.setPasajeros(pasajerosTxt.lecturaPasajeros("PasajerosVuelo2456.txt"));
        vuelo2.setPasajeros(pasajerosTxt.lecturaPasajeros("PasajerosVuelo3485.txt"));
        vuelo3.setPasajeros(pasajerosTxt.lecturaPasajeros("PasajerosVuelo7985.txt"));
        vuelo4.setPasajeros(pasajerosTxt.lecturaPasajeros("PasajerosVuelo1954.txt"));
        vuelo5.setPasajeros(pasajerosTxt.lecturaPasajeros("PasajerosVuelo6832.txt"));
        vuelo6.setPasajeros(pasajerosTxt.lecturaPasajeros("PasajerosVuelo5743.txt"));
        
        /*vuelo1.MostrarListaPasajeros(); 
        System.out.println("\n\n");
        vuelo2.MostrarListaPasajeros(); 
        System.out.println("\n\n");
        vuelo3.MostrarListaPasajeros(); 
        System.out.println("\n\n");
        vuelo4.MostrarListaPasajeros(); 
        System.out.println("\n\n");
        vuelo5.MostrarListaPasajeros(); 
        System.out.println("\n\n");
        vuelo6.MostrarListaPasajeros(); 
        System.out.println("\n\n");
        exit(0);*/
        
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
                System.out.println("3) CANCELAR");

                System.out.print("...");
                int opcion = in.nextInt();

                if (opcion == 1) {
                    System.out.println();
                    System.out.println("**VUELOS DISPONIBLES**");
                    System.out.println();

                    aeropuerto.imprimirVuelosPasajero();

                    System.out.print("DIGITE EL ID DEL VUELO QUE DESEA COMPRAR: ");
                    int idCompra = in.nextInt();
                    in.nextLine();
                    
                    Pasajero pasajero = new Pasajero();
                    pasajero.crearPasajero();
                    aeropuerto.seleccionarVuelo(idCompra).agregarPasajeros(pasajero);
                }

                if (opcion == 2) {
                    System.out.print("INGRESE SU DOCUMENTO DE IDENTIDAD: ");
                    long documento = in.nextLong();
                    
                    aeropuerto.consultarVuelo(documento).imprimirVueloPasajero();
                }

                if (opcion == 3) {
                    System.out.print("INGRESE SU DOCUMENTO DE IDENTIDAD: ");
                    long documento = in.nextLong();

                    System.out.println();
                    aeropuerto.consultarVuelo(documento).imprimirVueloPasajero();
                    aeropuerto.consultarVuelo(documento).cancelarPasaje(documento);
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

                System.out.print("...");
                String opcionAdministracion = in.nextLine();

                if (opcionAdministracion.equals("A")) {
                    aeropuerto.imprimirAdministrado();
                }

                if (opcionAdministracion.equals("B")) {
                    System.out.println("Digite el ID del vuelo que desea consultar: ");
                    int idConsulta = in.nextInt();

                    System.out.println();
                    System.out.println("DETALLES DEL VUELO");
                    System.out.println();

                    aeropuerto.seleccionarVuelo(idConsulta).ImprimirVueloAdministrador();
                }

                if (opcionAdministracion.equals("C")) {
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
