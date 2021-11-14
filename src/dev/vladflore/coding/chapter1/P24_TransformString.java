package dev.vladflore.coding.chapter1;

public class P24_TransformString {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("An argument is expected!");
            return;
        }
        String res = args[0].transform(String::toUpperCase).transform(str -> str.repeat(2));
        System.out.println(res);
    }
}
