class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int n = s.length();
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (int j = 0, i = 0; j < n; j++) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                i = Math.max(map.get(ch), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(ch, j + 1);
        }
        
        return ans;
    }
}