class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        // Your code goes here
        long asum=0,bsum=0;
        for(long i:a)asum+=i;
        for(long i: b)bsum+=i;
        if(asum>bsum)return findSwapValues(b,m,a,n);
        if((bsum-asum)%2!=0)return -1;
        long d=(bsum-asum)/2;
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(search(a[i]+d,b,m))return (long)1;
        }
        return (long)-1;
    }
    boolean search(long k,long[] b,int m){
        int low=0,high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(b[mid]==k)return true;
            else if(b[mid]<k)low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}
