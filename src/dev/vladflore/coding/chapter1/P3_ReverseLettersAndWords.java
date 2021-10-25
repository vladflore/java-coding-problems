package dev.vladflore.coding.chapter1;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import dev.vladflore.coding.Problem;

public class P3_ReverseLettersAndWords implements Problem {

	private final String str;

	public P3_ReverseLettersAndWords(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		P3_ReverseLettersAndWords problem = new P3_ReverseLettersAndWords("flore vlad emil");
		problem.solve(problem::solution1);
		problem.solve(problem::solution2);
		problem.solve(problem::solution3);
	}

	private void solution1() {
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			String word = words[i];
			result.append(reverse(word)).append(" ");
		}
		System.out.println(result);
	}

	private String reverse(String word) {
		StringBuilder reversed = new StringBuilder();
		for (int i = word.length() - 1; i >= 0; i--) {
			reversed.append(word.charAt(i));
		}
		return reversed.toString();
	}

	private void solution2() {
		System.out.println(new StringBuilder(str).reverse());
	}

	private void solution3() {
		List<String> words = Pattern.compile("\\s+")
				.splitAsStream(str)
				.map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.toList());
		Collections.reverse(words);
		System.out.println(String.join(" ", words));
	}
}
