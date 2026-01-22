package Lab5;

import java.util.Scanner;

public class EIBANKLOAN2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double loan = sc.nextDouble();
        double pay = sc.nextDouble();
        double rate = sc.nextDouble();

        rate = rate / 100d / 12;

        double months = Math.log(pay / (pay - loan * rate)) / Math.log(1 + rate);

        System.out.println((long) Math.ceil(months));
    }
}
