package EricQuintal.Practica4;
import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PrincipalMain {
    public static void main(String[] args) {
        Pilas pilaprueba;
        int element;
        int opcion;
        int elementos;
        
        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" CREAR PILA PROGRAMA ");
        System.out.println(" TECLEA LOS ELEMENTOS DE LA PILA TENRMINA OPERACION CON -1  ");
        try {
            pilaprueba=new Pilas();
            do {
               
                elementos=Integer.parseInt(JOptionPane.showInputDialog("Dijite los elementos de la pila"));
                pilaprueba.InsertarElemento(elementos);
                
            } while (elementos!=-1);

            do{
                System.out.println(

                "\n--------------------------------------\n"+
                "                  menu                   \n "+
                "1.- Insertar\n"+
                "2.- Quitar\n"+
                "3.- Checar si pila esta vacia\n"+
                "4.- checar si pila esta llena\n"+
                "5.- Limpiar pila\n"+
                "6.-Checar cima \n"+
                "7.-checar tamaño de la pila\n"+
                "8.- Mostrar pila\n"+
                "9.- Salir\n"+
                "Elige una opcion:\n"+
                "\n--------------------------------------\n"


                
                );
                opcion=Integer.parseInt(JOptionPane.showInputDialog("\n--------------------------------------\n"+
                "\n                  menu                   \n "+
                "\n 1.- Insertar\n"+
                "2.- Quitar\n"+
                "3.- Checar si pila esta vacia\n"+
                "4.- checar si pila esta llena\n"+
                "5.- Limpiar pila\n"+
                "6.-Checar cima \n"+
                "7.-checar tamaño de la pila\n"+
                "8.- Mostrar pila\n"+
                "9.- Salir\n"+
                "Elige una opcion:\n"+
                "\n--------------------------------------\n"
                +"\nElige una opcion a ejecutar\n"
));
                switch (opcion) {
                    case 1:
                    System.out.println("INGRESA UN ELEMENTO A LA PILA");
                    element=Integer.parseInt(teclado.readLine());
                    pilaprueba.InsertarElemento(elementos);
                        
                        break;
                
                    default:
                        break;
                }
            }while(opcion!=9);
            
        } catch (Exception e) {
            //TODO: handle exception
        }

      
       
        
    }
    

    
}
