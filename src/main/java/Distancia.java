
import maps.java.Route;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

import static java.awt.SystemColor.window;

public class Distancia {
    public int Distancia(String origen, String destino) throws MalformedURLException, UnsupportedEncodingException {
        Route ObjRout=new Route();
        String[][] resultadoRuta=ObjRout.getRoute( "España, Madrid","España, Barcelona", null, Boolean.TRUE, Route.mode.driving, Route.avoids.nothing);
        System.out.println("Las posibles rutas son: "+ resultadoRuta.length);
        for(int i=0;i< resultadoRuta.length;i++){
            System.out.println("Tramo " + i + ":");
            for(int j=0;j< resultadoRuta [0].length;j++){
                System.out.print(resultadoRuta[i][j] + "\t");
            }
        }

        int mejorruta = 1;
        return  mejorruta;
    }
}
