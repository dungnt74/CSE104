package Lab4;

import java.util.Scanner;

public class EIDINRATE {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            double N = sc.nextDouble();
            double L = sc.nextDouble();
            double M = sc.nextDouble();

            int year = 0;
            while (N < M) {
                N += N * L / 100d;
                year++;
            }

            System.out.println(year);
        }
    }
}

