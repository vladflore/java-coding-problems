package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class P12_RemoveDuplicateCharacters implements Problem {

    private final String str;

    public P12_RemoveDuplicateCharacters(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        P12_RemoveDuplicateCharacters problem = new P12_RemoveDuplicateCharacters("flore vlad emil");
        problem.solve(problem::solution1);
        problem.solve(problem::solution2);
    }

    private void solution1() {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> characters = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (characters.add(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }

    private void solution2() {
        String collect = Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
        System.out.println(collect);
    }
}
