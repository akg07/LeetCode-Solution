class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
		
		int[] LIS = new int[n+1];
		Arrays.fill(LIS, 1);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				
				if(nums[i] > nums[j]) {
					LIS[i] = Math.max(LIS[i], LIS[j] + 1);
				}
			}
		}
		
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, LIS[i]);
		}
        return ans;
    }
}