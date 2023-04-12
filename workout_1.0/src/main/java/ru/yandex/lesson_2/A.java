package ru.yandex.lesson_2;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split(" ");
        boolean check = true;
        for (int i = 0; i < list.length - 1; i++) {
            if (Integer.parseInt(String.valueOf(list[i])) < Integer.parseInt(String.valueOf(list[i + 1]))) {
                continue;
            } else {
                check = false;
            }
        }
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }
}
