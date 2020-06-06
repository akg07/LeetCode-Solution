class Solution {
    public int lengthOfLastWord(String s) {
        
        String sarry[] = s.split(" ");
        
        if (sarry.length == 0)
            return 0;
        else
            return sarry[sarry.length - 1].length();
        
        
    }
}