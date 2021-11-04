package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

import java.util.Arrays;
import java.util.StringJoiner;

public class P9_JoinStringsWithDelimiter implements Problem {

    private final String[] strings;
    private final String delimiter;

    public P9_JoinStringsWithDelimiter(String delimiter, String... strings) {
        this.strings = Arrays.copyOf(strings, strings.length);
        this.delimiter = delimiter;
    }

    public static void main(String[] args) {

        P9_JoinStringsWithDelimiter problem = new P9_JoinStringsWithDelimiter(" | ", "flore", "vlad", "emil");
        problem.solve(problem::solution1);
        problem.solve(problem::solution2);
    }

    private void solution1() {
        StringJoiner stringJoiner = new StringJoiner(delimiter);
        for (String str : strings) {
            stringJoiner.add(str);
        }
        System.out.println(stringJoiner);
    }

    private void solution2() {
        System.out.println(String.join(delimiter, strings));
    }
}
