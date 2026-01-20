package Lab2;

import java.util.Scanner;

public class EISNAIL {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        v -= a;
        int temp = a - b;
        int answer = (int) (1 + Math.ceil((double) v / temp));

        System.out.println(answer);
    }
}