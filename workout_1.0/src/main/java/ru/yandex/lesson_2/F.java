package ru.yandex.lesson_2;

import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = scanner.nextInt();
        }

        boolean isSymmetrical = true;
        int left = 0;
        int right = seq.length - 1;
        while (left < right) {
            if (seq[left] != seq[right]) {
                isSymmetrical = false;
                break;
            }
            left++;
            right--;
        }

        if (isSymmetrical) {
            System.out.println(0);
        } else {
            int x;
            if (seq[seq.length - 1] == seq[seq.length - 2]) {
                x = seq.length - 3;
            } else {
                x = seq.length - 2;
            }
            System.out.println(x + 1);
            while (x >= 0) {
                System.out.print(seq[x] + " ");
                x--;
            }
        }
    }
}
