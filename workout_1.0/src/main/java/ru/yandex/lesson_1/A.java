package ru.yandex.lesson_1;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int troom = scanner.nextInt();
        int tcond = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        switch (s) {
            case "heat" -> System.out.println(Math.max(troom, tcond));
            case "freeze" -> System.out.println(Math.min(troom, tcond));
            case "auto" -> System.out.println(tcond);
            case "fan" -> System.out.println(troom);
        }
    }
}
