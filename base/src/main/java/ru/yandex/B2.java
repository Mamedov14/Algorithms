package ru.yandex;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String input = scanner.next();

//        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int max = 0;
        for (int i = 97; i < 123; i++) {
            char letter = (char) (i);
            int right = 0;
            int left = 0;
            int currentK = k;
            while (right < input.length()) {
                while (right < input.length()) {
                    if (currentK == 0 && input.charAt(right) != letter) {
                        break;
                    }
                    if (currentK > 0 && input.charAt(right) != letter) {
                        currentK--;
                    }
                    right++;
                }
                max = Math.max(right - left, max);
                while (left < input.length() && input.charAt(left) == letter) {
                    left++;
                }
                left++;
                currentK++;
            }
        }
        System.out.println(max);
    }
}
