import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import maps.java.MapsJava;
import org.w3c.dom.Document;

import javax.xml.xpath.XPath;

public class Ciudad {
    private String nombre;
    private double latitud;
    private double longitud;
    private List<String> listalugares = new ArrayList();

    public Ciudad(String _nombre) throws IOException, InterruptedException, JsonMappingException {
        this.nombre = _nombre;
        ConsCiudad();
    }

    public void ConsCiudad( ) throws IOException, InterruptedException {
        ObjectMapper mapper = new ObjectMapper();
        Geocoder geocoder = new Geocoder();
        String response = geocoder.GeocodeSync("Costa Rica, "+nombre);
        JsonNode responseJsonNode = mapper.readTree(response);
        LugaresCiudad pruebalug = new LugaresCiudad();
        JsonNode results = responseJsonNode.get("results");
        try {
            JsonNode adressc = results.get(0);
            JsonNode geometry = adressc.get("geometry");
            JsonNode location = geometry.get("location");
            this.latitud = Double.parseDouble(location.get("lat").asText());
            this.longitud = Double.parseDouble(location.get("lng").asText());
            listalugares = pruebalug.pruebalugares(latitud, longitud);
        }

        catch(NullPointerException e){
            System.out.println("No hay objetos en la consulta");
        }

        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public List<String> getListalugares() {
        return listalugares;
    }

    public void setListalugares(List<String> listalugares) {
        this.listalugares = listalugares;
    }
}
