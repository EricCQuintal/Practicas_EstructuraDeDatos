package EricQuintal.practica2;
//se paso a implemetar las siguientes librerias 
import java.util.Scanner;
import java.lang.Integer;
import javax.swing.JOptionPane;
//la clase fue llamada nElementos haciendo referencia que el programa ya que este
//pide al usuario que ingrese n elemntos al listado es decir no tiene limites
//al pedir datos al usuario
public class nElementos {
    public static void main(String[] args) {
        System.out.println("...................................................... ");
        System.out.println("PROGRAMA TOMA DATOS DE UN ARREGLO Y DEVUELVE LA SUMA");
        System.out.println("...................................................... ");
        Scanner sc=new Scanner(System.in);
        //se paso a implementar los siguientes atributos
        int nElementos;
        int suma=0;
        //se inicializa la variable nElementos para que se asigne los datos 
        //a recibir 
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de elementos del arreglo: "));
        //se instancia el objeto numeros y se asigna a el array nElementos 
        int [] numeros=new int [nElementos];
        //se manda un mensaje por consola pideindo al usuario proporcione
        //por medio del teclado el tamaño de los elementos del arreglo
        System.out.println("Digite los elementos del arreglo: ");
        //se porcede a iniciar un bucle for en donde obtendrmos los datos 
        //porporcionados por el usuario ya que se asignara el valor 
        //que el usuario ingrese por medio del teclado con la condicion
        //de que este inicie desde cero y el iterador sea menor ala
        // variable nElementos ya que esta finalizaria si es mayor
        //y aumentaria de 1 en 1
        for (int i=0; i<nElementos; i++) {
            System.out.print((i+1)+".Ingrese un numero: ");
            numeros[i]=sc.nextInt();


            
        } 
        //Este metodo nos proporcionara y mostrara los datos ya proporcionado 
        //por el usuario 
        System.out.println("............................................. ");
        System.out.println("Los elementos del arreglo son: ");
        System.out.println("............................................. ");
        //de la misma maneraa se iniciara un bucle for y este nos proporcionara
        //las mismas concdiciones con la diferencia que este nos mostrara
        //el listado con los datos de los elementos que disponemos
        for (int i=0; i<nElementos; i++){
            System.out.println((i+1)+". "+numeros[i]);
        }
        //Este metodo nos proporcionara las mismas conndiciones a diferencia
        //que este sumara el valor de los datos asignados
        System.out.println("............................................. ");
        for (int i=0; i<nElementos; i++){
           suma +=numeros[i];
           
            
        }
        //este es un mensaje que nos proporcionara el valor de la suma
        System.out.println("La suma de los elementos es: "+suma);

        

    }
}
