import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CSV_reader {
    // Creating a list to store CSV file data
    List<String> filereader;
    // Reading CSV file
    public CSV_reader(String path) throws Exception{
        this.filereader = Files.readAllLines(Paths.get(path), StandardCharsets.ISO_8859_1);
    }
    // Get CSV data
    public List<String> filereaderdata(){
        return filereader;
    }
}
