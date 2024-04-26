class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        // code here
        int[] dx = {+1, 0, -1, 0};
        int[] dy = {0, -1, 0, +1};
        
        int i = 0, j = 0, idx = -1;
        boolean flag = true;
        while(i >= 0 && j >= 0 && i < n && j < m) {
            if(matrix[i][j] == 0 && flag) {
                j++;
            } else if(matrix[i][j] == 0) {
                i = i + dx[idx];
                j = j + dy[idx];
            } else {
                matrix[i][j] = 0;
                flag = false;
                idx = (idx + 1) % 4;
                i = i + dx[idx];
                j = j + dy[idx];
            }
        }
        if(i < 0) i++;
        if(i >= n) i--;
        if(j < 0) j++;
        if(j >= m) j--;
        
        return new int[] {i, j};
    }
}
