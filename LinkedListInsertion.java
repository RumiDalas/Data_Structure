
 class LinkedListInsertion {
    Node head;
    
    class Node{
        int data;
        Node next;
        Node(int d){
        data= d;
        next = null ;
        
        } 
    }
    
    public void push(int data){
        
    Node new_Node = new Node(data);
    new_Node.next=head ;
    head = new_Node;
    
    
    }
    
    public void printlist(){
        Node current = head ;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next  ;
        
        }
    
    }
    
    
    public static void main(String[] args) {
        LinkedListInsertion list = new LinkedListInsertion();
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.printlist();
        
        
    }
    
}
