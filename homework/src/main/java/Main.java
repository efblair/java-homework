
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
//        Reads in file
        ReadInput myFile = new ReadInput();
//        Creates List using output from ReadInput Class
        List<String> inputList = myFile.listInput();
//        Sorts the List of strings alphabetically
        inputList.sort(Comparator.naturalOrder());
        //Creates a new file using the fileCreator Method
        CreateFile newFile = new CreateFile();
        newFile.fileCreator("output.csv",inputList );


    }


}

