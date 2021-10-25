package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

public class P4_StringContainsOnlyDigits implements Problem {

	private final String str;

	public P4_StringContainsOnlyDigits(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		P4_StringContainsOnlyDigits problem = new P4_StringContainsOnlyDigits("1234567890");
		problem.solve(problem::solution1);
		problem.solve(problem::solution2);
	}

	private void solution1() {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
	}

	private void solution2() {
		System.out.println(str.matches("[0-9]+"));
	}
}
