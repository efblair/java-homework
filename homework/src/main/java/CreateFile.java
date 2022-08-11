import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class CreateFile {

    public void fileCreator(List<String> content) {
        try {
            String fileName = UserInput.getFileName();
//            Checks if the specified file already exits
            File readCsvFile = new File(Objects.requireNonNull(fileName, "output"));
            if (readCsvFile.createNewFile()) {
//             Creates file if it does not exist and then writes

                System.out.println("Created " + readCsvFile.getName());
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

    public void fileWrite(String fileName, List<String> content) throws IOException {
//        Opens the file writer I/O stream
        FileWriter fileWriter = new FileWriter(fileName);
            String[] newList;

        for (String s : content) {
                newList = s.split(" ");
                fileWriter.append(String.join(",", newList ));
                fileWriter.append("\n");

            }
//      Informs user of completion and then flushes and closes I/O stream.
        System.out.println("File Written");
        fileWriter.flush();
        fileWriter.close();

    }
}

