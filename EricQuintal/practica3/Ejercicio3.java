package EricQuintal.practica3;

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
        int num1;
        do{
            Scanner teclado=new Scanner (System.in);
            System.out.print("Introduce el número: " );
            num1= teclado.nextInt();
            if(num1<0){
                System.out.println("!El numero introducido es negativo¡" );
            }
       }while(num1 < 0);
       
       Ejercicio3 objNum=new Ejercicio3();
       System.out.println("La suma del rango de "+"1"+" a "+num1+" "+"es: "+objNum.SumaEnteros(num1));
        }
        long SumaEnteros(int n){
            
            if(n==1)
            return 1;

            else
            return n+SumaEnteros(n-1);
    }
    
}
