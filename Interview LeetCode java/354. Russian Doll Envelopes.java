class Solution {
    public int maxEnvelopes(int[][] envelopes) {
//         if(envelopes == null || envelopes.length == 0) return 0;
        
//         int n = envelopes.length;
//         int max= 1;
//         int dp[] = new int[n];
//         Arrays.fill(dp, 1);
        
//         Arrays.sort(envelopes, new Comparator<int[]>(){
//             @Override
//             public int compare(final int[] a, final int[] b){
//                 if(a[0] != b[0]) return a[0] - b[0];
//                 else return a[1] - b[1];
//             }
//         });
        //This one is Dp Approach
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < i; j++){
//                 if(envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]){
//                     dp[i] = Math.max(dp[i], dp[j] + 1);
//                 }
//             }
//             if(max < dp[i]) {
//                 max = dp[i];
//             }
//         }
//         return max;
       
        Comparator c = Comparator.comparing((int[] arr) -> arr[0])
            .thenComparing((int[] arr) ->arr[1],Comparator.reverseOrder());
        Arrays.sort(envelopes, c);
 
        ArrayList<Integer> list = new ArrayList<>();
     
        for(int[] arr: envelopes){
            int target = arr[1];
 
            if(list.isEmpty()||target>list.get(list.size()-1)){
                list.add(target);
            }else{
                int i=0; 
                int j=list.size()-1;
    
                while(i<j){         //Here we apply Binary Search 
                    int m = i + (j-i)/2;
                    if(list.get(m)>=target){
                        j = m;
                    }else{
                        i = m+1;
                    }
                }
 
                list.set(j, target);
            }
        } 
    return list.size();
    }
}