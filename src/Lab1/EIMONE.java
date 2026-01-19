package Lab1;

import java.util.Scanner;

public class EIMONE {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args){
            int b = sc.nextInt();
            b = output(b,20);
            b = output(b,10);
            b = output(b,5);
            b = output(b,1);
        }

        public static int output(int b, int n) {
            int temp = b/n;
            if (temp==0) return b%n;
            System.out.println(n +" "+ temp);
            return b%n;
        }
    }