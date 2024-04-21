class Solution {
    // Function to partition the array around the range such 
    // that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b) {
        // Arrays.sort(array);
        // int[] ans = new int[array.length];
        // int i = 0;
        // for (int j = 0; j < array.length; j++) {
        //     if (array[j] < a) {
        //         ans[i++] = array[j];
        //     }
        // }
        // for (int j = 0; j < array.length; j++) {
        //     if (array[j] >= a && array[j] < b) {
        //         ans[i++] = array[j];
        //     }
        // }
        // for (int j = 0; j < array.length; j++) {
        //     if (array[j] >= b) {
        //         ans[i++] = array[j];
        //     }
        // }
        // System.arraycopy(ans, 0, array, 0, array.length);
        // Approach 2(More optimal approach)
        int n = array.length;
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (array[mid] < a) {
                swap(array, low, mid);
                low++;
                mid++;
            } else if (array[mid] >= a && array[mid] <= b) {
                mid++;
            } else {
                swap(array, mid, high);
                high--;
            }
        }
    }
    
    // Helper function to swap elements at two indices in an array
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
