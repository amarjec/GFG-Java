class Solution {
    public static int countNumberswith4(int n) {
        // code here
        int count = 0;
        for(int i = 1; i <=n; i++) {
                int num = i;
            while (num > 0) {
                int digit = num % 10;
                if (digit == 4) {
                    count++;
                    break;
                }
                num = num / 10;
            }
        }
        return count;
    }
}
