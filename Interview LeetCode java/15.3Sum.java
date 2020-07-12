class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < nums.length;) {
            if (nums[i] > 0) {
                break;
            }
            int target = -nums[i], lo = i + 1, hi = nums.length - 1;
            while (lo < hi) {
                int sum = nums[lo] + nums[hi];
                if (sum > target) {
                    hi = hi - 1;
                } else if (sum < target) {
                    lo = lo + 1;
                } else {
                    result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    do {
                        ++ lo;
                    } while (lo < hi && nums[lo] == nums[lo - 1]);
                    do {
                        -- hi;
                    } while (lo < hi && nums[hi] == nums[hi + 1]);
                }
                            
            }
            while (i < nums.length && -target == nums[i]) ++i;
        }
        return result;
    }
}