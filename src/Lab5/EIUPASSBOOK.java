package Lab5;

import java.util.Scanner;

public class EIUPASSBOOK {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double moneyOfPassbook = sc.nextDouble();
        int monthsOfATermOfPassbook = sc.nextInt();
        int withdrawingMonth = sc.nextInt();
        double rateOfYearlyPassbook = sc.nextDouble() / 100d;
        double rateOfYearlyLoan = sc.nextDouble() / 100d;

        int year = (monthsOfATermOfPassbook - withdrawingMonth) / 12;
        int months = (monthsOfATermOfPassbook - withdrawingMonth) % 12;
        double rateOfFinishedPassbook = 1 + rateOfYearlyPassbook * monthsOfATermOfPassbook / 12d;
        double rateOfFinishedLoan = Math.pow(1 + rateOfYearlyLoan, year)
                * (1 + rateOfYearlyLoan * months / 12);

        double answer = moneyOfPassbook * rateOfFinishedPassbook / rateOfFinishedLoan;
        if (moneyOfPassbook > answer)
            System.out.println((long) moneyOfPassbook);
        else
            System.out.println(Math.round(answer));
    }

}
