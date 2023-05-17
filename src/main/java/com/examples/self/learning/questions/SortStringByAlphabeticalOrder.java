package com.examples.self.learning.questions;

import java.util.Arrays;

public class SortStringByAlphabeticalOrder {
    public static void main(String[] args) {
        String word = "Potato";
        sort(word);
    }

    public static void sort(String word) {
        char[] ch = word.toLowerCase().toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
    }
}