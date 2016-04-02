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

	// �Ż�����Ϊһ��int����ռ��4���ֽڣ��ռ�����̫�󣬿��Խ�int[]��Ϊboolean[]��boolean����ֻ��һ���ֽڡ�
	// ����ַ���ֻ��Ӣ����ĸ�Ļ������Լ����Ż�����һ��int�������ɣ��������飬һ��int�������ĸ��ֽڣ�32λ��������ǰ26λ���ֱ����26���ַ���ʹ��

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
