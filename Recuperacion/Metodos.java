package Recuperacion;

public class Metodos {

    //variables generales
    int i = 0;
    int k = 0;
    int numAlumnos;
    int[] matriculas;
    String[] materias;
    String[] alumnos;
    double[] calificaciones;
    double[] cali1, cali2, cali3;
    
    //constructor
    public Metodos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
        matriculas = new int[numAlumnos];
        alumnos = new String[numAlumnos];
        calificaciones = new double[numAlumnos];
        cali1 = new double[numAlumnos];
        cali2 = new double[numAlumnos];
        cali3 = new double[numAlumnos];
        materias = new String[4];
    }

    public void AgregarAlumnos(int matricula, String alumno, double cal1, double cal2, double cal3) {
        matriculas[i] = matricula;
        alumnos[i] = alumno;
        cali1[i] = cal1;
        cali2[i] = cal2;
        cali3[i] = cal3;
        i++;
    }

//metdos de busqueda por metodo binario
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
public static void mostrarArregloBinario (int[]arreglo){
    int k;
    for(k=0;k<arreglo.length;k++){
        System.out.println("[" + arreglo[k]+"]");
    }
    System.out.println("");
    }
    
   
   
    //metodos mezcla natural
    
    
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
    
      
    
      public void mostrarArregloNatural(int[] arreglo) {
        int k;
        for (k=0; k<arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "] ");
        }
        System.out.println();
    }
  



    //metodos de ordenamiento por tecnica radix 

    public void ordenarRadix(int [] arregloNum){
        int x, i, j;

        for(x=Integer.SIZE-1; x>=0; x--){

            int auxiliar[] = new int [arregloNum.length];

            j = 0;

            for (i=0; i<arregloNum.length; i++){

                boolean mover = arregloNum[i] << x >=0;

                if(x == 0 ? !mover: mover){

                    auxiliar[j] = arregloNum[i];
                    j++;

                } else {

                    arregloNum[i-j] = arregloNum[i];

                }
            }

            for (i=j; i < auxiliar.length; i++ ){

                auxiliar[i] = arregloNum[i-j];

            }
            arregloNum = auxiliar;
        }
        System.out.println("Ordenamiento ordenado por radix");
        mostrarArregloRadix(arregloNum);
    }

    public void mostrarArregloRadix(int[] arregloNum) {
        
        int k; 
        for (k =0; k < arregloNum.length; k++){
            
            System.err.print("[" + arregloNum[k] + "] ");
        }
    }

    
}
