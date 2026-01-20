package Lab2;

import java.util.Scanner;

public class EIUCUBES {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        long total = 0;
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            total += (i * (i + 1)) / 2;
            if (total > n) {
                break;
            }
            answer = i;
        }
        System.out.print(answer);
    }
}
