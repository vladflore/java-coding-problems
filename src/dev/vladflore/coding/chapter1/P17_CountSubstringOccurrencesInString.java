package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P17_CountSubstringOccurrencesInString implements Problem {

    private final String str;
    private final String subStr;

    public P17_CountSubstringOccurrencesInString(String str, String subStr) {
        this.str = str;
        this.subStr = subStr;
    }

    public static void main(String[] args) {
        P17_CountSubstringOccurrencesInString problem = new P17_CountSubstringOccurrencesInString("aa", "aa");
        problem.solve(problem::solution1);
        problem.solve(problem::solution2);
        problem.solve(problem::solution3);
    }

    private void solution1() {
        int position = 0;
        int count = 0;
        while ((position = str.indexOf(subStr, position)) != -1) {
            count++;
            position += subStr.length();
        }
        System.out.println(count);
    }

    private void solution2() {
        int res = str.split(Pattern.quote(subStr), -1).length - 1;
        System.out.println((Math.max(res, 0)));
    }

    private void solution3() {
        Pattern pattern = Pattern.compile(Pattern.quote(subStr));
        Matcher matcher = pattern.matcher(subStr);
        int position = 0, count = 0;
        while (matcher.find(position)) {
            count++;
            position = matcher.start() + 1;
        }
        System.out.println(count);
    }
}
