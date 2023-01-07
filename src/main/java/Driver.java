import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Driver {
    private String path;
    Driver(String path){
        this.path = path;
    }
    public void driver() throws Exception{
        // Calling CSV data
        CSV_reader read = new CSV_reader(this.path);
        List<String> lines = read.filereaderdata();
        // Calling Parse data
        Parse parsedata = new Parse(lines);
        List<String[]> parsed_data = parsedata.pasreddata();
        // Calling Sum
        long sum = Sum.populationSum(parsed_data);
        String num = NumberFormat.getInstance(Locale.getDefault()).format(sum);
        System.out.printf("World population is: %s\n", num);
        System.out.println(sum);
    }
}
