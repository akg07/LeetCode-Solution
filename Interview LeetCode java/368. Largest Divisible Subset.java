class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();

	    Arrays.sort(nums);
	    int parent[] = new int[nums.length];
	    int cache[] = new int[nums.length];
        int maxLength = 0, maxIdx = -1;

	
	    Arrays.fill(cache, 1);
	    Arrays.fill(parent, -1);

	    for (int i = 0; i < nums.length; i++){
		    for (int j = 0; j < i; j++){
			    if (nums[i] % nums[j] == 0 && cache[i] < cache[j] + 1){
				    cache[i] = cache[j] + 1;
				    parent[i] = j; // track index of largest sequence 	
			    }
		    }
		    if (cache[i] > maxLength){
			    maxLength = cache[i];
			    maxIdx = i;
		    }
	    }

	    while (maxIdx != -1){
		    res.add(nums[maxIdx]);
		    maxIdx = parent[maxIdx];
	    }
	    return res;
    }
}