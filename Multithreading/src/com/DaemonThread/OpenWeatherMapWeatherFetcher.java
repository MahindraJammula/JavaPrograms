package com.DaemonThread;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenWeatherMapWeatherFetcher {

    public static void main(String[] args) {
        String apiKey = "6e6838434b7919c98ef3ffc05aa74495";
        String city = "London";

        try {
            String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Parse and display key weather information
                displayWeatherDetails(response.toString());

            } else {
                System.out.println("Error: Unable to fetch weather information. HTTP response code: " + responseCode);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void displayWeatherDetails(String jsonResponse) {
        JSONObject jsonObject = new JSONObject(jsonResponse);

        // Extract information from the JSON response
        String cityName = jsonObject.getString("name");
        JSONObject main = jsonObject.getJSONObject("main");
        JSONArray weatherArray = jsonObject.getJSONArray("weather");
        JSONObject wind = jsonObject.getJSONObject("wind");

        // Display information
        System.out.println("Weather Information for " + cityName + ":");
        System.out.println("Temperature: " + main.getDouble("temp") + " K");
        System.out.println("Feels Like: " + main.getDouble("feels_like") + " K");
        System.out.println("Humidity: " + main.getInt("humidity") + "%");
        System.out.println("Weather Description: " + weatherArray.getJSONObject(0).getString("description"));
        System.out.println("Wind Speed: " + wind.getDouble("speed") + " m/s");
        System.out.println("Visibility: " + jsonObject.getInt("visibility") + " meters");
        // Add more information as needed
    }
}
