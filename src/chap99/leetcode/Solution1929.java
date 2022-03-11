package chap99.leetcode;

class Solution1929 {
	public int[] getConcatenation(int[] nums) {
		int[] result = new int[nums.length * 2];

		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			result[i + nums.length] = nums[i];
		}

		return result;
	}
}
