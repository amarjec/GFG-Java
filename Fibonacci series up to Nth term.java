class Solution {

    int[] Series(int n) {
        // code here
        int arr[] = new int[n+1];
        int a=0;
        int b=1;
        int c = 1;
        int mod = (int)1000000000+7;
        
        for (int i=0; i<=n; i++) {
            arr[i] = a %mod;
            c = (a+b) %mod;
            a = b %mod;
            b = c %mod;
        }
        return arr;
    }
}
