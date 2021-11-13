package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

import java.util.Arrays;
import java.util.Comparator;

public class P15_SortStringByLength implements Problem {

    private final String[] strings;
    private final SortDirection sortDirection;

    public P15_SortStringByLength(String[] strings, SortDirection sortDirection) {
        this.strings = strings;
        this.sortDirection = sortDirection;
    }

    public static void main(String[] args) {
        P15_SortStringByLength problem = new P15_SortStringByLength(new String[]{"aaa", "aa", "a"}, SortDirection.ASC);
        problem.solve(problem::solution1);
        problem.solve(problem::solution2);
    }

    private void solution1() {
        if (sortDirection == SortDirection.ASC) {
            Arrays.sort(strings, Comparator.comparing(String::length));
        } else {
            Arrays.sort(strings, Comparator.comparing(String::length).reversed());
        }
        System.out.println(Arrays.toString(strings));
    }

    private void solution2() {
        String[] res;
        if (sortDirection == SortDirection.ASC) {
            res = Arrays.stream(this.strings).sorted(Comparator.comparing(String::length)).toArray(String[]::new);
        } else {
            res = Arrays.stream(this.strings).sorted(Comparator.comparing(String::length).reversed()).toArray(String[]::new);
        }
        System.out.println(Arrays.toString(res));

    }
}
