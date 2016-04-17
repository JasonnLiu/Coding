package twoPointers;

public class Valid_Palindrome {

	public boolean isPalindrome(String s) {
		if (s.isEmpty()) {
			return true;
		}
		int head = 0, tail = s.length() - 1;
		char cHead, cTail;
		while (head <= tail) {
			cHead = s.charAt(head);
			cTail = s.charAt(tail);
			if (!Character.isLetterOrDigit(cHead)) {
				head++;
			} else if (!Character.isLetterOrDigit(cTail)) {
				tail--;
			} else {
				if (Character.toLowerCase(cHead) != Character
						.toLowerCase(cTail)) {
					return false;
				}
				head++;
				tail--;
			}
		}

		return true;

	}

	public boolean isPalindrome2(String s) {
		String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		String rev = new StringBuffer(actual).reverse().toString();
		return actual.equals(rev);
	}

	public static void main(String[] args) {
		int a1 = 'b' - 'a';
		int a2 = 'B' - 'a';
		System.out.println(a1);
		System.out.println(a2);

	}

}