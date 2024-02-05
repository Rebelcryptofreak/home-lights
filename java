import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            // The ID of your light
            String lightId = "d3b2f2d97452";

            // Your LIFX API token
            String token = "c8c4a8b7e7fafa000f";

            // The URL to toggle the power of the light
            URL url = new URL("https://api.lifx.com/v1/lights/" + lightId + "/toggle");

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to POST
            connection.setRequestMethod("POST");

            // Add the Authorization header with your token
            connection.setRequestProperty("Authorization", "Bearer " + token);

            // Get the response code
            int responseCode = connection.getResponseCode();

            // Print the response code
            System.out.println("Response Code: " + responseCode);

            // Close the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
