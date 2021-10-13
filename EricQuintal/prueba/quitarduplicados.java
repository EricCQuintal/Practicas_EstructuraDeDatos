package EricQuintal.prueba;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class quitarduplicados {
   
    
   
    
    public static void main(String[] args) {
        String [] arr2 = {"5","1","2","3","3","4","1","2"};
        
        
Set<String> set = new LinkedHashSet<String>(Arrays.asList(arr2));
for(String s1 : set)
    System.out.println(s1);

System.out.println( "------------------------" );
String[] arr3 = set.toArray(new String[0]);
for(int i = 0; i < arr3.length; i++)
     System.out.println(arr3[i].toString());
       
    }
    
}
