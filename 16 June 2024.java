// import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=2; i<=n/2; i++) {
            if (isPrime(i) && isPrime(n-i)) {
                list.add(i);
                list.add(n-i);
                return list;
            }
        }
        list.add(-1);
        list.add(-1);
        return list;
    }
    
    
    static boolean isPrime(int n) {
          if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
