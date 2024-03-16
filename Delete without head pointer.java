class Solution
{
    void deleteNode(Node del_node)
    {
         // Your code here
         
          if(del_node.next==null)
            del_node=null;
          else{    
          del_node.data=del_node.next.data;
          del_node.next=del_node.next.next;
          }
    }
}
