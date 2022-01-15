import java.io.*;

public class day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        String s = binConvert(n);
        int ans = countConsec(s);
        System.out.println(ans);
    }

    public static String binConvert(int n) {
        String bin_val = Integer.toBinaryString(n);
        return (bin_val);
    }

    public static int countConsec(String s) {
        int max = 0;
        int current = 0;

        if (s.charAt(0) == '1') {
            max += 1;
            current += 1;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1' && s.charAt(i + 1) == '1') {
                current += 1;

                if (current > max) {
                    max = current;
                }
            } else if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                current = 1;
            } else {
                current = 0;
            }
        }

        return (max);
    }
}
