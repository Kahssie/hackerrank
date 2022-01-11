import java.io.*;

public class day3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        Result.checkN(N);

        bufferedReader.close();

    }
}

class Result {

    public static void checkN(int N) {
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (2 <= N && N <= 5) {
            System.out.println("Not Weird");
        } else if (N <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        return;
    }

}