class Solution {
    static String armstrongNumber(int n){
        // code here
        int a, extra = n, num = 0;
        while (extra > 0) {
            a = extra%10;
            num = num + (a*a*a);
            extra /= 10;
        }
        String yes = "Yes";
        String no = "No";
        if ( num == n) {
            return yes;
        }
        else {
            return no;
        }
    }
}
