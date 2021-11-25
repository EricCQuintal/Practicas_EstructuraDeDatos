package Practica_8.Shellsort;

//Editar que se pueden ingresar los valores por teclado
//Editar que no se vea igual
//Arreglo de 20 numeros 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shellsort {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] vec = new int[20];
        int val, c = 0;
        
        // Llenar el arreglo
        do {    
            System.out.print("Ingresa valores positivos en el rango [1 a 100]: ");
            val = Integer.parseInt(entrada.readLine());
            if(val > 0 && val < 20){
                vec[c] = val;
                c++;
            } else {
                System.out.println("Ingrese numeros del rango");
            }
        } while (c < vec.length);
        
        // Metodo Shell Sort
        int n = vec.length;
        int inc = n;
        do {
            inc = inc/2;
            for (int a = 0; a < inc; a++) {
                for (int i = inc + a; i < n; i+=inc) {
                    int j = i;
                    while (j - inc >= 0 && vec[j] <vec[j-inc]) {                        
                        int aux = vec[j];
                        vec[j] = vec[j-inc];
                        vec[j - inc] = aux;
                        j -= inc;
                    }
                }
            }
        } while (inc > 1);
        
        // Imprime arreglo
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i]+", ");
        }
    }
}