package chap99.leetcode;

class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
