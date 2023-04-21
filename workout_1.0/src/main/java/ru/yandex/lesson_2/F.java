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

        int count = countAdditionSize(seq);
        System.out.println(count);
        for (int i = (count - 1); i >= 0; i--) {
            System.out.print(seq[i] + " ");
        }
    }

    public static int countAdditionSize(int[] seq) {
        for (int i = 0; i < seq.length - 1; i++) {
            int left = i;
            int right = seq.length - 1;
            while (seq[left] == seq[right] && right >= left) {
                left++;
                right--;
            }
            if (left > right) {
                return i;
            }
        }
        return seq.length - 1;
    }
}
