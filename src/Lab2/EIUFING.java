package Lab2;

import java.util.Scanner;

public class EIUFING {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Khai báo biến
        int n = sc.nextInt();

        String[] Y1 = new String[]{"cai", "tro", "giua", "ap ut", "ut"};
        String[] Y2 = new String[]{"ut", "ap ut", "giua", "tro", "cai"};
        String[] Z = new String[]{"trai", "phai"};

        // Solving
        int a = 0, b = 0;
        n %= 18;
        if (n > 10) {
            a = 1;
            n -= 10;
            if (n < 5)
                b = 1;
            else
                n -= 5;
        } else {
            if (n > 5) {
                b = 1;
                n -= 6;
            } else if (n == 0)
                n++;
            else
                n--;
        }

        // Output
        if (a == 0) {
            if (b == 0)
                System.out.print("Ngon " + Y1[n] + " cua ban tay " + Z[b]);
            else
                System.out.print("Ngon " + Y2[n] + " cua ban tay " + Z[b]);
        } else if (b == 0)
            System.out.print("Ngon " + Y2[n] + " cua ban tay " + Z[b]);
        else
            System.out.print("Ngon " + Y1[n] + " cua ban tay " + Z[b]);
    }
}
