package dev.vladflore.coding.chapter1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import dev.vladflore.coding.Problem;

public class P2_FindFirstNonRepeatedCharacter implements Problem {

	private final String str;

	public P2_FindFirstNonRepeatedCharacter(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		P2_FindFirstNonRepeatedCharacter problem = new P2_FindFirstNonRepeatedCharacter("aabbcc\uD83D\uDC95");
		problem.solve(problem::solution1);
		problem.solve(problem::solution2);
		problem.solve(problem::solution3);
	}

	private void solution1() {
		// accommodate only the extended ascii codes
		int[] flags = new int[256];
		Arrays.fill(flags, -1);
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (flags[c] == -1) {
				// this is the first occurrence
				flags[c] = i;
			}
			else {
				// the character c appears again, mark this accordingly so that this position is not considered valid
				flags[c] = -2;
			}
		}
		int position = Integer.MAX_VALUE;
		for (int i = 0; i < 256; i++) {
			if (flags[i] >= 0) {
				position = Math.min(position, flags[i]);
			}
		}
		System.out.println(position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position));
	}

	private void solution2() {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			map.compute(c, (key, value) -> value == null ? 1 : ++value);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				return;
			}
		}
		System.out.println(Character.MIN_VALUE);
	}

	private void solution3() {
		Map<Integer, Long> map = str.codePoints()
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Integer codePoint = map.entrySet().stream()
				.filter(entry -> entry.getValue() == 1L)
				.findFirst()
				.map(Entry::getKey)
				.orElse((int) Character.MIN_VALUE);
		System.out.println(String.valueOf(Character.toChars(codePoint)));
	}
}
