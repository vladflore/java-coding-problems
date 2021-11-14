package dev.vladflore.coding.chapter1;

import java.util.Scanner;

public class P21_RemoveLeadingTrailingSpaces {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();

            System.out.println(line.trim());
            System.out.println(line.strip());
            System.out.println(line.stripLeading());
            System.out.println(line.stripTrailing());
        } catch (Exception e) {
        }
    }
}
