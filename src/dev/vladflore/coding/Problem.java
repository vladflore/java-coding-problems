package dev.vladflore.coding;

public interface Problem {
	default void solve(Solution solution) {
		solution.run();
	}
}
