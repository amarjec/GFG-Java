class Solution
{
  public int padovanSequence(int n)
    {
        //code here.
        if(n <= 2) return 1;
        int priro1 = 1,priro2 = 1,priro3 = 1,curr =1;
        for(int i = 3; i <= n; i++) {
            curr = (priro2 + priro3)%(int)(1e9 + 7);
            priro3 = priro2;
            priro2 = priro1;
            priro1 = curr;
        }
        return curr;
        
    }
    
    
    
}
