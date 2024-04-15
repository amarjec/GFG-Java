class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int r  = 0;
        int count = 0;
        int[] ans = new int[q];
        for(int i = 0;i < q;i++){
            int j = query[i];
            for(int k = 0;k < n;k++){
                if(a[j] >= b[k]){
                    count++;
                }
            }
            ans[r] = count;
            r++;
            count = 0;
        }
        return ans;

    }
}
