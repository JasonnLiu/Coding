package ch1_ArrayAndString;

public class q1 {

	public static boolean isUnique(String s) {
		if (s.length() > 256)
			return false;

		int[] strs = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (strs[c] != 0) {
				return false;
			} else {
				strs[c] = 1;
			}
		}
		return true;
	}

	// 优化，因为一个int变量占据4个字节，空间消耗太大，可以将int[]改为boolean[]，boolean变量只有一个字节。
	// 如果字符串只有英文字母的话还可以继续优化，用一个int变量即可，代替数组，一个int变量是四个字节，32位，我们用前26位，分别代表26个字符的使用

	public static boolean isUnique2(String s) {
		if (s.length() > 26)
			return false;
		int checker = 0;
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i) - 'a';
			if(((0 << val) | checker) == 1){
				return false;
			}
			checker |= (1<<val);
		}
		return true;
	}

	public static void main(String[] args) {

	}

}
