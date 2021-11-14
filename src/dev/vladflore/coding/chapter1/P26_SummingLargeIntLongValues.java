package dev.vladflore.coding.chapter1;

import java.util.function.BinaryOperator;

public class P26_SummingLargeIntLongValues {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int z = Integer.sum(x, y); // same as x+y
        System.out.println(z);
        // int z1 = Math.addExact(x, y); // throws exception if it overflows
        // System.out.println(z1);
        BinaryOperator<Integer> bo = Math::addExact;
        // int z2 = bo.apply(x, y);
        // System.out.println(z2);
        // Math.incrementExact(x);
    }
}