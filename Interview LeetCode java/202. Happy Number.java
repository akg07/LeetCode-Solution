// import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        
        while(!set.contains(n)) {
            set.add(n);
            
            n = getSum(n);
            if(n == 1) return true;
        }
        
        return false;
    }
    
    public int getSum(int n) {
        int sum = 0;
        int rem = 0;
        while(n > 0) {
            rem = n % 10;
            sum += (rem*rem);
            n = n/10;
        }
        return sum;
    }
}