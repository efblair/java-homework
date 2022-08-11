
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadInput myFile = new ReadInput();
        List<List<String>> myList = myFile.listInput();
        myList.sort(new SortLists());
        CreateFile newFile = new CreateFile();
        newFile.fileCreator("../output.csv",myList );


    }
}