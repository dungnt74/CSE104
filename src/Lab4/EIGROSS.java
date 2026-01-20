package Lab4;

import java.util.Scanner;

public class EIGROSS {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double m = sc.nextDouble();

            double answer = m/9d;

            System.out.printf("%.2f\n", answer);
        }
    }
}