package Lab1;

import java.util.Scanner;

public class EIINCRDES {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        if (arr[1] > arr[0])
            increasing(arr);
        else
            decreasing(arr);
    }

    public static void increasing(int a[]) {
        boolean flag = true;

        for (int i = 1; i < a.length; i++)
            if (a[i] <= a[i - 1]) {
                flag = false;
                break;
            }

        if (flag)
            System.out.println("increasing");
        else
            System.out.println("none");
    }

    public static void decreasing(int a[]) {
        boolean flag = true;

        for (int i = 1; i < a.length; i++)
            if (a[i] >= a[i - 1]) {
                flag = false;
                break;
            }

        if (flag)
            System.out.println("decreasing");
        else
            System.out.println("none");
    }
}