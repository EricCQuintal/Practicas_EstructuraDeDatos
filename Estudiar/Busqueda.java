package Estudiar;

public class Busqueda {
    public static int buscar( int [] arreglo, int dato){
        int inicio = 0;
        int fin = arreglo. length -1;
        int pos;
        while (inicio <= fin){
            pos = (inicio+fin)/2;
            if (arreglo[pos]==dato)
            return pos;
            else  if (arreglo [pos] <dato ){
                inicio = pos + 1;
            } else{
                fin = pos-1;
            }
        }
        return -1;
    }

public static void burbuja (int[]arreglo){
    int temporal = 0;
    for (int i=0;i<arreglo.length;i++){
        for(int j=i+1;j<arreglo.length;j++){
            if (arreglo [i]>arreglo[j]){
                temporal = arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=temporal;

            }
        }
    }
}
public static void mostrarArreglo (int[]arreglo){
    int k;
    for(k=0;k<arreglo.length;k++){
        System.out.println("[" + arreglo[k]+"]");
    }
    System.out.println("");
    }
    
}
