package ru.yandex.division.B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class B1 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        StringBuilder text = new StringBuilder();
        input(input, text);
        Map<Character, Integer> map = getMap(text);
        StringBuilder result = getStringBuilder(map);
        output(result);
    }

    private static void input(BufferedReader input, StringBuilder text) throws IOException {
        String line;
        while ((line = input.readLine()) != null) {
            String strippedLine = line.replaceAll("\\s+", "");
            text.append(strippedLine);
        }
    }

    private static void output(StringBuilder result) throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"));
        output.write(result.toString());
        output.close();
    }

    private static StringBuilder getStringBuilder(Map<Character, Integer> map) {
        List<Character> sorted = new ArrayList<>(map.keySet());
        Collections.sort(sorted);

        int max = Collections.max(map.values());
        StringBuilder result = new StringBuilder();
        for (int i = max; i > 0; i--) {
            StringBuilder row = new StringBuilder();
            for (char c : sorted) {
                if (map.get(c) >= i) {
                    row.append('#');
                } else {
                    row.append(' ');
                }
            }
            result.append(row).append("\n");
        }

        StringBuilder bottomRow = new StringBuilder();
        for (char c : sorted) {
            bottomRow.append(c);
        }
        result.append(bottomRow);
        return result;
    }

    private static Map<Character, Integer> getMap(StringBuilder text) {
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}