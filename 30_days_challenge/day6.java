import java.io.*;
import java.util.*;

public class day6 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String evenStr = "";
            String oddStr = "";
            String s_j = sc.nextLine();

            if ((s_j.length() % 2) == 0) { // if str.len is even
                for (int sj = 0; sj < s_j.length(); sj += 2) {
                    evenStr += s_j.charAt(sj);
                    oddStr += s_j.charAt(sj + 1);
                }
                System.out.println(evenStr + " " + oddStr);
            } else { // if str.len is odd
                for (int sj = 0; sj < s_j.length() - 2; sj += 2) {
                    evenStr += s_j.charAt(sj);
                    oddStr += s_j.charAt(sj + 1);
                }

                evenStr += s_j.charAt(s_j.length() - 1);
                System.out.println(evenStr + " " + oddStr);
            }

        }

        sc.close();
    }
}