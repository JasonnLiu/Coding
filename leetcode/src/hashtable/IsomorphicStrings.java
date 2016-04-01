package hashtable;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public boolean isIsomorphic(String s, String t) {

		Map<Character, Character> m = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			char b = t.charAt(i);
			if (m.containsKey(a)) {
				char bb = m.get(a);
				if (bb != b) {
					return false;
				} else {
					continue;
				}
			} else {
				if (m.containsValue(b))
					return false;
				m.put(a, b);
			}
		}
		return true;
	}

	public boolean isIsomorphic1(String s, String t) {// hash˼·
		int[] str1 = new int[256];
		int[] str2 = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			char b = t.charAt(i);
			if(str1[a] != str2[b]){
				return false;
			}
			str1[a] = i+1;
			str2[b] = i+1;
		}
		return true;
	}

	public static void main(String[] args) {
		char a = 'b';
		char b = 'b';
		System.out.println(a == b);

	}

}
