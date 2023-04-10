package ru.yandex.lesson_1;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        solve(a, b, c);
    }

    private static void solve(int a, int b, int c) {
        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
