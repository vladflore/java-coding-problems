package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class P5_CountVowelsAndConsonants implements Problem {

    private final String str;

    private static final Set<Character> allVowels = Set.of('a', 'e', 'i', 'o', 'u');

    public P5_CountVowelsAndConsonants(String str) {
        this.str = str != null ? str.toLowerCase() : "";
    }

    public static void main(String[] args) {
        P5_CountVowelsAndConsonants problem = new P5_CountVowelsAndConsonants("flore vlad emil");
        problem.solve(problem::solution1);
        problem.solve(problem::solution2);
    }

    private void solution1() {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (allVowels.contains(c)) {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }
        System.out.printf("%d,%d%n", vowels, consonants);
    }

    private void solution2() {
        Map<Boolean, Long> map = str.chars().mapToObj(c -> (char) c)
                .filter(c -> c >= 'a' && c <= 'z')
                .collect(Collectors.partitioningBy(allVowels::contains, Collectors.counting()));
        System.out.printf("%d,%d%n", map.get(true), map.get(false));
    }
}
