package com.examples.self.learning.questions;


import java.util.*;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		String word = "potato is good is two";
		removeDuplicatesUsingStringBuilder(word);
		removeDuplicatesUsingSet(word);
	}

	public static void removeDuplicatesUsingStringBuilder(String word){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int index = word.indexOf(ch, i+1); // Check if the "ch" is present in the word string starting from index i + 1, that is, "otato is good"
			if(index == -1 ){ // Char is not present
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}

	public static void removeDuplicatesUsingSet(String word){  // Using a set, it is good remember that it will not keep order, because set is unordered collection
		Set<Character> nonRepeatable = new HashSet<>();
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			nonRepeatable.add(ch);
		}
		nonRepeatable.forEach(System.out::print);
	}

}


