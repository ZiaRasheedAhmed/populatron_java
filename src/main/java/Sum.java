import java.util.List;

public class Sum {
    public static long populationSum(List<String[]> data){
        long summation = data.stream().mapToInt(i-> Integer.parseInt(i[4].isEmpty()?"0" : i[4])).sum();
        return summation;
    }
}
