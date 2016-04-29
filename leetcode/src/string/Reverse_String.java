package string;

public class Reverse_String {

	public String reverseString(String s) {
		if (s == null || s.length() == 0)
			return "";
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
