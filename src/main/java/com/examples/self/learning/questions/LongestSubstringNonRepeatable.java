package com.examples.self.learning.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringNonRepeatable {
    public static void main(String[] args) {
        String word = "java"; //java//
        longestSubstring(word);
    }

    public static void longestSubstring(String word){
        String longestSubstring = null;
        int longestSub = 0;
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] arr = word.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if(!map.containsKey(ch)){
                map.put(ch, i);
            }else{
                i = map.get(ch);
                map.clear();
            }

            if(map.size() > longestSub){
                longestSub = map.size();
                longestSubstring = map.keySet().toString();
            }
        }

        System.out.println(longestSubstring);
    }
}
