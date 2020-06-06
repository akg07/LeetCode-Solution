class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
		
		char char_s[] = s.toCharArray();
		char char_t[] = t.toCharArray();
		
		Arrays.sort(char_s);
		Arrays.sort(char_t);
		
		String sorted_s = new String(char_s);
		String sorted_t = new String(char_t);
		
		if(sorted_s.equals(sorted_t)) return true;
		
		return false;
    }
}