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

public class day7 {

    public static String reverseArray(int n, List<Integer> intArr) {

        String sln = "";

        for (int i = n - 1; i >= 1; i--) {
            sln += intArr.get(i) + " ";
        }
        sln += intArr.get(0);

        return sln;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        bufferedReader.close();

        String reversedArr = day7.reverseArray(n, arr);
        System.out.println(reversedArr);
    }
}

// alternative solutions which involve changing the defaulted bufferedreader
// code to scanner (i would prefer this also lol):
/*
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * int n = in.nextInt();
 * int[] arr = new int[n];
 * for(int i=0; i < n; i++){
 * arr[i] = in.nextInt();
 * }
 * in.close();
 * 
 * for (int i = 0; i < n; i++) {
 * System.out.print(arr[(n - 1) - i] + " ");
 * }
 */

/*
 * private static final Scanner scanner = new Scanner(System.in);
 * public static void main(String[] args) {
 * // Get the input
 * Scanner sc = new Scanner(System.in);
 * int length = sc.nextInt();
 * int[] array = new int[length];
 * 
 * for (int i = 0; i < length; i++) {
 * array[i] = sc.nextInt();
 * }
 * 
 * // Var holding our new string
 * String result = "";
 * 
 * for (int i = array.length - 1; i >= 0; i--) {
 * result = result + array[i] + " ";
 * }
 * System.out.println(result);
 * }
 */