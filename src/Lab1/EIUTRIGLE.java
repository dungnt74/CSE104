package Lab1;

import java.util.Scanner;

public class EIUTRIGLE {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        QS(arr, 0, n - 1);
        int temp = 0;
        if (n > 2)
            for (int i = 0; i < n - 2; i++)
                for (int j = i + 1; j < n - 1; j++)
                    for (int k = j + 1; k < n; k++) {
                        if (arr[i] + arr[j] > arr[k])
                            temp++;
                    }

        System.out.print(temp);
    }

    public static int partition(int a[], int l, int r) {
        int pivot = a[r];
        int i = l - 1;

        for (int j = l; j < r; j++)
            if (pivot > a[j]) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        i++;
        int temp = a[i];
        a[i] = a[r];
        a[r] = temp;

        return i;
    }

    public static void QS(int a[], int l, int r) {
        if (l < r) {
            int pivot = partition(a, l, r);
            QS(a, l, pivot - 1);
            QS(a, pivot + 1, r);
        }
    }
}
