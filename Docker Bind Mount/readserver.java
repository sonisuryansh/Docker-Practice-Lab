import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readserver {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("servers.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.trim());
            }

        } catch (Exception e) {
            System.out.println(e + " " + e.getClass());
        }
    }
}
