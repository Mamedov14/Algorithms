package ru.yandex.lesson_2;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isConstant = true;
        boolean isAscending = true;
        boolean isWeaklyAscending = true;
        boolean isDescending = true;
        boolean isWeaklyDescending = true;
        int one = scanner.nextInt();
        while (scanner.hasNextInt()) {
            int two = scanner.nextInt();
            if (two == -2e9) {
                break;
            }
            if (two == one) {
                isAscending = false;
                isDescending = false;
            } else if (one < two) {
                isConstant = false;
                isDescending = false;
                isWeaklyDescending = false;
            } else {
                isConstant = false;
                isAscending = false;
                isWeaklyAscending = false;
            }
            one = two;
        }

        if (isConstant) {
            System.out.println("CONSTANT");
        } else if (isAscending) {
            System.out.println("ASCENDING");
        } else if (isWeaklyAscending) {
            System.out.println("WEAKLY ASCENDING");
        } else if (isDescending) {
            System.out.println("DESCENDING");
        } else if (isWeaklyDescending) {
            System.out.println("WEAKLY DESCENDING");
        } else {
            System.out.println("RANDOM");
        }
    }
}
