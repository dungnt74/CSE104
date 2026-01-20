package Lab2;

import java.util.Scanner;

public class EIUMADIS {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        long max = 0;
        long min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i])
                min = arr[i];
            long temp = arr[i] - min;
            if (max < temp)
                max = temp;
        }

        System.out.print(max);
    }
}
