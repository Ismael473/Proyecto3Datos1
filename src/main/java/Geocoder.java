
import javax.swing.plaf.synth.Region;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

    public class Geocoder {

        private static final String GEOCODING_RESOURCE = "https://maps.googleapis.com/maps/api/geocode/json";// "https://geocode.search.hereapi.com/v1/geocode";
        private static final String API_KEY = "AIzaSyAb0Wf4iNY8hD8OsuUkIIJbjDpw7SbzRUI";

        public String GeocodeSync(String query) throws IOException, InterruptedException {

            HttpClient httpClient = HttpClient.newHttpClient();

            String encodedQuery = URLEncoder.encode(query,"UTF-8");
            String requestUri = GEOCODING_RESOURCE + "?key=" + API_KEY+ "&address=" + encodedQuery;

            HttpRequest geocodingRequest = HttpRequest.newBuilder().GET().uri(URI.create(requestUri)).timeout(Duration.ofMillis(2000)).build();
            HttpResponse geocodingResponse = httpClient.send(geocodingRequest, HttpResponse.BodyHandlers.ofString());

            return (String) geocodingResponse.body();
        }

    }


