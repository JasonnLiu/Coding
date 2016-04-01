package hashtable;

import java.util.HashSet;

public class HappyNumber {

	public boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.add(n)) {
			int x = cal(n);
			if (x == 1)
				return true;
			n = x;
		}

		return false;
	}

	public int cal(int n) {
		int s = 0;
		while (n > 0) {
			s += (n % 10) * (n % 10);
			n = n / 10;
		}
		return s;
	}

	public boolean isHappy1(int n) {//链表判断是否有环的思路
		int x = n;
		int y = n;
		while (x > 1) {
			x = cal(x);
			if (x == 1)
				return true;
			y = cal(cal(y));
			if (y == 1)
				return true;
			if (x == y)
				return false;
		}
		return false;
	}

	public static void main(String[] args) {
		HappyNumber h = new HappyNumber();
		System.out.println(h.isHappy(2));
	}

}
