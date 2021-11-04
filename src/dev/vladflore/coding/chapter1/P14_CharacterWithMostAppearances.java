package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P14_CharacterWithMostAppearances implements Problem {

    private final String str;

    public P14_CharacterWithMostAppearances(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        P14_CharacterWithMostAppearances problem = new P14_CharacterWithMostAppearances("flore vlad emil");
        problem.solve(problem::solution1);
        problem.solve(problem::solution2);
    }

    private void solution1() {
        char[] chars = str.toCharArray();
        int[] asciiCodes = new int[256];
        int maxOccurrences = -1;
        char maxCharacter = Character.MIN_VALUE;
        for (char aChar : chars) {
            if (!Character.isWhitespace(aChar)) {
                asciiCodes[aChar]++;
                if (asciiCodes[aChar] > maxOccurrences) {
                    maxOccurrences = asciiCodes[aChar];
                    maxCharacter = aChar;
                }
            }
        }
        System.out.printf("%c, %d%n", maxCharacter, maxOccurrences);
    }

    private void solution2() {
        System.out.println(str.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(el -> "%c, %d".formatted(el.getKey(), el.getValue()))
                .orElse("nothing")
        );
    }
}
