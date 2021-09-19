package EricQuintal.Paso3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Paso_3 {
 public static void main(String[] args) {
     ArrayList<String> listado;
     listado=new ArrayList<String>(); 
     String tempo, resp;
     int n;
     do {
         tempo=JOptionPane.showInputDialog(null, "Escribe una palabra: ");
         listado.add(tempo);
         resp=JOptionPane.showInputDialog(null, "¿Desea ingresar otra palabra? s/n: ");
         resp=resp.toLowerCase();

         
     } while (!resp.equals("n"));

    MostrarListado(listado);
    n= Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que elemento vas a modificar de la lista?\n Elije un numero: "));
    listado.set((n-1),"modificado");


    MostrarListado(listado);
    n= Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que elemento vas a eliminar de la lista?\n Elije un numero: "));
    listado.remove((n-1));
    MostrarListado(listado);
    
 }

private static void MostrarListado(ArrayList<String> listado) {
System.out.println("\nElementos");
for (int i=0; i<listado.size(); i++) {
    System.out.println((i+1)+"."+listado.get(i));  
    
}

}

  
}
