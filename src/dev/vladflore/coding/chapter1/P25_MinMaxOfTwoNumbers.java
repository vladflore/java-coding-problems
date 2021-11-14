package dev.vladflore.coding.chapter1;

import java.util.function.BinaryOperator;

public class P25_MinMaxOfTwoNumbers {
    public static void main(String[] args) {
        if (args == null || args.length != 2) {
            System.out.println("Two integer arguments are expected!");
            return;
        }
        
        int int1 = Integer.parseInt(args[0]);
        int int2 = Integer.parseInt(args[1]);

        System.out.println("min(%d,%d)=%d".formatted(int1, int2, Math.min(int1, int2)));
        System.out.println("max(%d,%d)=%d".formatted(int1, int2, Math.max(int1, int2)));

        System.out.println(BinaryOperator.minBy(Integer::compare).apply(int1, int2));
        System.out.println(BinaryOperator.maxBy(Integer::compare).apply(int1, int2));
    }
}
