import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ConsultaApi {
    //private final String API_KEY;

    public ConsultaApi(String apiKey) {
        apiKey = "17ed5b0dc665cf0ab0e2ccc8";
    }

    public double obterTaxaDeCambio(String moedaDe, String moedaPara) {
        try {
            String url = "https://v6.exchangerate-api.com/v6/17ed5b0dc665cf0ab0e2ccc8/pair/" + moedaDe + "/" + moedaPara;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);
            return jsonResponse.get("conversion_rate").getAsDouble();
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter a taxa de câmbio.");
        }
    }
}
