package Lab4;

import java.util.Scanner;

class EIAPP21222FQ1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        double[] interestRate = new double[] { 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614,
                0.0638, 0.0664, 0.0692 };
        int year = m / 12;
        m %= 12;
        double answer = n;

        answer = answer*Math.pow(1 + interestRate[11], year);

        if (m !=0)
            answer += answer*(interestRate[m-1]*m/12);

        System.out.println(Math.round(answer));
    }
}
