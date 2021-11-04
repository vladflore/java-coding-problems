package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

import java.util.stream.Collectors;

public class P13_RemoveGivenCharacter implements Problem {

    private final String str;
    private final char givenChar;

    public P13_RemoveGivenCharacter(String str, char givenChar) {
        this.str = str;
        this.givenChar = givenChar;
    }

    public static void main(String[] args) {
        P13_RemoveGivenCharacter problem = new P13_RemoveGivenCharacter("flore vlad emil", 'e');
        problem.solve(problem::solution1);
    }

    private void solution1() {
        System.out.println(str
                .chars()
                .filter(c -> c != givenChar)
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .collect(Collectors.joining())
        );
    }
}
