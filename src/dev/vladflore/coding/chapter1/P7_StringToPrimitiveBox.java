package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

public class P7_StringToPrimitiveBox implements Problem {

    private final String str;

    public P7_StringToPrimitiveBox(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        P7_StringToPrimitiveBox problem = new P7_StringToPrimitiveBox("123");
        problem.solve(problem::solution1);
        problem.solve(problem::solution2);
    }

    private void solution1() {
        try {
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private void solution2() {
        System.out.println("TODO implement me");
    }
}
