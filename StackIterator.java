
package datastructureall;

import java.util.Iterator;
import java.util.Stack;

//----------------------------Iterator<T> iterator()  
public class StackIterator {
    public static void main(String[] args) {
        
   //creating an object of Stack class  
   Stack stk = new Stack(); 
   
   //pushing elements into stack  
   stk.push("BMW");  
   stk.push("Audi");  
   stk.push("Ferrari");  
   stk.push("Bugatti");  
   stk.push("Jaguar");  
   
   //iteration over the stack  
   Iterator iterator = stk.iterator();  
   
   while(iterator.hasNext())  
   {  
    Object values = iterator.next();  
    System.out.println(values);   
   }     

   
    }
}