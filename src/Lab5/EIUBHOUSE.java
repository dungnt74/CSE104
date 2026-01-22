package Lab5;

import java.util.Scanner;

public class EIUBHOUSE {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long N = sc.nextLong();
        long M = sc.nextLong();
        int K = sc.nextInt();
        double X = sc.nextDouble();


        X /= 100d;
        double debt = N - M;
        double payEachMonth = debt / K;
        for (int i = 1; i <= K; i++) {
            double payment = payEachMonth + debt * X;
            debt -= payEachMonth;
            System.out.println(i + " " + Math.round(payment));
        }
    }

}