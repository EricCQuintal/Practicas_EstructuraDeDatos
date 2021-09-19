package EricQuintal.Paso3;
//se ingresan las siguientes librerias para el uso correcto y funcionamiento del
//programa 
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Paso_3 {
 public static void main(String[] args) {
     //se agrega el array list o arreglo con la variable de nombre listado
     ArrayList<String> listado;
     //se instancia un nuevo objeto llamado listado 
     listado=new ArrayList<String>();
     //se asigna las variables de tipo int y String 
     String tempo, resp;
     int n;
     //se inicializa una estrcutura do while con la cual tendra una funcion de
     //recibir los datos proporcionados por los usuarios y agregar mas 
     //palabras con la opcion de s/n  
     do {
         //manda un mensaje pidiendole al usuario agregue una nueva palabra
         tempo=JOptionPane.showInputDialog(null, "Escribe una palabra: ");
         //este es asignado al arreglo listado y Agregado ala variable tempo
         listado.add(tempo);
         resp=JOptionPane.showInputDialog(null, "¿Desea ingresar otra palabra? s/n: ");
         //se le asigna el valor a la variable resp 
         //El metodo toLowerCase sirve para devorlver e valor a la cadena en 
         //minusculas 
         resp=resp.toLowerCase();


       //el while usa una condicional la cual se repetira si la respuesta 
       //es diferente a n esta seguira pidiendo los datos para que siga 
       //porporcionando el usuario nuevos datos  
     } while (!resp.equals("n"));
    //este metodo mostrara el listado actual despues de capturar las primeras
    //palabras porporcionadas por el usuario
    MostrarListado(listado);
    //este metodo servira para modificar la lista
    //por consiguiente nos saldra un mensaje por pantalla pidiento que elijas
    //un dato a modificar se aignara en la variable n de tipo int
    n= Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que elemento vas a modificar de la lista?\n Elije un numero de la lista: "));
    //esta linea de codigo pedira los datos nuevos proporcionados por el usuario
    //y agregara la nueva palabra en el anterior lugar de la palabra modificada
    listado.set((n-1),tempo=JOptionPane.showInputDialog(null, "Escribe nueva palabra: "));
     
    //motrara el listado nuevo ya modificado 
    MostrarListado(listado);
    //esta se asiganara el numero a capturar para borrar el valor que el usuario
    //porporcione y eliminara segun la posicion y numero de la lista
    n= Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que elemento vas a eliminar de la lista?\n Elije un numero de la lista: "));
    listado.remove((n-1));

    //mostrara el los datos actualizados eliminado el dato seleccionado por el 
    //usuario
    MostrarListado(listado);
    
 }
//este metodo asiganar los valores segun corresponda los pasos realizados
//anteriormente e impirmira las capturas del usuario, modificaicones y 
//eliminaciones de datos
private static void MostrarListado(ArrayList<String> listado) {
System.out.println("\nElementos de la lista");
for (int i=0; i<listado.size(); i++) {
    System.out.println((i+1)+"."+listado.get(i));  
    
}

}

  
}
