package Lab2;

import java.util.Scanner;

public class EIUCUBES2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            // input
            long n = sc.nextLong();

            // solving
            long result = (long) Math.cbrt(6 * n);
            while (n < (result * (result + 1) * (result + 2) / 6))
                result--;

            // output
            System.out.print(result + " ");
        }
    }
}