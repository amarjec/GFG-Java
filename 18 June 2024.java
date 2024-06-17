class Solution {
    int rectanglesInCircle(int R) {
          int l=1,b=1,cnt=0;
        while(l*l+b*b<=4*R*R){
            while(l*l+b*b<=4*R*R){
                cnt++;
                b++;
            }
            l++;
            b=1;
        }
        return cnt;
    }
};
