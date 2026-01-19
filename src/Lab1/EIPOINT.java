package Lab1;

import java.util.Scanner;

public class EIPOINT {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        output(n);
    }

    public static void output(int n) {
        if (n < 50)
            System.out.print("F");
        else if (n < 52)
            System.out.print("D-");
        else if (n < 53)
            System.out.print("D");
        else if (n < 55)
            System.out.print("D+");
        else if (n < 60)
            System.out.print("C-");
        else if (n < 65)
            System.out.print("C");
        else if (n < 70)
            System.out.print("C+");
        else if (n < 75)
            System.out.print("B-");
        else if (n < 80)
            System.out.print("B");
        else if (n < 85)
            System.out.print("B+");
        else if (n < 90)
            System.out.print("A-");
        else
            System.out.print("A");
    }
}