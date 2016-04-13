package dynamicProgramming;

public class House_Robber {

	/*
	 * 这个解法是错误的，我们只用了一个变量来储存最大值，并不符合动态规划里，需要保存每一状态的思想
	 * */
	public int rob1(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);
		int money = 0;
		int i = 1;
		for (; i < nums.length - 1;) {
			if (nums[i] >= nums[i - 1] + nums[i + 1]) {
				money += nums[i];
				i = i + 2;
			} else {
				money += nums[i - 1] + nums[i + 1];
				i = i + 3;
			}
		}
		if (i == nums.length - 1) {
			money += nums[i];
		}
		return money;
	}

	public int rob2(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);
		int money[] = new int[nums.length];
		money[0] = nums[0];
		money[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			if (money[i - 2] + nums[i] > money[i - 1]) {
				money[i] = money[i - 2] + nums[i];
			} else {
				money[i] = money[i - 1];
			}
		}
		return money[nums.length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
