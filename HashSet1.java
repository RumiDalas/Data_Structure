
import java.util.HashSet;
import java.util.Iterator;


public class HashSet1 {
    public static void main(String[] args) {
        
        HashSet<String> set= new HashSet();
        
        set.add("One");
        set.add("Two");
        set.add("Three");
        
        Iterator<String> i= set.iterator();
        
        while(i.hasNext()){
        
            System.out.println(i.next());
        
        }
       
    }
    
}
