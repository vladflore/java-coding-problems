package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

public class P10_GeneratePermutations implements Problem {

    private final String str;

    public P10_GeneratePermutations(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        P10_GeneratePermutations problem = new P10_GeneratePermutations("ABCD");
        problem.solve(problem::solution1);
        problem.solve(problem::solution2);
    }

    private void solution1() {
        permuteAndPrint("", str);
    }

    private void permuteAndPrint(String current, String availablePool) {
        int n = availablePool.length();
        if (n == 0) {
            System.out.println(current + " ");
        } else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(current + availablePool.charAt(i),
                    availablePool.substring(0, i) + availablePool.substring(i + 1, n));
            }
        }
    }

    private void solution2() {
        System.out.println("TODO implement me");
    }
}
