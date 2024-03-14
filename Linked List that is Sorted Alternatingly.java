class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        
       if(head==null) return head;
       Node n=head, q=head;
       int count=1, i=0;
       while(n.next!=null){
           count++;
           n=n.next;
       }
       Integer arr[]=new Integer[count];
       n=head;
       while(i<count){
           arr[i]=n.data;
           n=n.next;
           i++;
       }
       Arrays.sort(arr);
       for(i=0;i<count;i++){
           q.data=arr[i];
           q=q.next;
       }
       return head;
   }


}
