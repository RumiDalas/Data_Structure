
import java.util.HashMap;
import java.util.Map;
import java.util.*;  
public class Map2 {
    public static void main(String[] args) {
        Map<Integer, String> map =new HashMap<Integer, String>();
        
        map.put(100, "Rumi");
        map.put(101, "Avi");
        map.put(102, "Kona");
        map.put(103, "Sonia");
        
        //Return a set of mappings contains in this map
        map.entrySet()  
        
        //Returns a sequential Stream with this collection as its source 
        .stream() 
                
         //Sorted according to the provided Comparator  
                
        .sorted(Map.Entry.comparingByKey()) 
                
          //Performs an action for each element of this stream        
         .forEach(System.out::println);        
                
    }
    
}
