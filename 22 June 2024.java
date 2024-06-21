class Solution {
    long ExtractNumber(String sentence) {
        // code here
        String a[]= sentence.split(" ");
        long mx=-1;
        
        for(int i=0;i<a.length;i++){
            if(Character.isDigit(a[i].charAt(0)) && !a[i].contains("9")){
                mx=Math.max(mx,Long.valueOf(a[i]));
            } }
      
        return mx;
    }
}
