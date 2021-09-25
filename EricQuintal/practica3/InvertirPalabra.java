package EricQuintal.practica3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class InvertirPalabra {
    
    
    public static void main(String[] args) {
        
    String palabra;
    System.out.println("********************************************************");
    System.out.println("PROGRAMA QUE INVIERTE UNA CADENA O PALABRA PROPORCIONADA");
    System.out.println("********************************************************");  
    //manda un mensaje pidiendole al usuario agregue una nueva palabra

    palabra=JOptionPane.showInputDialog(null, "Escribe una palabra: ");
  
    System.out.println("La palabra en su estado original");
    
    System.out.println("La palabra es: "+palabra); 
    System.out.println("********************************************************");
    System.out.println("La palabra en su estado invertido"); 
     
    System.out.println("La palabra invertida es: "+invertirPalabra(palabra, palabra.length()-1));
    System.out.println("********************************************************");   
}
public static String invertirPalabra( String palabra, int longitud){
         
    if(longitud==0){
        
        return palabra.charAt(longitud)+"";
    }else{
        return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
    }
      
}



}