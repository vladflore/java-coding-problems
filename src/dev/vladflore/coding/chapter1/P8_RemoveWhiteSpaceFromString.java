package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

public class P8_RemoveWhiteSpaceFromString implements Problem {

    private final String str;

    public P8_RemoveWhiteSpaceFromString(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        P8_RemoveWhiteSpaceFromString problem = new P8_RemoveWhiteSpaceFromString("flore   vlad     emil");
        problem.solve(problem::solution1);
    }

    private void solution1() {
        System.out.println(str.replaceAll("\\s", ""));
    }

}
