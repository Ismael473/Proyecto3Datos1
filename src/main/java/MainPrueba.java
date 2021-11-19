import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.core.JsonProcessingException;
import maps.java.MapsJava;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainPrueba {


    public static void main(String args[]) throws IOException, InterruptedException {
        MapsJava.setRegion("cr");
        List<String> listanombreciudades = Arrays.asList("Liberia", "Nicoya", "Monteverde", "Upala", "La Fortuna", "Guápiles",
                "Siquirres", "Limón", "Turrialba", "Cartago", "San Isidro de El General", "Buenos Aires", "San Vito",
                "Golfito", "Punto Jimenez", "Uvita", "Quepos", "Jacó");
        ArrayList<Ciudad> listadeciudades = new ArrayList<>(listanombreciudades.size());
        for (String ciudad : listanombreciudades) {
            Ciudad nuevaciudad = new Ciudad(ciudad);
            listadeciudades.add(nuevaciudad);
        }
        System.out.println(listadeciudades.size());
        for (Ciudad ciudad : listadeciudades) {
            System.out.println(ciudad.getNombre());}
            Distancia objdistancia = new Distancia();
            int dist = objdistancia.Distancia(listadeciudades.get(0).getNombre(), listadeciudades.get(1).getNombre());
            System.out.println("La distancia entre " + listadeciudades.get(0).getNombre() + " y " + listadeciudades.get(1).getNombre() + " es de " + dist);
        }
    }


