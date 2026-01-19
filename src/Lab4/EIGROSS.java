package Lab4;

import java.util.Scanner;

public class EIGROSS {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double m = sc.nextDouble();
            long temp = Math.round(m + m / 10d);

            while (temp - temp / 10d < m)
                temp++;

            System.out.println(temp / 10d);
        }
    }
}