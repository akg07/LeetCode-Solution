class Solution {
    public int nthUglyNumber(int n) {
        long[] ugly = new long[n];
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        
        long nm2 = 2;
        long nm3 = 3;
        long nm5 = 5;
        
        ugly[0] = 1;
        long num = 1;
        
        for(int i = 1; i < n; i++) {
            num = Math.min(nm2, Math.min(nm3, nm5));
            ugly[i] = num;
            
            if(num == nm2){
                i2++;
                nm2 = ugly[i2] * 2;
            }
            if(num == nm3){
                i3++;
                nm3 = ugly[i3] * 3;
            }
            if(num == nm5){
                i5++;
                nm5 = ugly[i5] * 5;
            }
        }
        return (int)ugly[n-1];
    }
}