class Solution {
    public static String oddEven(String s) {
        // code here
        int map[] = new int[26];
        for(char c:s.toCharArray()){
            map[c-'a']+=1;
        }
        int x = 0;
        int y = 0;
        for(int i=0;i<map.length;i+=1){
            if(i%2!=0){
                //even
                if(map[i]>0&&map[i]%2==0){
                    x+=1;
                }
            }else{
                //odd
                if(map[i]>0&&map[i]%2!=0){
                    y+=1;
                }
            }
        }
        
        return (x+y)%2==0? "EVEN":"ODD";
    }
}
