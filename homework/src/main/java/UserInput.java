import java.util.Scanner;

public class UserInput {
    public static String getFileName() {

        // Create a Scanner object
        System.out.println("Enter name and path of CSV - (file extension not required). If you do not wish to name the file, it will use default name");

        // Enter data using BufferReader
        // Using Scanner for Getting Input from User
        Scanner input = new Scanner(System.in);
        // Reading data using readLine
        String inputFile = input.nextLine();

        // Printing the read line
        if (inputFile.isBlank()) {
            return null;
        } else {

            return inputFile + ".csv";
        }
    }
}
