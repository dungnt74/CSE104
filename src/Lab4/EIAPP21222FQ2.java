package Lab4;

import java.util.Scanner;

class EIAPP21222FQ2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt();
        double answer = 0;

        double[] interestRate = new double[] { 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614,
                0.0638, 0.0664, 0.0692 };
        for (int i = 0; i < m; i++) {
            int n = sc.nextInt();

            int months = m - i;
            int year = months / 12;
            months %= 12;
            double temp = n;

            for (int j = 1; j <= year; j++) {
                temp += temp * (interestRate[11]);
            }
            if (months != 0)
                temp += temp * (interestRate[months - 1] * months / 12);

            answer += temp;
        }
        System.out.println(Math.round(answer));
    }
}