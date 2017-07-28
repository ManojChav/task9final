package com.bellinfo.task9final;

import java.util.HashMap;
import java.util.Scanner;

public class firstnonrepeatchar {

	public static void main(String[] args) {

		System.out.println(" Please enter the input string :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c = firstNonRepeatedCharacter(s);
		System.out.println("The first non repeated character in string is :  " + c);
	}

	public static Character firstNonRepeatedCharacter(String str) {
		HashMap<Character, Integer> charhashtable = new HashMap<Character, Integer>();
		int i, length;
		Character c;
		length = str.length();
		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (charhashtable.containsKey(c)) {

				charhashtable.put(c, charhashtable.get(c) + 1);
			} else {
				charhashtable.put(c, 1);
			}
		}

		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (charhashtable.get(c) == 1)
				return c;
		}
		return null;
	}
}
