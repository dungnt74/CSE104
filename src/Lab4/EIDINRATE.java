package Lab4;

import java.util.Scanner;

class EIDINRATE {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            double N = sc.nextDouble();
            double L = sc.nextDouble();
            double M = sc.nextDouble();

            L /= 100d;
            long answer = (long) Math.ceil((double) Math.log((double) M / N) / (Math.log(1.0 + L)));

            System.out.println(answer);
        }
    }
}