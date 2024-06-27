class Solution {
    /*You are required to complete this method*/
    boolean isToepliz(int mat[][]) {
        int row = mat.length;
        int col = mat[0].length;
        int c=0 , r=0;
        // MOVING L -> R IN ROW 1 
        for(int i=0 ;i<col ;i++){
            r=0 ; c=i;
            //CHECKING DIAGONALLY
            while(r<row-1 && c<col-1){
                if(mat[r][c]!=mat[r+1][c+1]) return false;
                r++; c++;
            }
        }
        //MOVING TOP -> BOTTOM IN COL 1
        for(int i=0 ;i<row ;i++){
            r=i ; c=0;
            //CHECKING FOR EACH DIAGONAL POSSIBLE 
            while(r<row-1 && c<col-1){
                if(mat[r][c]!=mat[r+1][c+1]) return false;
                r++; c++;
            }
        }
        return true;
    }
}
