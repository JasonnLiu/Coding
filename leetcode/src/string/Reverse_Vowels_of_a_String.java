package string;

import java.util.ArrayList;
import java.util.List;

public class Reverse_Vowels_of_a_String {

	public String reverseVowels(String s) {
		if (s == null || s.length() == 0)
			return s;
		String vowels = "aeiouAEIOU";
		char[] chars = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {

			while (start < end && !vowels.contains(chars[start] + "")) {
				start++;
			}

			while (start < end && !vowels.contains(chars[end] + "")) {
				end--;
			}

			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;

			start++;
			end--;
		}
		return new String(chars);
	}

	public static void main(String[] args) {
		Reverse_Vowels_of_a_String a = new Reverse_Vowels_of_a_String();
		System.out.println(a.reverseVowels("a a"));

	}

}
