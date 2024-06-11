class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        Integer[] idx = new Integer[n];
        
        // Initialize the index array
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }
        
        // Sort the index array based on the absolute difference
        Arrays.sort(idx, (a, b) -> Integer.compare(
            Math.abs(arr[b] - brr[b]),
            Math.abs(arr[a] - brr[a])
        ));
        
        long ans = 0;
        for (int i : idx) {
            // Choose the tip based on the conditions provided
            if ((arr[i] > brr[i] && x > 0) || y == 0) {
                x--;
                ans += arr[i];
            } else {
                y--;
                ans += brr[i];
            }
        }
        return ans;
    }
}
