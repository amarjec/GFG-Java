class Solution{ 
    public Node arrangeCV(Node head) {
         //write code here and return the head of changed linked list
        StringBuilder vow = new StringBuilder();
        StringBuilder con = new StringBuilder();
        Node tmp = head;
        while(tmp != null){
            char c = tmp.data;
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
                vow.append(c);
            else 
                con.append(c);
            tmp = tmp.next;
        }
        tmp = head;
        for(int i = 0; i < vow.length(); i++){ 
            tmp.data = vow.charAt(i);
            tmp = tmp.next;
        }
        for(int i = 0; i < con.length(); i++) {
            tmp.data = con.charAt(i);
            tmp = tmp.next;
        }
        return head;
    }
}
