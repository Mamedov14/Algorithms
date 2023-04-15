package ru.yandex.lesson_2;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] str = input.split(" ");

        int cnt = 0;
        for (int i = 1; i < str.length - 1; i++) {
            if (Integer.parseInt(str[i - 1]) < Integer.parseInt(str[i]) &&
                    Integer.parseInt(str[i]) > Integer.parseInt(str[i + 1])) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
