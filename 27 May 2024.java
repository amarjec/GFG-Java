class Solution {
    public static int longestSubseq(int n, int[] a) {
        int[] dp = new int[n];
        Arrays.fill(dp , 1);
        int max = 1;
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                if(Math.abs(a[i]-a[j]) == 1){
                    dp[i] = Math.max(dp[i] , 1 + dp[j]);
                    max = Math.max(max , dp[i]);
                }
            }
        }
        return max;
    }
}
