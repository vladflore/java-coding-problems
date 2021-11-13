package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

import java.util.regex.Pattern;

public class P16_StringContainsSubstring implements Problem {

    private final String str;
    private final String subStr;


    public P16_StringContainsSubstring(String str, String subStr) {
        this.str = str;
        this.subStr = subStr;
    }

    public static void main(String[] args) {
        P16_StringContainsSubstring problem = new P16_StringContainsSubstring("flore vlad emil", "VLAD");
        problem.solve(problem::solution1);
    }

    private void solution1() {
        System.out.println(str.matches("(?i).*" + Pattern.quote(subStr) + ".*"));
    }
}
