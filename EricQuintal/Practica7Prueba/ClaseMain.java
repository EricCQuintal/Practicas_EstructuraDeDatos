package EricQuintal.Practica7Prueba;

import java.util.Scanner;

public class ClaseMain {
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        long matrizA[][]=new long[5][5];
        for(long i=0;i<matrizA.length;i++){
            for(long j=0;j<matrizA.length;j++){
                System.out.println("Ingresa valores de una matriz de pesos 5X5: ");
                matrizA[(int) i][(int) j]=teclado.nextLong();
            }
        }
        CaminosMinimos ruta= new CaminosMinimos();
         System.out.println(ruta.algoritmoFloyd(matrizA));
    
    }
    
}
