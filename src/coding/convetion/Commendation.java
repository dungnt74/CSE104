package coding.convetion;

import java.util.Scanner;

public class Commendation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Input a score of a student
        int n = sc.nextInt();
        output(n);
    }

    /**
     * @param n score
     * @author DungNguyen
     * @version 1.0
     */

    public static void output(int n) {
        /*
        Depend on the score to print the letter grade
        */
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

