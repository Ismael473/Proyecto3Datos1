import maps.java.MapsJava;
import maps.java.Places;
import java.util.ArrayList;
import java.util.List;


public class LugaresCiudad {
        public List<String> pruebalugares(double _latitud, double _longitud) {
            double latitud = _latitud;
            double longitud = _longitud;

            List<String> listalugares = new ArrayList();
            MapsJava.setKey("AIzaSyAb0Wf4iNY8hD8OsuUkIIJbjDpw7SbzRUI");

            Places ObjPlace = new Places();
            try {

                String[][] resultado = ObjPlace.getPlaces(latitud, longitud,
                        3000, "", "", Places.Rankby.prominence, null);

                for (int i = 0; i < resultado.length; i++) {
                    listalugares.add(i, resultado[i][0]);

                }
            } catch (
                    Exception e) {
                System.out.println(e);
            }
        return listalugares;
        }
//public static void main(String [] args){
//            LugaresCiudad lugciudad = new LugaresCiudad();
//            lugciudad.pruebalugares(40.4171111, -3.7031133);
//}


    }
