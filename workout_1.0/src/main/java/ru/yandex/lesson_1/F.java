package ru.yandex.lesson_1;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w1 = scanner.nextInt();
        int h1 = scanner.nextInt();
        int w2 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int[][] allSides = {
                {w1 + w2, Math.max(h1, h2)},
                {w1 + h2, Math.max(h1, w2)},
                {h1 + w2, Math.max(w1, h2)},
                {h1 + h2, Math.max(w1, w2)}
        };
        int min = Integer.MAX_VALUE;
        int[] minSides = new int[2];
        for (int[] sides : allSides) {
            int currentMin = sides[0] * sides[1];
            if (currentMin < min) {
                minSides = sides;
                min = minSides[0] * minSides[1];
            }
        }
        System.out.println(minSides[0] + " " + minSides[1]);
    }
}
