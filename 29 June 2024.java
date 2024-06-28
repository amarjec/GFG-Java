class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
           
        if (head1 == null)
        return (head2 == null);
    
    // If head1 is not null but head2 is null, they are not identical
    if (head2 == null)
        return false;
    
    // If data of current nodes are not equal, they are not identical
    if (head1.data != head2.data)
        return false;
    
    // Recursively check for the next nodes
    return areIdentical(head1.next, head2.next);
    }
}
