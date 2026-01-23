package Lab3;

import java.util.Scanner;

public class EIUMARKUP {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        long Result = 0;
        for (int i = 200; i >= 180; i--) {
            if (n >= 100) {
                Result += 100 * i;
                n -= 100;
            } else if (n > 0) {
                Result += n * i;
                n = 0;
                break;
            }
        }

        if (n > 0)
            Result += n * 180;

        System.out.println(Result);
    }
}