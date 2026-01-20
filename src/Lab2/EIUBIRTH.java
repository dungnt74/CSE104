package Lab2;

import java.util.Scanner;

public class EIUBIRTH {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            // input
            int B = sc.nextInt();
            int R = sc.nextInt();

            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            // Solving
            long result = 0;
            long temp1 = 0, temp2 = 0;

            if (X > Y + Z)
                temp1 = Y + Z;
            else
                temp1 = X;

            if (Y > X + Z)
                temp2 = X + Z;
            else
                temp2 = Y;

            result = B * temp1 + R * temp2;

            // output
            System.out.println(result);
        }
    }
}