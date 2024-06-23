class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        ArrayList<Integer>ar=new ArrayList<>();
        Map<Integer,Character>hmp=new LinkedHashMap<>();
        Stack<Character>st=new Stack<>();
        int x=1,y=1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                st.push('(');
                hmp.put(x,'(');
                ar.add(x);
                y=x;
                x++;
            }
            else if(str.charAt(i)==')')
            {
                if(st.peek()=='(')
                {
                    st.pop();
                    while(true)
                    {
                       if(hmp.containsKey(y))
                       {
                           ar.add(y);
                           hmp.remove(y);
                           y--;
                           break;
                       }
                       else 
                       {
                           y--;
                       }
                    }
                }
            }
        }
        return ar;
    }
};
