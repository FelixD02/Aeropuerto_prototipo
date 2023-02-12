
package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import logica.Pasajero;

public class registro {
    
    public ArrayList<Pasajero> lecturaPasajeros(String txt){
        ArrayList<Pasajero> pasajeros = new ArrayList();
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(new File("src/persistencia/"+txt)));
            String line = reader.readLine();
            while(line != null){
                String[] lineSplit = line.split(";");
                Pasajero pasajero;
                pasajero = new Pasajero(Integer.parseInt(lineSplit[0]),lineSplit[1],lineSplit[2],lineSplit[3],Long.parseLong(lineSplit[4]));
                pasajeros.add(pasajero);
                line = reader.readLine();
            } reader.close();
            
        }catch (Exception e){
            e.getMessage();
        }
        return pasajeros;
    }
    
    public void actualizarPasajeros(ArrayList<Pasajero> arraylist, int id){
        BufferedWriter writer;
        try{
            writer = new BufferedWriter(new FileWriter(new File("src/Archivos/PasajerosVuelo"+id+".txt")));
            for (Pasajero arrayPasajero : arraylist){
                writer.write(arrayPasajero.getEdad()+";"+arrayPasajero.getNacionalidad()+";"+arrayPasajero.getGenero()+";"+arrayPasajero.getNombre()+";"+arrayPasajero.getDocumento()+ "\n");
            }
            writer.close();
            
        }catch (Exception a){
            a.getMessage();
        }
    }
    
}
