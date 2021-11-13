package dev.vladflore.coding.chapter1;

public class P22_LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(solve(args));
    }

    private static String solve(String[] strings) {
        if (strings.length == 1) {
            return strings[0];
        }
        int firstLen = strings[0].length();
        for (int prefixLen = 0; prefixLen < firstLen; prefixLen++) {
            char ch = strings[0].charAt(prefixLen);
            for (int i = 1; i < strings.length; i++) {
                if (prefixLen >= strings[i].length() || strings[i].charAt(prefixLen) != ch) {
                    return strings[i].substring(0, prefixLen);
                }
            }
        }
        return strings[0];
    }

}