class Solution {
    public String pattern(int[][] arr) {
        // Code here
        int N = arr.length;
        int columnIndexOfHighestIndex = Integer.MAX_VALUE;
        int rowIndexOfHighestIndex = Integer.MAX_VALUE;
        
        for(int i=0;i<N;i++){
            boolean columnPalindrome = true;
            boolean rowPalindrome = true;
            
            for(int j=0;j<N;j++){
                if(arr[i][j] != arr[i][N-j-1] ){
                    rowPalindrome = false;
                }
                
                if(arr[j][i] != arr[N-j-1][i] ){
                    columnPalindrome = false;
                }
            }
            
            if(columnPalindrome){
                columnIndexOfHighestIndex = Math.min(columnIndexOfHighestIndex,i);
            }
            
            if(rowPalindrome){
                rowIndexOfHighestIndex  = Math.min(rowIndexOfHighestIndex,i);
            }
        }
        
        if(columnIndexOfHighestIndex==Integer.MAX_VALUE && rowIndexOfHighestIndex == Integer.MAX_VALUE  ){
            return "-1";
        }
        
       return rowIndexOfHighestIndex==Integer.MAX_VALUE ? columnIndexOfHighestIndex + " C" : rowIndexOfHighestIndex + " R";
    }
}
