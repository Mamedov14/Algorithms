package ru.yandex.lesson_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class E {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            seq[i] = element;
        }
        int max = Arrays.stream(seq).max().getAsInt();

        List<Integer> candidates = new ArrayList<>();
        boolean flag = seq[0] == max;
        for (int i = 1; i < n - 1; i++) {
            int candidate = seq[i];
            if (!flag && candidate == max) {
                flag = true;
                continue;
            }
            if (flag && candidate % 10 == 5 && candidate > seq[i + 1]) {
                candidates.add(candidate);
            }
        }

        int res = candidates.stream()
                .max(Comparator.naturalOrder())
                .orElse(-1);

        if (res == -1) {
            System.out.println(0);
        } else {
            Integer[] revers = Arrays.stream(seq).boxed()
                    .sorted(Collections.reverseOrder())
                    .toArray(Integer[]::new);
            int result = IntStream.range(0, revers.length)
                    .filter(i -> res == revers[i])
                    .findFirst()
                    .getAsInt();
            System.out.println(result + 1);
        }
    }
}
