import java.io.*;

public class day5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for (int i = 1; i < 11; i++) {
            int out = n * i;
            System.out.println(n + " x " + i + " = " + out);
        }
    }
}
