package Recuperacionfinal;
public class Escuela {

    int i = 0;
    int k = 0;
    int numAlumnos;
    int[] matriculas;
    String[] materias;
    String[] alumnos;
    int[] promedio;
    double[] cali1, cali2, cali3;
    //constructor
    public Escuela(int numAlumnos) {
        this.numAlumnos = numAlumnos;
        matriculas = new int[numAlumnos];
        alumnos = new String[numAlumnos];
        promedio = new int[numAlumnos];//cambie la variable a tipo int o entero
        cali1 = new double[numAlumnos];
        cali2 = new double[numAlumnos];
        cali3 = new double[numAlumnos];
        materias = new String[4];
    }

    public void agregarAlumno(int matricula, String alumno, double cal1, double cal2, double cal3) {
        matriculas[i] = matricula;
        alumnos[i] = alumno;
        cali1[i] = cal1;
        cali2[i] = cal2;
        cali3[i] = cal3;
        i++;
    }

    public void agregarMateria(String materia) {
        materias[k] = materia;
        k++;
    }

    public void MostrarLista() {
        System.out.println("Matriculas\tNombre\t        Califiaciones\t           Promedio");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println(matriculas[i] + "\t\t" + alumnos[i] + "\t\t" + cali1[i] + " | " + cali2[i] + " | " + cali3[i] + " \t    "+ promedio[i]);
        }
    }

    public void CalcularPromedio() {
        double suma = 0;
        for (int i = 0; i < numAlumnos; i++) {
            suma = (double) (cali1[i] + cali2[i] + cali3[i] ) / 3;
            promedio[i] = (int) suma;
        }
    }

    public void MostrarMatricula() {
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println(matriculas[i]);
        }
    }

    public void MostrarCalificacion() {
      
        for (int i = 0; i <numAlumnos; i++) {
            System.out.println(promedio[i]);
        }
        
    }

    public void TotalAprobados() {
        int aprobados = 0;
        for (int i = 0; i < numAlumnos; i++) {
            if (promedio[i] > 6) {
                aprobados++;
            }
        }
        System.out.println("Total Aprobados " + aprobados);
    }

    public void MediaDeClase() {
        double media;
        double suma = 0;
        for (int i = 0; i < promedio.length; i++) {
            suma += promedio[i];
        }
        media = (double) suma / promedio.length;
        System.out.println("La Media Es " + media);
    }

    public void MediaDeMaterias() {
        double media1, media2, media3;
        double suma1 = 0, suma2 = 0, suma3 = 0;
        for (int i = 0; i < promedio.length; i++) {
            suma1 += cali1[i];
            suma2 += cali2[i];
            suma3 += cali3[i];
            
        }
        media1 = (double) suma1 / promedio.length;
        System.out.println(materias[0] + " Su Media Es " + media1);
        //
        media2 = (double) suma2 / promedio.length;
        System.out.println(materias[1] + " Su Media Es " + media2);
        //
        media3 = (double) suma3 / promedio.length;
        System.out.println(materias[2] + " Su Media Es " + media3);
        
    }

  
    //ordenamiento matriculas radix de forma decendente
    public void mostrarArreglo(int[] arregloNum) {   
      int k; 
      for (k =0; k < arregloNum.length; k++){
          
          System.out.print("[" + arregloNum[k] + "] ");
      }
  }
  public void ordenarRadix(int [] promedio2){
      int x, i, j;
      for(x=Integer.SIZE-1; x>=0; x--){
          int auxiliar[] = new int [promedio2.length];
          j = 0;
          for (i=0; i<promedio2.length; i++){
              boolean mover = promedio2[i] << x >=0;
              if(x == 0 ? !mover: mover){
                  auxiliar[j] = promedio2[i];
                  j++;
              } else {
                  promedio2[i-j] = promedio2[i];
              }
          }
          for (i=j; i < auxiliar.length; i++ ){

              auxiliar[i] = promedio2[i-j];
          }
          promedio2 = auxiliar;
      }
      System.out.println("Ordenamiento ordenado por radix Ascendente");
      mostrarArreglo(promedio2);
      System.out.println("");
      System.out.println("Ordenamiento ordenado por radix Descendente");
      mostrarArreglo2(promedio2);
  }
  public void mostrarArreglo2(int[] arregloNum) { 
    int k; 
      for (k =0; k < arregloNum.length; k++){
         System.out.print("[" + arregloNum[arregloNum.length-1-k] + "] ");
      }
  }  

    //Aplicarcion del método búsqueda para buscar por matricula
    public void busquedaSecuencial(String[] arreglo, String dato) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(dato)) {
                System.out.println("El Nombre solicitado ha sido Encontrado el dato encontado es: " + alumnos[i]);
                
                break;//Para el ciclo
            }else{
                System.out.println("!!El nombre ingresado no ha sido encontrado¡¡"+" posicicion "+"[" + (i+1)+"]"+" ocupada" );
                
            }
           
        }
    }

    //Aplicarcion del método búsqueda binaria para buscar nomero de matricula existente en el arreglo
    public void busquedaBinaria(int[] arreglo, int dato) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio + fin) / 2;
            if (arreglo[pos] == dato) {
                System.out.println("Se ha encontrado la matricula:  " + arreglo[pos]);         
                break;
            } else if (arreglo[pos] <dato) {
                inicio = pos+1 ;
                System.out.println("Se ha encontrado la matricula:  " + arreglo[pos+1]);
                break;
            } else {
                fin = pos-1 ;        
                
            }
           
        }
       
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


    //Aplicarcion del método búsqueda secuencial para buscar por matricula
    public void busquedaMateriaCali(String mat, int cal) {

        System.out.println("Calificaciones En La Materia " + mat + " Con Calificacion " + cal);

        if (materias[0].equals(mat)) {
            for (int j = 0; j < numAlumnos; j++) {
                if (cali1[j] == cal) {
                    System.out.println(matriculas[j] + "     " + alumnos[j] + "      " + cali1[j]);
                }
            }
        } else if (materias[1].equals(mat)) {
            for (int j = 0; j < numAlumnos; j++) {
                if (cali2[j] == cal) {
                    System.out.println(matriculas[j] + "     " + alumnos[j] + "      " + cali2[j]);
                }
            }
        } else if (materias[2].equals(mat)) {
            for (int j = 0; j < numAlumnos; j++) {
                if (cali3[j] == cal) {
                    System.out.println(matriculas[j] + "     " + alumnos[j] + "      " + cali3[j]);
                }
            }
        } else {
            System.out.println("No Existe Ningun Alumno Con Esa Calificaion");
        }
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
    System.out.println("Ordenamiento de matriculas de forma ascendente");
    for (k=0; k<arreglo.length; k++) {
        System.out.print("[" + arreglo[k] + "] ");
    }
    System.out.println();
}





}
