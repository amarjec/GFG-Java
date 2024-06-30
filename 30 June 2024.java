class Solution {
    public Node deleteNode(Node head, int x) {
        if(x==1){
            head=head.next;
            head.prev=null;
            return head;
        }
        else{
            Node temp1=head;
            Node temp2=head;
            for(int i=1;i<x-1;i++){
                temp1=temp1.next;
                if(temp1==null){
                    return head;
                }
            }
            for(int i=1;i<x+1;i++){
                temp2=temp2.next;
                if(temp2==null){
                    temp1.next=null;
                    return head;
                }
            }
            temp1.next=temp2;
            temp2.prev=temp1;
            return head;
        }
    }
}
