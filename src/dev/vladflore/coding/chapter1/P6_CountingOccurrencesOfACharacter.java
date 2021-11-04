package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

public class P6_CountingOccurrencesOfACharacter implements Problem {

    private final String str;
    private final String ch;

    public P6_CountingOccurrencesOfACharacter(String str, String ch) {
        this.str = str;
        this.ch = ch;
    }

    public static void main(String[] args) {
        P6_CountingOccurrencesOfACharacter problem = new P6_CountingOccurrencesOfACharacter("flore\uD83D\uDC95vlad\uD83D\uDC95emil", "\uD83D\uDC95");
        problem.solve(problem::solution1);
        problem.solve(problem::solution2);
    }

    private void solution1() {
        System.out.println(str.length() - str.replace(ch, "").length());
    }

    private void solution2() {
        if (ch.codePointCount(0, ch.length()) > 1) {
            System.out.println(-1);
            return;
        }
        int result = str.length() - str.replace(ch, "").length();
        System.out.println((ch.length() == 2) ? result / 2 : result);
    }
}
