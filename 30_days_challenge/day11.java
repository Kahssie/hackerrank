import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class day11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int maximumSum = maxSum(arr);

        System.out.println(maximumSum);

    }

    public static int maxSum(List<List<Integer>> arr){
        
        int maximumSum = 0;
        int currentSum = 0;
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                currentSum = arr.get(i)(j) + arr.get(i)(j+1) + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (currentSum > maximumSum){
                    maximumSum = currentSum;
                }
                
                currentSum = 0;
            }
        }
        
        return maximumSum;
    }

}
