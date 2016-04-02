package ch1_ArrayAndString;

public class q3 {

	public static boolean canReSort(String s, String t) {
		if (s.length() != t.length())
			return false;
		int[] strs = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			strs[c]++;
		}
		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			strs[c]--;
			if (strs[c] < 0)
				return false;
		}
		for (int i : strs) {
			if (i != 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(canReSort("abca", "bcaa"));
	}

}
