package string;

public class Longest_Common_Prefix {

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		int i = 0;
		String sb = "";
		boolean flag = true;
		while (flag) {
			char tmp = 0;
			for (String s : strs) {
				if (s.length() == 0)
					return "";
				if (i >= s.length()) {
					flag = false;
					break;
				}
				if (tmp == 0) {
					tmp = s.charAt(i);
				} else {
					if (!(s.charAt(i) == tmp)) {
						flag = false;
						break;
					}
				}
			}
			i++;
			if (flag == true) {
				sb += tmp;
			}
		}
		return sb.toString();

	}
	
	public String longestCommonPrefix2(String[] strs) {
	    if(strs == null || strs.length == 0)    return "";
	    String pre = strs[0];
	    int i = 1;
	    while(i < strs.length){
	        while(strs[i].indexOf(pre) != 0)
	            pre = pre.substring(0,pre.length()-1);
	        i++;
	    }
	    return pre;
	}

	public static void main(String[] args) {
		String[] ss = { "a" };
		System.out.println(Longest_Common_Prefix.longestCommonPrefix(ss));

	}

}
