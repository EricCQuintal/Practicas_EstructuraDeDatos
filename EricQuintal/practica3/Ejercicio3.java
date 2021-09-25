package EricQuintal.practica3;
//se importa la libreria scanner 
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*int num1;
        System.out.print("Ingrese el dijito final rango: ");
            Scanner teclado=new Scanner(System.in);
            num1=teclado.nextInt();  
        if (num1<=0) {
           System.out.println("!El NUMERO INGRESADO ES NEGATIVO¡");
        } else { 
            Ejercicio3 objNum=new Ejercicio3();
            System.out.println("La suma del rango de proporcionado es es: "+objNum.SumaEnteros(num1));
    
        }*/
        //Ingresa la variable la cual delimitara el valor del rango
        int num1;
        //se procedio a realizar un ciclo do para que se pueda recolectar 
        //la informacion por teclado 
        do{
            Scanner teclado=new Scanner (System.in);
            System.out.print("Introduce el número: " );
            num1= teclado.nextInt();
            //se agrego la condicion la cual enviara un mensaje si los valores
            //introducidos por teclado son menores a 0 por lo cual no aceptara
            //datos negativos 
            if(num1<0){
                System.out.println("!El numero introducido es negativo¡" );
            }
        //Mientras se cumpla esta condicion el valor introducido no debe 
        //ser negativo ya que al ser negativo pedira de nuevo el valor
       }while(num1 < 0);
       //se instancia un objeto con el nombre objNum el cual pedira el metodo
       //por medio de un System
       Ejercicio3 objNum=new Ejercicio3();
       System.out.println("La suma del rango de "+"(1"+"-"+num1+") "+"es: "+objNum.SumaEnteros(num1));
        }
        //el metodo recursivo que se ejecutara de forma cilcica es decir si cumple
        //la condicion base esta se ejecutara hasta que el valor sea igual
        //al valor base 
        long SumaEnteros(int n){
            
            if(n==1)
            return 1;

            else
            return n+SumaEnteros(n-1);
    }
    
}
