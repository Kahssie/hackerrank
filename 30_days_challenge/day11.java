/*
VERY important resource wrt primitive int vs obj integer conversions:
https://stackoverflow.com/questions/10043209/convert-arraylist-into-2d-array-containing-varying-lengths-of-arrays
*/

// If not for bufferedReader, I would try something like scanner obj to make life easier in creating the array lol

import java.io.*;
import java.util.*;
import java.util.stream.*;
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

        // important line: see stackoverflow link
        int[][] intArray = arr.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);

        int maximumSum = maxSum(intArray);
        System.out.println(maximumSum);
    }

    public static int maxSum(int[][] arr) {

        // int maximumSum = -10000; //handling the case where the values are negative
        int maximumSum = Integer.MIN_VALUE; // handling also but better since this is a built in
        int currentSum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                currentSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
                        + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (currentSum > maximumSum) {
                    maximumSum = currentSum;
                }

                currentSum = 0;
            }
            currentSum = 0;
        }

        return maximumSum;
    }
}
