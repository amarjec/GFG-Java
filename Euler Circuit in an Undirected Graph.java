class Solution {
    public boolean isEularCircuitExist(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
         int deg = 0;
        for(int i=0;i<v;i++){
            if(adj.get(i).size()%2==0){
                deg++;
            }
        }
        if(deg==v){
            return true;
        }
        return false;
    }
}
