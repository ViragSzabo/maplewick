package implementation.week13.companion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

public class AIReflectionService
{
    private static String API_KEY;

    static {
        try {
            API_KEY = Files.readString(Path.of("implementation/implementation/week13/companion/AIapi")).trim();
        } catch (IOException e) {
            System.err.println("⚠️ CRITICAL ERROR: Could not read 'AIapi' file.");
            System.err.println("Please create a file named 'AIapi' in your project root with your API key inside.");
            API_KEY = "MISSING_KEY";
        }
    }

    private static final String API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-flash-latest:generateContent?key=" + API_KEY;

    public String analyseScenario(Scenario scenario) {
        try {
            // 1. Prepare the Prompt
            // We ask Gemini to act as an ethical guide, not a judge.
            String prompt = "You are an ethical decision companion. Analyze this situation: " +
                    scenario.getDescription() +
                    ". Stakeholders: " + scenario.getStakeholders() +
                    ". distinctively list 2 ethical tensions and ask 1 reflective question. Keep it brief.";

            // 2. Build the JSON Body (Manually, to avoid external libraries)
            // We must escape quotes in the prompt to avoid breaking JSON format
            String jsonBody = "{ \"contents\": [{ \"parts\": [{ \"text\": \""
                    + escapeJson(prompt) + "\" }] }] }";

            // 3. Create the HTTP Request
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                    .timeout(Duration.ofSeconds(10))
                    .build();

            // 4. Send Request and Get Response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return extractTextFromResponse(response.body());
            } else {
                return "Error calling AI: " + response.statusCode() + " - " + response.body();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to connect to AI Companion. (Check internet or API Key)";
        }
    }

    // Helper: Simple manual JSON parser to extract the "text" field from Gemini response
    private String extractTextFromResponse(String jsonResponse) {
        String marker = "\"text\": \"";
        int startIndex = jsonResponse.indexOf(marker);
        if (startIndex == -1) return "Could not parse AI response.";

        startIndex += marker.length();
        int endIndex = jsonResponse.indexOf("\"", startIndex);

        String result = jsonResponse.substring(startIndex, endIndex);

        // Clean up escaped newlines from JSON (e.g., \n becomes actual new line)
        return result.replace("\\n", "\n").replace("\\\"", "\"");
    }

    // Helper: Escapes quotes in your prompt so JSON doesn't break
    private String escapeJson(String input) {
        if (input == null) return "";
        return input.replace("\"", "\\\"").replace("\n", " ");
    }
}