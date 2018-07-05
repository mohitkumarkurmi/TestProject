package com.mp.example;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileLong {
	public static void main(String[] args) throws FileNotFoundException {
		FileLong fl = new FileLong();
		fl.findLongestWords();
	}// main

	public String findLongestWords() throws FileNotFoundException {

		String longest_word = "";
		String current;
		Scanner sc = new Scanner(new File("C:/Users/MOHIT/Desktop/pdf/text.txt"));

		while (sc.hasNext()) {
			current = sc.next();
			if (current.length() > longest_word.length()) {
				longest_word = current;
			} // if

		} // while
		System.out.println(longest_word+"   "+longest_word.length());
		return longest_word;
	}// findLongestWords()
}// class