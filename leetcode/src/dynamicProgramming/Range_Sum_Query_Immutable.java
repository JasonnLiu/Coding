package dynamicProgramming;

public class Range_Sum_Query_Immutable {

	int[] nums;

	public Range_Sum_Query_Immutable(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}
		this.nums = nums;
	}

	public int sumRange(int i, int j) {
		if (i == 0)
			return nums[j];
		return nums[j] - nums[i - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
