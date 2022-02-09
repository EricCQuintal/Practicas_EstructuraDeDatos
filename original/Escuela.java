package original;
public class Escuela {

    int i = 0;
    int k = 0;
    int numAlumnos;
    int[] matriculas;
    String[] materias;
    String[] alumnos;
    double[] calificaciones;
    double[] cali1, cali2, cali3;

    public Escuela(int numAlumnos) {
        this.numAlumnos = numAlumnos;
        matriculas = new int[numAlumnos];
        alumnos = new String[numAlumnos];
        calificaciones = new double[numAlumnos];
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

    public void mostrarLista() {
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println(matriculas[i] + "     " + alumnos[i] + " | " + cali1[i] + " | " + cali2[i] + " | " + cali3[i] +  " | " + calificaciones[i]);
        }
    }

    public void calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < numAlumnos; i++) {
            suma = (double) (cali1[i] + cali2[i] + cali3[i] ) / 3;
            calificaciones[i] = suma;
        }
    }

    public void mostrarMatricula() {
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println(matriculas[i]);
        }
    }

    public void mostrarCalificacion() {
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println(calificaciones[i]);
        }
    }

    public void totalAprobados() {
        int pasantes = 0;
        for (int i = 0; i < numAlumnos; i++) {
            if (calificaciones[i] > 6) {
                pasantes++;
            }
        }
        System.out.println("Total Aprobados " + pasantes);
    }

    public void mediaDeLaClase() {
        double media;
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        media = (double) suma / calificaciones.length;
        System.out.println("La Media Es " + media);
    }

    public void mediaDeMeteriass() {
        double media1, media2, media3;
        double suma1 = 0, suma2 = 0, suma3 = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma1 += cali1[i];
            suma2 += cali2[i];
            suma3 += cali3[i];
            
        }
        media1 = (double) suma1 / calificaciones.length;
        System.out.println(materias[0] + " Su Media Es " + media1);
        //
        media2 = (double) suma2 / calificaciones.length;
        System.out.println(materias[1] + " Su Media Es " + media2);
        //
        media3 = (double) suma3 / calificaciones.length;
        System.out.println(materias[2] + " Su Media Es " + media3);
        
    }

    //Ordenamiento mediante matriculas con el metodo Quickshort
    public static void ordenarQuicksort(int[] array, int izq, int der) {
        int piv = array[izq];
        int i = izq;
        int d = der;
        int aux;
        while (i < d) {
            while (array[i] <= piv && i < d) {
                i++;
            }
            while (array[d] > piv) {
                d--;
            }
            if (i < d) {
                aux = array[i];
                array[i] = array[d];
                array[d] = aux;
            }
        }
        array[izq] = array[d];
        array[d] = piv;
        if (izq < d - 1) {
            ordenarQuicksort(array, izq, d - 1);
        }
        if (d + 1 < der) {
            ordenarQuicksort(array, d + 1, der);
        }

    }
    
    public void ordenarRadix(double[] array2) {
        int[] arreglo = new int[array2.length];
        int x, i, j;

        for (x = Integer.SIZE - 1; x >= 0; x--) {
            int aux[] = new int[arreglo.length];
            j = 0;

            for (i = 0; i < arreglo.length; i++) {
                boolean mover = arreglo[i] << x >= 0;

                if (x == 0 ? !mover : mover) {
                    aux[j] = arreglo[i];
                    j++;
                } else {
                    arreglo[i - j] = arreglo[i];
                }
            }
            for (i = j; i < aux.length; i++) {
                aux[i] = arreglo[i - j];
            }
            arreglo = aux;
        }
    }

    //Aplicarcion del método búsqueda por funciones de HASH para buscar por matricula
    public void busquedaSecuencial(String[] arreglo, String dato) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(dato)) {
                System.out.println("Encontrado " + alumnos[i]);
                break;//Para el ciclo
            }
        }
    }

    //Aplicarcion del método búsqueda binaria para buscar por promedio
    public void busquedaBinaria(int[] arreglo, int dato) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio + fin) / 2;
            if (arreglo[pos] == dato) {
                System.out.println("Se Encontro " + arreglo[pos]);
                break;
            } else if (arreglo[pos] < dato) {
                inicio = pos + 1;
            } else {
                fin = pos - 1;
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
            System.out.println("No Existe Ninun Alumno Con Esa Calificaion");
        }
    }

}
