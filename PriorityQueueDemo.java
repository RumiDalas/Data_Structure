
package datastructureall;

import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueueDemo {
    public static void main(String[] args) {
        
        PriorityQueue<String> pq = new PriorityQueue<>();
 
        pq.add("G");
        pq.add("F");
        pq.add("G");
 
        Iterator iterator = pq.iterator();
 
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
    }
    
    
}
