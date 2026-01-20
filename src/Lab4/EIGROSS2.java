package Lab4;

import java.util.Scanner;

public class EIGROSS2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();

        long[] taxableIncome = new long[]{0, 4_750_000, 9_250_000, 6_050_000, 9_295_000, 52, 80, Long.MAX_VALUE};
        double[] taxRate = new double[]{0, 5, 10, 15, 20, 25, 30, 35};

        if (n <= 11_000_000
            System.out.println(n);
        else {
            long answer = n;
            long temp = n - 11_000_000;
            n = temp;

            for (int i = 1; i < taxableIncome.length; i++) {
                if (temp > taxableIncome[i] * MILL) {

                } else {

                }
            }

            System.out.println(answer);
        }
    }
}


