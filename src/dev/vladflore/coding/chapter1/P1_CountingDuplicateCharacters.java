package dev.vladflore.coding.chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import dev.vladflore.coding.Problem;

public class P1_CountingDuplicateCharacters implements Problem {

	private final String str;

	public P1_CountingDuplicateCharacters(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		P1_CountingDuplicateCharacters problem = new P1_CountingDuplicateCharacters("ab\uD83D\uDC95");
		problem.solve(problem::solution1);
		problem.solve(problem::solution2);
		problem.solve(problem::solution3);
		problem.solve(problem::solution4);
	}

	private void solution1() {
		Map<Character, Integer> result = new HashMap<>();
		for (char ch : str.toCharArray()) {
			result.compute(ch, (key, value) -> value == null ? 1 : ++value);
		}
		System.out.println(result);
	}

	private void solution2() {
		Map<Character, Long> result = str
				.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
	}

	private void solution3() {
		Map<String, Integer> result = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			int codePoint = str.codePointAt(i);
			String chars = String.valueOf(Character.toChars(codePoint));
			if (Character.charCount(codePoint) == 2) {
				i++;
			}
			result.compute(chars, (key, value) -> value == null ? 1 : ++value);
		}
		System.out.println(result);
	}

	private void solution4() {
		System.out.println(
				str.codePoints()
						.mapToObj(codePoint -> String.valueOf(Character.toChars(codePoint)))
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		);
	}
}
