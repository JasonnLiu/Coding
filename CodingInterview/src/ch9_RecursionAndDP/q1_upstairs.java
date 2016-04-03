package ch9_RecursionAndDP;

public class q1_upstairs {

	public static void up(int done, int step, Helper h) {
		done += step;
		if (done == h.n) {
			h.counter++;
			return;
		} else if (done > h.n) {
			return;
		} else {
			up(done, 1, h);
			up(done, 2, h);
			up(done, 3, h);
		}

	}

	public static void up(int done, Helper h) {
		up(done, 1, h);
		up(done, 2, h);
		up(done, 3, h);
	}

	public static void main(String[] args) {
		Recursion_up(20);
		DP_up(20);
	}

	public static void Recursion_up(int n) {
		Helper h = new Helper(n);
		up(0, h);
		System.out.println(h.counter);
	}

	public static void DP_up(int n) {
		int[] helper = new int[n];
		helper[n - 1] = 1;
		helper[n - 2] = 2;
		helper[n - 3] = 4;
		for (int i = n - 4; i >= 0; i--) {
			helper[i] = helper[i + 1] + helper[i + 2] + helper[i + 3];
		}
		System.out.println(helper[0]);
	}

}

class Helper {
	public Helper(int n) {
		this.n = n;
	}

	public int n;
	public int counter;
}