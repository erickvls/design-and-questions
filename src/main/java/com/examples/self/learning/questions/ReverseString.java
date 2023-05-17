package com.examples.self.learning.questions;

public class ReverseString {
    public static void main(String[] args) {
        String word = "Potato";
        String sentence = "Potato is good";
        reverseUsingToCharArray(word);
        reverseUsingCharAt(word);
        reverseUsingStringBuilder(word);
        reverseSentence(sentence);
    }

    public static void reverseUsingToCharArray(String word){
        char[] array = word.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void reverseUsingCharAt(String word){
        for (int i = word.length() - 1; i >=0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }

    public static void reverseUsingStringBuilder(String word){
        StringBuilder sb = new StringBuilder(word);
        System.out.println(sb.reverse());
    }

    public static void reverseSentence(String word){
        String[] list = word.split(" ");
        for (String eachWord : list) {
            for (int j = eachWord.length() - 1; j >= 0; j--) {
                System.out.print(eachWord.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
