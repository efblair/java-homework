import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CreateFile {

    public void fileCreator(String fileName, List<List<String>> content) {
        try {
//            Checks if the specified file already exits
            File newFile = new File(fileName);
            if (newFile.createNewFile()) {
//             Creates file if it does not exist and then writes
                System.out.println("Created " + newFile.getName());
                fileWrite(fileName, content);
            } else {
//                informs user the file exists and then writes to existing file.
                System.out.println("File already exists");
                fileWrite(fileName, content);
            }
//            Throws error if there is an I/O issue
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileWrite(String fileName, List<List<String>> content) throws IOException {
//        Opens the file writer I/O stream
        FileWriter myWriter = new FileWriter(fileName);
        for (List<String> strings : content) {
//          Goes through the list, writing to file with a comma indicating the separator
            myWriter.append(String.join(",", strings));
            myWriter.append("\n");

            }
//      Informs user of completion and then flushes and closes I/O stream.
        System.out.println("File Written");
        myWriter.flush();
        myWriter.close();

    }
}
