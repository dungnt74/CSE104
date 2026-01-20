package Lab2;

import java.util.Scanner;

public class EIDISCOU {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // input
        long n = sc.nextLong();

        long[] Cost = new long[]{2_000_000, 10_000_000, 50_000_000, 100_000_000, 200_000_000, 500_000_000,
                Long.MAX_VALUE};
        double[] DicsRate = new double[]{0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15};

        // Solving
        long result = 0;

        if (n < Cost[0])
            result = n;

        else {
            result = Cost[0];

            for (int i = 1; i < 7; i++) {
                long temp = 0;
                if (n >= Cost[i])
                    temp = Cost[i] - Cost[i - 1];
                else
                    temp = n - Cost[i - 1];

                result += temp - temp * DicsRate[i];
                if (n < Cost[i])
                    break;
            }
        }
        // output
        System.out.println(result);
    }
}
