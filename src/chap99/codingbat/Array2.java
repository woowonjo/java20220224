package chap99.codingbat;

public class Array2 {
	public int countEvens(int[] nums) {
		int cnt = 0;

		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] % 2) == 0) {
				cnt++;
			}
		} 

		return cnt;
	}

}
