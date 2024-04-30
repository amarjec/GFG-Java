class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node num1, Node num2){
        // code here
        // return head of sum list
        
        Node num1Rev = reverse(num1);
        Node num2Rev = reverse(num2);
        
        // print(num1Rev);
        // print(num2Rev);
        
        Node newAns = new Node(-1);
        Node temp = newAns;
        int carry = 0;
        
        while(num1Rev != null && num2Rev != null){
            int num1Dig = num1Rev.data;
            int num2Dig = num2Rev.data;
            
            int num1Plusnum2 = num1Dig + num2Dig + carry;
            
            int tempNext = (num1Plusnum2)%10;
            Node newNode = new Node(tempNext);
            temp.next = newNode;
            temp = temp.next;
            
            carry = num1Plusnum2/10;
            
            num1Rev = num1Rev.next;
            num2Rev = num2Rev.next;
        }
        
        if(num1Rev != null){
            while(num1Rev != null){
                int newData  = num1Rev.data+carry;
                int tempNext = (newData %10);
                Node newNode = new Node(tempNext);
                
                temp.next = newNode;
                temp = temp.next;
                
                carry = newData/10;
                num1Rev = num1Rev.next;
            }
        }
        
        else if(num2Rev != null){
            while(num2Rev != null){
                int newData  = num2Rev.data+carry;
                int tempNext = (newData %10);
                Node newNode = new Node(tempNext);
                
                temp.next = newNode;
                temp = temp.next;
                
                carry = newData/10;
                num2Rev = num2Rev.next;
            }
        }
        
        if (carry > 0) {
            temp.next = new Node(carry);
        }
        
        Node ansNode = reverse(newAns.next);
        
        while(ansNode != null && ansNode.data == 0){
            ansNode = ansNode.next;
        }
        
        if(ansNode == null){
            Node newNode = new Node(0);
            return newNode;
        }
        
        return ansNode;
        
    }
    
    static Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        node = prev;
        return node;
    }
    
    static void print(Node node){
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
