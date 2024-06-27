package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = 0;
        int c = 1;
        for (int i = 0; i < a; i++) {
            if (i == 0 || (i%2 == 0)) {System.out.printf("%s ",b);
            b = b+c;}
            else {System.out.printf("%s ",c);
            c = c+b;}
        }
    }
}
