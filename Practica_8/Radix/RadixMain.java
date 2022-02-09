package Practica_8.Radix;

public class RadixMain {

        public static void main(String[] args) {
         
            
            int vector1 [] = {5, 1, 8, 9, 6, 3, 45};
            Radix r = new Radix();
             
            System.out.println("Vector original");
            r.mostrarArregloRadix(vector1);
            System.out.println("");
            System.out.println("---------------------------------");
            r.ordenarRadix(vector1);
    
        }
    }