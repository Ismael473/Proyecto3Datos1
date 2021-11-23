
import maps.java.MapsJava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Main prueba.
 */
public class MainPrueba {


    /**
     * Main.
     *
     * @param args the args
     * @throws IOException          the io exception
     * @throws InterruptedException the interrupted exception
     */
    public static void main(String args[]) throws IOException, InterruptedException {
        //Se define como región a Costa Rica
        MapsJava.setRegion("cr");
        //Se crea una lista con el nombre de las ciudades
        List<String> listanombreciudades = Arrays.asList("Liberia", "Nicoya", "Monteverde", "Upala", "La Fortuna", "Guápiles",
                "Siquirres", "Limón", "Turrialba", "Cartago", "San Isidro de El General", "Buenos Aires", "San Vito",
                "Golfito", "Punto Jimenez", "Uvita", "Quepos", "Jacó");
        //Se crea un array con el tamaño de acuerdo a la cantidad de nombres de ciudades
        ArrayList<Ciudad> listadeciudades = new ArrayList<>(listanombreciudades.size());
        //Por cada ciudad en la lista de nombres de ciudades, se crea un objeto ciudad y se agrega a la lista de ciudades
        for (String ciudad : listanombreciudades) {
            Ciudad nuevaciudad = new Ciudad(ciudad);
            listadeciudades.add(nuevaciudad);
        }
        //Impresion en consola de los nombres de la ciudades
        System.out.println(listadeciudades.size());
        for (Ciudad ciudad : listadeciudades) {
            System.out.println(ciudad.getNombre());
        }
        //Distancia por ruta, devuelve la ruta mas corta en km
        //No funciona a como debería y me devuelve una distancia de 0.0, se está trabajando en eso
        Distancia objdist = new Distancia();
        double disttoobjdist = objdist.Distancia(listadeciudades.get(0).getNombre(),listadeciudades.get(1).getNombre());
        System.out.println("La distancia entre "+listadeciudades.get(0).getNombre()+" y "
                +listadeciudades.get(1).getNombre()+" usando la clase Distancia() es de "+disttoobjdist);

        DistP distP = new DistP();
        //Impresión en consola de las distancias en kilometros de varias ciudades
        //>Este método se ha de llamar al construir el grafo, es un método auxiliar ya que devuelve
        //la listancia en linea recta de dos puntos y no la distancia por carretera
        double distan = distP.getDistanceBetweenPoints(listadeciudades.get(0), listadeciudades.get(1));
        System.out.println("La distancia entre "+listadeciudades.get(0).getNombre()+" y "
                + listadeciudades.get(1).getNombre()+" usando la clase DistP() es de "+distan+"km");



    }
}


