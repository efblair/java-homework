
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ReadInput myFile = new ReadInput();
        List<String> inputList = myFile.listInput();
        inputList.sort(Comparator.naturalOrder());
        CreateFile newFile = new CreateFile();
        newFile.fileCreator("output.csv",inputList );


    }


}

