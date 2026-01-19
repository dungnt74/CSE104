package Lab4;

import java.util.Scanner;

public class EITAX {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double n = sc.nextDouble();
        double Result = 0;
        double[] Money = new double[]{0, 5_000_000, 10_000_000, 18_000_000, 32_000_000, 52_000_000, 80_000_000,
                Long.MAX_VALUE};
        double[] Tax = new double[]{0, 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35};

        if (n <= 9_000_000) {
            System.out.println(Math.round(Result));
        } else {
            n -= 9_000_000;
            for (int i = 1; i < 8; i++) {
                if (n > Money[i]) {
                    Result += (Money[i] - Money[i - 1]) * Tax[i];
                } else {
                    Result += (n - Money[i - 1]) * Tax[i];
                    break;
                }
            }
            System.out.print(Math.round(Result));
        }
    }
}
