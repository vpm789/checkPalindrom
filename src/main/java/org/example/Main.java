package org.example;

public class Main {
    public static void main(String[] args) {
        String s = "101";
        System.out.println(checkPalindrome(s));
    }

    public static boolean checkPalindrome(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}