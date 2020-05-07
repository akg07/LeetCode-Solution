class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) return "";
        
        String ans = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(ans) != 0){
                ans = ans.substring(0, ans.length() - 1);
            }
        }
        return ans;
    }
}