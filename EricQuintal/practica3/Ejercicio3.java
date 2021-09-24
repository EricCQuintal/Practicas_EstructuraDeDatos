package EricQuintal.practica3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num1;
        System.out.print("Ingrese el dijito final rango: ");
        Scanner teclado=new Scanner(System.in);
        num1=teclado.nextInt();
        Ejercicio3 objNum=new Ejercicio3();
        System.out.println("La suma del rango de proporcionado es es: "+objNum.SumaEnteros(num1));
        
        }
        long SumaEnteros(int n){
            
            if(n==1)
            return 1;

            else
            System.out.println(n+SumaEnteros(n-1));
            return n+SumaEnteros(n-1);
    }
    
}
