package Lab4;

import java.util.Scanner;

class EIGROSS2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();

        long[] taxableIncome = new long[] { 0, 5_000_000, 10_000_000, 18_000_000, 32_000_000, 52_000_000, 80_000_000,
                Long.MAX_VALUE };
        long[] taxOfEachLevelIncome = new long[] { 0, 250_000, 500_000, 1_200_000, 2_800_000, 5_000_000, 8_400_000, 0};
        double[] taxRate = new double[] { 0, 5, 10, 15, 20, 25, 30, 35 };

        if (n <= 11_000_000)
            System.out.println(n);
        else {
            double answer = n;
            n -= 11_000_000;
            long temp = 0;

            for (int i = 1; i < taxableIncome.length; i++) {
                if (n > taxableIncome[i] - (temp + taxOfEachLevelIncome[i])) {
                    temp += taxOfEachLevelIncome[i];
                    answer += taxOfEachLevelIncome[i];
                } else {
                    n -= taxableIncome[i-1] -temp;
                    answer += n / (100d / taxRate[i] - 1.0);
                    break;
                }
            }

            System.out.println((long) Math.round(answer));
        }
    }
}