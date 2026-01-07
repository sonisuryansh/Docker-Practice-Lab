import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class userinfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user name
        System.out.print("Enter your name to store in file or press Enter to proceed: ");
        String userName = scanner.nextLine();

        // Step 2: Write name to file if not empty
        if (!userName.isEmpty()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("user_info.txt", true))) {
                writer.write(userName);
                writer.newLine();
            } catch (IOException e) {
                System.out.println(e + " " + e.getClass());
            }
        }

        // Step 3: Ask if user wants to see all names
        System.out.print("Do you want to see all user names? y/n: ");
        String showInfo = scanner.nextLine();

        // Step 4: Read and display file content
        if (showInfo.equalsIgnoreCase("y")) {
            try (BufferedReader reader = new BufferedReader(new FileReader("user_info.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line.trim());
                }
            } catch (Exception e) {
                System.out.println(e + " " + e.getClass());
            }
        }        scanner.close();
    }
}
