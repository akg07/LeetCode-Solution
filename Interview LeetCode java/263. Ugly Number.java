class Solution {
    public boolean isUgly(int num) {
        if(num == 0) return false;
        
        int flag = 1;
        while(true){
            flag = 1;
            if(num%2 == 0){
                num = num/2;
                flag = 0;
                continue;
            }
            if(num%3 == 0){
                num = num/3;
                flag = 0;
                continue;
            }
            if(num%5 == 0){
                num = num/5;
                flag = 0;
                continue;
            }
            if(flag == 1) break;
        }
        
        return (num == 1);
    }
}