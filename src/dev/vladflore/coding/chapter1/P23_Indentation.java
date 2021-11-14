package dev.vladflore.coding.chapter1;

import java.util.List;

public class P23_Indentation {
    public static void main(String[] args) {
        List<String> days = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        for (int i = 0; i < days.size(); i++) {
            System.out.print(days.get(i).indent(i));
        }
    }
}