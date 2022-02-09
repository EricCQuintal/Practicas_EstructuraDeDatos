package ProyectoFinal;

//Primero creamos una clase
//en este caso los llamamos metodos
public class metodos {

  //Posteriormente declaramos las variables
    int i = 0;
    int k = 0;
    int na;
    int[] matriculas;
    String[] materias;
    String[] alumnos;
    int[] promedio;
    double[] c1, c2, c3;

    //Creamos los constructores
    //comenzando con el constructor de los metodos
    public metodos(int na) {
        this.na = na;
        matriculas = new int[na];
        alumnos = new String[na];
        promedio = new int[na];
        c1 = new double[na];
        c2 = new double[na];
        c3 = new double[na];
        materias = new String[4];
    }

    //El primer constructor, realiza el trabajo de agregar
    //las matruculas, el nombre de los alumnos y las calificacines de las materias 
    public void agregarAlumno(int matricula, String nombre, double ca1, double ca2, double ca3) {
        matriculas[i] = matricula;
        alumnos[i] = nombre;
        c1[i] = ca1;
        c2[i] = ca2;
        c3[i] = ca3;
        i++;
    }

    //El siguiente constructor, nos permite añadir
    //el nombre de las materias
    public void agregarMateria(String materia) {
        materias[k] = materia;
        k++;
    }

    //Constructor, nos permite imprimir, lo solicitado
    //que es la matricula, el nombre y las 3 calificaciones del alumno
    public void MostrarLista() {
        System.out.println("Matriculas\tNombre\t        Califiaciones\t           Promedio");
        for (int i = 0; i < na; i++) {
            System.out.println(matriculas[i] + "\t\t" + alumnos[i] + "\t\t" + c1[i] + " | " + c2[i] + " | " + c3[i] + " \t    "+ promedio[i]);
        }
    }

    //Constuctor, nos permite calcular el promedio
    public void CalcularPromedio() {
        double suma = 0;
        for (int i = 0; i < na; i++) {
            suma = (double) (c1[i] + c2[i] + c3[i] ) / 3;
            promedio[i] = (int) suma*10;
        }
    }

    //Constuctor, es el que nos permite mostrar la matricula
    public void MostrarMatricula() {
        for (int i = 0; i < na; i++) {
            System.out.println(matriculas[i]);
        }
    }

    //Constructor para mostrar la calificacion
    public void MostrarCalificacion() {
        for (int i = 0; i <na; i++) {
            System.out.println(promedio[i]);
        }
        
    }

    //Constructor para mostrarnos el total de aprobados
    //esto teniendo en cuanta que la calificacion minima aprovatoria es de 70
    public void TotalAprobados() {
        int aprobados = 0;
        for (int i = 0; i < na; i++) {
            if (promedio[i] > 70) {
                aprobados++;
            }
        }
        //Posteriormete se crea un system para imprimirlo
        System.out.println("Total de aprobados " + aprobados);
    }

    //Constuctor el cual nos clacula la media de la clase 
    public void MediaDeClase() {
        double media;
        double suma = 0;
        for (int i = 0; i < promedio.length; i++) {
            suma += promedio[i];
        }
        media = (double) suma / promedio.length;
        System.out.println("La media es " + media);
    }

    //Constructor el cual nos calcula la media de las materias
    public void MediaDeMaterias() {
        double media1, media2, media3;
        double suma1 = 0, suma2 = 0, suma3 = 0;
        for (int i = 0; i < promedio.length; i++) {
            suma1 += c1[i];
            suma2 += c2[i];
            suma3 += c3[i];
            
        }
        //En esta parte se realiza la operacion por cada materia 
        media1 = (double) suma1 / promedio.length;
        System.out.println(materias[0] + " Su media es " + media1);
        //
        media2 = (double) suma2 / promedio.length;
        System.out.println(materias[1] + " Su media es " + media2);
        //
        media3 = (double) suma3 / promedio.length;
        System.out.println(materias[2] + " Su media es " + media3);
        
    }

  
    //Como anteriormente, habiamos visto los metodos, en este caso usamos algunos
    //como por ejemplo el metodo radix, en este caso para
    //ordenar los promedios de forma descendente
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
      //Como bien se sabe el metodo radix es un metodo de ordenamiento
      //el cual toma las unidades, decenas y centenas
      //por lo cual usamos un for para el cual nos lo ordene de la forma solicitada
      //en este caso de forma descreciente (de mayor a menor)
      System.out.println("ordenado por radix de forma descendente");
      mostrarArreglo2(promedio2);
  }
  public void mostrarArreglo2(int[] arregloNum) { 
    int k; 
      for (k =0; k < arregloNum.length; k++){
         System.out.print("[" + arregloNum[arregloNum.length-1-k] + "] ");
      }
  }  

    //Constructor para solicitarle al método de búsqueda para encontrar la matricula
    public void busquedaSecuencial(String[] arreglo, String dato) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(dato)) {
                System.out.println("El nombre solicitado ha sido encontrado, el dato encontado es: " + alumnos[i]);
                
                break;//Para el ciclo
            }else{
                System.out.println("!!El nombre ingresado no ha sido encontrado¡¡"+" posicicion "+"[" + (i+1)+"]"+" ocupada" );
                
            }
           
        }
    }

    //Constructor para el uso del método búsqueda binaria para 
    //buscar numero de matricula existente en el arreglo
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


    //Constructor del método búsqueda secuencial
    //para buscar por nombre 
    public void busquedaMateriaCali(String mat, int cal) {

        System.out.println("Calificaciones en la materia " + mat + " con calificacion " + cal);

        if (materias[0].equals(mat)) {
            for (int j = 0; j < na; j++) {
                if (c1[j] == cal) {
                    System.out.println(matriculas[j] + "     " + alumnos[j] + "      " + c1[j]);
                }
            }
        } else if (materias[1].equals(mat)) {
            for (int j = 0; j < na; j++) {
                if (c2[j] == cal) {
                    System.out.println(matriculas[j] + "     " + alumnos[j] + "      " + c2[j]);
                }
            }
        } else if (materias[2].equals(mat)) {
            for (int j = 0; j < na; j++) {
                if (c3[j] == cal) {
                    System.out.println(matriculas[j] + "     " + alumnos[j] + "      " + c3[j]);
                }
            }
        } else {
            System.out.println("No existe ningun alumno con esa calificaion");
        }
    }

 //Creamos el metodo de mezcla natural
 //para ordenar de forma ascendente las matriculas
 //como se sabe, para que el metodo de mezcla natural funcione adecuadamente
 //primero se debe usar el metodo de mezcla directa, el cual se muestra acontinuacion 
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

  //Ahora, si se nos muestra la otra parte del metodo de
  //mezcla natural
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

  //Despues de usar el metodo de mezcla natural, solicitamos que nos imprima
  //los datos conforme se solicitaron, en este caso de forma ascendente
  public void mostrarArregloNatural(int[] arreglo) {
    int k;
    System.out.println("Ordenamiento de matriculas de forma ascendente");
    for (k=0; k<arreglo.length; k++) {
        System.out.print("[" + arreglo[k] + "] ");
    }
    System.out.println();
  } 
}