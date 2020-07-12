class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        
        //floyd's cycle detections algorithum
        int slow = nums[0];
        int fast = nums[0];
        
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];  
        }while(slow != fast);
        
        fast = nums[0];
        
        while(slow != fast){
            fast = nums[fast];
            slow = nums[slow];
        }
        return fast;
    }
}