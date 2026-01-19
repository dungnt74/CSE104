package Lab1;

import java.util.Scanner;

public class EIEVERYN {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            int[] arr = new int[m];
            boolean[] check = new boolean[n + 1];
            for (int j = 0; j <= n; j++)
                check[j] = false;

            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] <= n)
                    check[arr[j]] = true;
            }
            output(check, n);
        }
    }

    public static void output(boolean a[], int n) {
        for (int i = 1; i <= n; i++)
            if (a[i] == false) {
                System.out.println("No");
                return;
            }
        System.out.println("Yes");
    }
}

