package Practica_8.Quicksort;
//se procede a importar las siguientes librerias uno librerias tipo
//ecanner y tipo Joppane
import java.util.Scanner;
import javax.swing.JOptionPane;
//se creo la calse llamada QuicksortMain
public class QuicksortMain { 
    
        public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
        //se paso a implementar los siguientes atributos
        int nElementos;
        //se procede a realizar e incializar el valro de nElementos 
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de elementos del arreglo: "));
        //Se aiga el valor al tamño del arreglo a ingreasr por teclado
        int [] Arreglo=new int [nElementos];
        //se manda mensaje por consola que pide los datos del arreglo 
        //popr teclado
        System.out.println("Digite los elementos del arreglo: ");
        //se pasa a crear for para poder realizar el llenado de las
        //posiciones de los elementos del arreglo
        for (int i=0; i<nElementos; i++) 
        {
            //al ingresar los aavlores se manda mensaje por pantalla con el 
            //numero ocupado por la posicion
            System.out.print((i+1)+".Ingrese un numero: ");
            Arreglo[i]=sc.nextInt();

        } 
        //creo un nuevo objeto llamdo ordenador
        Quicksort ordenador=new Quicksort();
        //Mando a llamar metodo el cual es Quicksor y porngo el arreglo 
        //que obtuvimos por la captura del usuario 
            ordenador.OrdenarQuicksort(Arreglo);
    System.out.println("Los elementos ordenados son: ");
    //se pasa a mostrar el arreglo por consola 
            for(int i=0; i<Arreglo.length;i++)
            {
                System.out.println(Arreglo[i]);  
            }
    }
    }