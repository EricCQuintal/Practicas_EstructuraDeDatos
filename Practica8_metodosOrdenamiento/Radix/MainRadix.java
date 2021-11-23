package Practica8_metodosOrdenamiento.Radix;

public class MainRadix {
    public static void main(String[] args) {
     
        
        int vector1 [] = {5, 1, 8, 9, 6, 3, 45};
        Radix r = new Radix();
         
        System.out.println("Vector original");
        r.mostrarArreglo(vector1);
        System.out.println("");
        System.out.println("---------------------------------");
        r.ordenarRadix(vector1);

    }
    
}
