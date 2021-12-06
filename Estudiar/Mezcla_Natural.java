package Estudiar;

public class Mezcla_Natural {

	public Mezcla_Natural(){
    }

    public int[] mezclaDirecta(int[] arreglo){

        int i;
        int j;
        int k;
    
        //verificar para ordenar
        if(arreglo.length > 1){
    
          //division del vector y saber el numero de elementos
          int nElementosIzq = arreglo.length/2;
          int nElementosDer = arreglo.length - nElementosIzq;
    
          //se crean 2 vectores auxiliares
          int arregloIzq[] = new int [nElementosIzq];
          int arregloDer[] = new int [nElementosDer];
    
          //copiando los elementos de la primera parte del arreglo
          for (i = 0; i < nElementosIzq; i++){
            arregloIzq[i] = arreglo[i];
          }
    
          //copiando los elementos de la parte segunda del arreglo
          for(i = nElementosIzq; i < nElementosIzq + nElementosDer; i++){
            arregloDer[i-nElementosIzq] = arreglo[i];
          }
    
          //recursividad
          arregloIzq = mezclaDirecta(arregloIzq);
          arregloDer = mezclaDirecta(arregloDer);
          i = 0;
          j = 0;
          k = 0;
          while(arregloIzq.length != j && arregloDer.length != k){
            if (arregloIzq[j] < arregloDer[k]) {
              arreglo[i] = arregloIzq[j];
              i++;
              j++;
            }else{
              arreglo[i] = arregloDer[k];
              i++;
              k++;
            }
    
          }
    
          //arreglo final
          while (arregloIzq.length != j) {
            arreglo[i] = arregloIzq[j];
            i++;
            j++;
          }
          while (arregloDer.length !=k) {
            arreglo[i] = arregloDer[k];
            i++;
            k++;
          }
    
        }
    
        return arreglo;
    
      }
    
      public void mezclaNatural(int arreglo[]){
    
        int izquierda = 0;
        int izq = 0;
        int derecha = arreglo.length-1;
        int der = derecha;
        boolean ordenado = false;
    
        do {
          ordenado = true;
          izquierda = 0;
          while (izquierda<derecha) {
            izq = izquierda;
            while (izq<derecha && arreglo[izq] <= arreglo[izq+1]) {
              izq++;
            }
            der = izq+1;
            while (der == derecha-1 || der < derecha && arreglo[der] <= arreglo[der+1]) {
              der++;
            }
    
            //ordenamiento a partir del metodo mezclaDirecta1
            if (der <= derecha) {
              mezclaDirecta1(arreglo);
              ordenado = false; 
              
            }
    
            izquierda = izq;
    
          }
        } while (!ordenado);
    
      }
    
      public void mezclaDirecta1(int[] arreglo){
        int i;
        int j;
        int k;
        if(arreglo.length > 1){
    
          //division del vector
          int nElementosIzq = arreglo.length/2;
          int nElementosDer = arreglo.length - nElementosIzq;
    
          //se crean 2 vectores auxiliares
          int arregloIzq[] = new int [nElementosIzq];
          int arregloDer[] = new int [nElementosDer];
    
          //copiando los elementos de la primera parte del arreglo
          for (i = 0; i < nElementosIzq; i++){
            arregloIzq[i] = arreglo[i];
          }
    
          //copiando los elementos de la parte segunda del arreglo
          for(i = nElementosIzq; i < nElementosIzq + nElementosDer; i++){
            arregloDer[i-nElementosIzq] = arreglo[i];
          }
    
          //recursividad
          arregloIzq = mezclaDirecta(arregloIzq);
          arregloDer = mezclaDirecta(arregloDer);
          i = 0;
          j = 0;
          k = 0;
          while(arregloIzq.length != j && arregloDer.length != k){
            if (arregloIzq[j] < arregloDer[k]) {
              arreglo[i] = arregloIzq[j];
              i++;
              j++;
            }else{
              arreglo[i] = arregloDer[k];
              i++;
              k++;
            }
    
          }
    
          //arreglo final
          while (arregloIzq.length != j) {
            arreglo[i] = arregloIzq[j];
            i++;
            j++;
          }
          while (arregloDer.length !=k) {
            arreglo[i] = arregloDer[k];
            i++;
            j++;
          }
    
        }
    
      }
    
      
    
      public void mostrarArreglo(int[] arreglo) {
        int k;
        for (k=0; k>arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "] ");
        }
        System.out.println();
    }
  
}