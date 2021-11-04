package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

public class P11_CheckIfPalindrome implements Problem {

    private final String str;

    public P11_CheckIfPalindrome(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        P11_CheckIfPalindrome problem = new P11_CheckIfPalindrome("abba");
        problem.solve(problem::solution1);
        problem.solve(problem::solution2);
    }

    private void solution1() {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    private void solution2() {
        boolean equals = str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(equals);
    }
}
