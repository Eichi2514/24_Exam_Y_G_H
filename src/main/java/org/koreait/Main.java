package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = 0; i < b; i++) {
            for (int x = 0; x < a; x++) {
                System.out.printf("*");
            }
            System.out.println(" ");
        }
    }
}
