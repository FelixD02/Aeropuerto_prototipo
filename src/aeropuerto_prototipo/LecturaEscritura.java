
package aeropuerto_prototipo;

import Usuarios.Pasajero;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class LecturaEscritura {
    
    public ArrayList<Pasajero> lecturaPasajeros(String txt){
        ArrayList<Pasajero> pasajeros = new ArrayList();
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(new File("C:\\Users\\FELIX\\Downloads\\netbins\\Aeropuerto_prototipo\\src\\Archivos\\"+txt)));
            String line = reader.readLine();
            while(line != null){
                String[] lineSplit = line.split(";");
                Pasajero pasajero = new Pasajero(Integer.parseInt(lineSplit[0]),lineSplit[1],lineSplit[2],lineSplit[3],Long.parseLong(lineSplit[4]));
                pasajeros.add(pasajero);
                line = reader.readLine();
            } reader.close();
            
        }catch (Exception e){
            e.getMessage();
        }
        return pasajeros;
    }
}
