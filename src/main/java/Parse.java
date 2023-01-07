import java.util.ArrayList;
import java.util.List;

public class Parse {
    // Creating a list 
    private List<String[]> parsedata = new ArrayList<>();
    // Spliting the string data into list
    public Parse(List<String> data){
        for(int i=1; i<data.size(); i++){
            String[] arr = data.get(i).split(",");
            parsedata.add(arr);
        }
    } 
    // Getting the parsed data
    public List<String[]> pasreddata(){
        return parsedata;
    }
}
