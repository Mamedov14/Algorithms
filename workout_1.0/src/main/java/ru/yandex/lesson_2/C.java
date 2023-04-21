package ru.yandex.lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int[] sort = Arrays.stream(arr).sorted().toArray();
        System.out.println(solve(sort, x));
    }

    private static int solve(int[] sort, int x) {
        int left = 0;
        int right = sort.length - 1;

        if (x <= sort[left]) {
            return sort[left];
        }
        if (x >= sort[right]) {
            return sort[right];
        }

        while (left <= right) {
            int median = (left + right) / 2;
            if (sort[median] == x) {
                return sort[median];
            } else if (sort[median] < x) {
                left = median + 1;
            } else {
                right = median - 1;
            }
        }

        if (sort[left] - x < x - sort[left - 1]) {
            return sort[left];
        } else {
            return sort[left - 1];
        }
    }
}
