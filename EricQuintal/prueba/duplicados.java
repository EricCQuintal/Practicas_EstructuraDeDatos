package EricQuintal.prueba;

import java.util.ArrayList;

public class duplicados {
    private static final int pruetamanioPila=4;
    private int cimapila;
    private int listapi[];
    public duplicados(){
        this.cimapila=-1;
        this.listapi=new int [pruetamanioPila];
    }
    public void BorrarDuplicados(){
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("ABC");
        lst.add("ABC");
        lst.add("ABCD");
        lst.add("ABCD");
        lst.add("ABCE");
    
        System.out.println("Duplicates List "+lst);
    
        Object[] st = lst.toArray();
          for (Object s : st) {
            if (lst.indexOf(s) != lst.lastIndexOf(s)) {
                lst.remove(lst.lastIndexOf(s));
             }
          }
    
        System.out.println("Distinct List "+lst);
        }   
    
    public static void main(String[] args) {
      
    }
}
