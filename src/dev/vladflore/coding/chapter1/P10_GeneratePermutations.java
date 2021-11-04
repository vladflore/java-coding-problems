package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

public class P10_GeneratePermutations implements Problem {

    private final String str;

    public P10_GeneratePermutations(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        P10_GeneratePermutations problem = new P10_GeneratePermutations("ABC");
        problem.solve(problem::solution1);
        problem.solve(problem::solution2);
    }

    private void solution1() {
        permuteAndPrint("", str);
    }

    private void permuteAndPrint(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                String p1 = prefix + str.charAt(i);
                String p2 = str.substring(0, i) + str.substring(i + 1, n);
                permuteAndPrint(p1, p2);
            }
        }
    }

    private void solution2() {
        System.out.println("TODO implement me");
    }
}
