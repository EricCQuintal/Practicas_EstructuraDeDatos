package EricQuintal.practica3;

public class Ejercicio2 {
   public static void main(String[] args) {
       //se paso a instanciar el objeto con el nombre objnum
       Ejercicio2 objNum=new Ejercicio2();
       //se concatena el objeto objnum con el metdo
       System.out.println("La suma de los primeros 10 numeros es: "+objNum.SumaEnteros(10));
   } 

   //metodo recursivo de la suma de los primeros n numeros enteros positivos
   long SumaEnteros(int n){
       //La condicion recursiva o componete base
       if (n==1)
       return 1;
       else 
       return n+SumaEnteros(n-1);
   }
}
