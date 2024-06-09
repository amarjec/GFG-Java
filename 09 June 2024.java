class Solution {
   public static void zigZag(int n, int[] arr) {
    boolean flag = true;
    for (int i = 0; i < n - 1; i++) {
        if (flag == true) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        } else {
            if (arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
        flag = !flag;
    }
    return;
   }
   static void swap (int[] arr, int a, int b) {
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
   }
 
}
