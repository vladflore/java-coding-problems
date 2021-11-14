package dev.vladflore.coding.chapter1;

public class P32_LogicalOpsToBools {
    public static void main(String[] args) {
        int s = 21;
        int m = 10;
        if (s > m && m < 50) {
            System.out.println("%d>%d && %d<%d".formatted(s, m, m, 50));
        } else {
            System.out.println("Condition is false");
        }

        boolean logicalAnd = Boolean.logicalAnd(s > m, m < 50);
        if (logicalAnd) {
            System.out.println("%d>%d && %d<%d".formatted(s, m, m, 50));
        }
    }
}
