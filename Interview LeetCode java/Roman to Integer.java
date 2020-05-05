class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> value = new HashMap<>();
        value.put('I', 1);
        value.put('V', 5);
        value.put('X', 10);
        value.put('L', 50);
        value.put('C', 100);
        value.put('D', 500);
        value.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            char ch1 = s.charAt(i + 1);
            if ((value.get(ch)) < value.get(ch1))
                res -= value.get(ch);
            else
                res += value.get(ch);
        }
        return (res + value.get(s.charAt(s.length() - 1)));
    }
}