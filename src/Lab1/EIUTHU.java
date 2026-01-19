package Lab1;

import java.util.Scanner;

public class EIUTHU {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = sc.next();
        String s2 = sc.next();

        String A = s1.substring(s1.length() - 1);
        String B = s2.substring(0, 1);

        int n = (s1.length() < s2.length()) ? s1.length() : s2.length();
        int temp = 0;

        for (int i = 1; i <= n; i++) {
            A = s1.substring(s1.length() - i);
            B = s2.substring(0, i);
            if (A.equals(B))
                temp = i;
        }

        long answer = s1.length() + s2.length() - temp;
        System.out.print(answer);
    }
}