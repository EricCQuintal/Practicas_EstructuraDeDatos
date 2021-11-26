package Practica_8.Intercalacion;
//se importaroon las librerias scanner y JOption pane
import java.util.Scanner;
import javax.swing.JOptionPane;
// se creo la clase llamaada ClaseMain qu es la clase principal
public class ClaseMain {
    public static void main(String[] args) {
        //se paso a realzar las modificaciones que fueron prporcionadas
        //Por el expostor del tema 
		Scanner sc=new Scanner(System.in);
        //se paso a implementar los siguientes atributos
        int nElementos;
        //se inicializa el vaor nElementos
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de elementos del arreglo: "));
        //se la asignacion del tamaño del arreglo
        int [] arregloN1=new int [nElementos];
        //se pasa a realizar el llmado por consola al usuario
        System.out.println("Digite los elementos del arreglo: ");
        //dentro del for se asignan los valores del arreglo segun la 
        //posicion de este 
        for (int i=0; i<nElementos; i++) 
        {
            System.out.print((i+1)+".Ingrese un numero: ");
            //se asignan por medio de teclado al arreglo
            arregloN1[i]=sc.nextInt();

        } 
        //Se  pasa a realizar el pedido del segunod arreglo que hace 
        //el mismo proceso que el anterior 
		Scanner teclado=new Scanner(System.in);
        //se paso a implementar los siguientes atributos
        int nElementos2;
        nElementos2=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de elementos del arreglo: "));

        int [] arregloN2=new int [nElementos2];

        System.out.println("Digite los elementos del arreglo: ");

        for (int i=0; i<nElementos2; i++) 
        {
            System.out.print((i+1)+".Ingrese un numero: ");
            arregloN2[i]=teclado.nextInt();

        } 

		
		//se procede a realizar la asignacion de los por medio de el lllamado
        //del metdo mostrar arreglo1 arreglo 2 
		MetodoOrdenamientoIntercalacion ordenIntercalacion= new MetodoOrdenamientoIntercalacion();
		System.out.println("....................................................\n");
        System.out.println("Datos del primer arreglo Ingresado por teclado");
        ordenIntercalacion.MostrarArreglo(arregloN1);
        System.out.println("....................................................");
        System.out.println("Datos del segundo arreglo Ingreado por teclado");
        ordenIntercalacion.MostrarArreglo(arregloN2);
        ordenIntercalacion.OrdenaArreB(arregloN1);
        ordenIntercalacion.OrdenaArreB(arregloN2);
        //el arreglo uno es devuelto de forma ordenada por arreglo1 ordenado
        System.out.println("....................................................");
        System.out.println("Datos Arreglo 1 ordenados");
        //se manda a llamar el metdo mostrar arreglo y se muestra arreglo1
        ordenIntercalacion.MostrarArreglo(arregloN1);
        System.out.println("....................................................");
        System.out.println("Datos Arreglo 2 ordenados");
        //se manda a llamar el metdo mostrar arreglo y se muestra arreglo2
        ordenIntercalacion.MostrarArreglo(arregloN2);
        System.out.println("....................................................");
        //se manda a llamar el metdo Interclar arreglos y al final muesgra el
        //arreglo 1 y arreglo 2
        ordenIntercalacion.IntercalarArreglos(arregloN1, arregloN2);
	}	
}