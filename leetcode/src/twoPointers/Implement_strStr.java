package twoPointers;

public class Implement_strStr {

	public int strStr(String haystack, String needle) {
		int occur = 0;
		int len = needle.length();
		if (len == 0)
			return 0;
		while (occur <= haystack.length() - len) {
			int i = 0;
			while (haystack.charAt(occur++) == needle.charAt(i++)) {
				if (i == len) {
					return occur - len;
				}
			}
			occur = occur - i + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
