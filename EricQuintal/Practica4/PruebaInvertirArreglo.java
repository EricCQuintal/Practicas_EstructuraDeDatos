package EricQuintal.Practica4;



public class PruebaInvertirArreglo {
   

    public static void main(String[] args) {
        int listapila []={1,2,3,4};
        int aux []=new int[listapila.length]; 
        for(int i=listapila.length-1, j=0; i>=0;i--,j++){
            aux[j]=listapila[i];
            System.out.println(aux[j]);
    }
    
}
}
