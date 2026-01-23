package Lab3;

import java.util.Scanner;

public class EIBANKFEE {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double Money = sc.nextDouble();
        int Check = sc.nextInt();

        double BankFee = 0d;
        int[] AVRMoney = new int[]{500, 2000, 5000, Integer.MAX_VALUE};
        double[] FeePerMonth = new double[]{12, 7.5, 5, 0};
        double[] FeeOfChecks = new double[]{0.2, 0.2, 0.1, 0};

        for (int i = 0; i < 4; i++) {
            if (AVRMoney[i] > Money) {
                BankFee = FeePerMonth[i] + Check * FeeOfChecks[i];
                break;
            }
        }
        if (BankFee % 1 != 0)
            System.out.println(BankFee);
        else
            System.out.println((long) BankFee);
    }
}

