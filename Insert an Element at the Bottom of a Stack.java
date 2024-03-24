class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        
        Stack<Integer>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        while(!st.isEmpty()){
           st1.push(st.pop());
        }
         st2.push(x);
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
      
       return st2;
    }
}
