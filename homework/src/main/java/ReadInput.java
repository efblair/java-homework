import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadInput {
//    Class for Reading in the data from csv.
    public List<List<String>> listInput(String fileName) {
        List<List<String>> content = new ArrayList<>();
        try {
//            Checks to see if the file exists within specified location
            File myCSV = new File(fileName);
            Scanner myReader = new Scanner(myCSV);
//          Reads the data from the CSV into a List of Lists with each new line representing a new Line
            while (myReader.hasNext()) {
                String line = myReader.next();
                String[] csvValues = line.split(",");
                content.add(Arrays.asList(csvValues));
            }
//      throws an error if the file cannot be located
        } catch (FileNotFoundException e) {
            System.out.println("Error:" + e);
        }

        return content;
    }
}
