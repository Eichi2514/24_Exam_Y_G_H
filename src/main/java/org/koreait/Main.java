package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int b = a;
        for (int i = 0; i <= a; i++) {
            for (int x = 0; x < i; x++) {
                System.out.printf(" ");
            }
            for (int x1 = b; x1 > 0; x1--) {
                System.out.printf("%s ", x1);
            }
            b--;
            System.out.println(" ");
        }
    }
}
