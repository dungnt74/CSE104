package Lab4;

import java.util.Scanner;

public class EIBANKRATE {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        int m = sc.nextInt();

        int year = m / 12;
        m -= year * 12;

        double answer = n + 0.09 * n * year + m * n * 0.09 / 12;

        System.out.println(answer);
    }
}
