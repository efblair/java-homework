import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class ReadInput {
    //    Class for Reading in the data from csv.
    public List<String> listInput() throws Exception {
        String fileName = UserInput.getFileName();
        List<String> content = new ArrayList<>();
        try {
//            Checks to see if the file exists within specified location
            File readCsvFile;
            readCsvFile = new File(Objects.requireNonNullElse(fileName, "input.csv"));
            Scanner fileReader = new Scanner(readCsvFile);
//          Reads the data from the CSV into af Lists with each new line becoming a String
            while (fileReader.hasNext()) {
                String Row = fileReader.nextLine();
                Row = Row.replaceAll(",", " ");
                System.out.println(Row);
                content.add(Row);
            }
            return content;
//      throws an error if the file cannot be located
        } catch (FileNotFoundException e) {

            throw new Exception("Error - File not found. Please ensure you provided the correct path or file is in project folder");

        }
    }
}
