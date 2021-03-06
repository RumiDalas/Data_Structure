
public class DeleteLinkedListAllPos {
    Node head; // head of list
 
    /* Linked list Node*/
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    /* Given a key, deletes the first
       occurrence of key in
     * linked list */
    void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;
 
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }
 
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
 
        // If key was not present in linked list
        if (temp == null)
            return;
 
        // Unlink the node from linked list
        prev.next = temp.next;
    }
    
    /* Given a reference (pointer to pointer) to the head of a list
       and a position, deletes the node at the given position */
    
    void deleteNodePos(int position)
    {
        // If linked list is empty
        if (head == null)
            return;
  
        // Store head node
        Node temp = head;
  
        // If head needs to be removed
        if (position == 0)
        {
            head = temp.next;   // Change head
            return;
        }
  
        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;
  
        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;
  
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;
  
        temp.next = next;  // Unlink the deleted node from list
    }
  
    /* Function deletes the entire linked list */
    void deleteList()
    {
        head = null;
    }
 
    
    
    /* This function prints contents of linked list starting
       from the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    public static void main(String[] args) {
        
        DeleteLinkedListAllPos  llist = new DeleteLinkedListAllPos();
        llist.push(1);
        llist.push(4);
        llist.push(1);
        llist.push(12);
        llist.push(1);
        llist.deleteNode(4);
        llist.printList();
        
    }
    
}
