package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateStringNTimes implements Problem {

    private final String str;
    private final int n;

    public ConcatenateStringNTimes(String str, int n) {
        this.str = str;
        this.n = n;
    }

    public static void main(String[] args) {
        ConcatenateStringNTimes problem = new ConcatenateStringNTimes("hi", 3);
        problem.solve(problem::solution1);
    }

    private void solution1() {
        System.out.println(str.repeat(n));
        System.out.println(String.join("", Collections.nCopies(n, str)));
        System.out.println(Stream.generate(() -> str).limit(n).collect(Collectors.joining()));
    }

}
