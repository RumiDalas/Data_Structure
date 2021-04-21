
import java.util.HashMap;
import java.util.Map;


public class Map1 {
    public static void main(String[] args) {
        Map<Integer, String>  map = new HashMap<Integer, String>();
        map.put(101, "Avi");
        map.put(100, "Mishu");
        map.put(103, "Meherun");
        
        for(Map.Entry m:map.entrySet()){  
            System.out.println(m.getKey()+" "+m.getValue());  
        }  
    }
}
