class Tree
{
    void find(Node root,ArrayList<Integer> list){
        if(root == null)return;
        // if(root.left == null && root.right == null)list.add(root.data);
        if(root.left == null && root.right != null){
            list.add(root.right.data);
            find(root.right,list);
        }else if(root.left != null && root.right == null){
            list.add(root.left.data);
            find(root.left,list);
        }else{
            find(root.left,list);
            find(root.right,list);
        }
    }
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        find(node,ans);
        Collections.sort(ans);
        if(ans.size() == 0)ans.add(-1);
        return ans;
    }
}
