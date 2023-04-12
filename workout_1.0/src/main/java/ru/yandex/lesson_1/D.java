package ru.yandex.lesson_1;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == 0) {
            if (b == c * c) {
                System.out.println("MANY SOLUTIONS");
            } else {
                System.out.println("NO SOLUTION");
            }
        } else if (c < 0) {
            System.out.println("NO SOLUTION");
        } else {
            double x = (double) (c * c - b) / a;
            if (x % 1 == 0) {
                System.out.println((int) x);
            } else {
                System.out.println("NO SOLUTION");
            }
        }
    }
}

