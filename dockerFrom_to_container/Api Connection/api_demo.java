import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class api_demo {

    public static String fetchRandomCatFact() {
        String url = "https://meowfacts.herokuapp.com/";

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            if (response.statusCode() != 200) {
                throw new RuntimeException(
                        "HTTP Error: " + response.statusCode()
                );
            }

            return response.body();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        String catFact = fetchRandomCatFact();
        if (catFact != null) {
            System.out.println(catFact);
        }
    }
}
