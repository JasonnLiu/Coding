package string;

public class Length_of_Last_Word {

	public int lengthOfLastWord(String s) {

		String[] words = s.split(" ");
		if (s == null || s.length() == 0 || words.length == 0)
			return 0;
		return words[words.length - 1].length();
	}

	public int lengthOfLastWord2(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int i = s.length() - 1;
		int len = 0;
		while (i >= 0 && s.charAt(i) == ' ') {
			i--;
		}
		while (i >= 0 && !(s.charAt(i--) == ' ')) {
			len++;
		}
		return len;
	}

	public int lengthOfLastWord3(String s) {
		s = s.trim();
		int lastIndex = s.lastIndexOf(' ') + 1;
		return s.length() - lastIndex;
	}

	public static void main(String[] args) {
		String[] words = "  a    ".split(" ");
		System.out.println(words.length);
		System.out.println(words[words.length - 1].length());
		System.out.println(words[words.length - 1]);
		System.out.println(words[words.length - 2].length());
		System.out.println(words[words.length - 3].length());

	}

}
