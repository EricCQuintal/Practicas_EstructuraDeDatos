package Practica_8.Quicksort;
//se crea la clase de tipo Quicksort
public class Quicksort {
    //se procedio a crear un constructor en cal tiene como parametro 
    //un entero de tipo array es decir un arreglo de tipo entero
    public void OrdenarQuicksort(int [] array){
    //se manda a llamar el array y este llama un metdo el cual es llamado
    //Quicksort1 con parametro del arreglo
        array=Quicksort1(array);
        
    }
    //Este es el primer Metdo el cual tiene como objetivo encontrar 
    //las posiciiones de los punteros Izquierda derecha y elemnto pivote 
    public int[] Quicksort1( int numeros[]){
        //Es un metdo tde tipo entero por lo que manda a retronar el 
        //segundo metdo este llamado Quicsort 2 con los parametros
        //que son los elemntos de la posicion del arreglo
        return Quicksort2(numeros,0,numeros.length-1);

    }
    //se presenta el segundo metdo de tipo entero e cual toma como parametros
    //los avlores enteros de las variables numeros de tipo arreglo, Int izq
    //int der que represntean los indices o punteros
    public int[] Quicksort2(int numeros[],int izq,int der){
        //este if es el encragdo de retornar el avlor del arreglo nuemro
        //el cual compara si es igual el puntero isquierdo y derecho
        //si es asi este no tiene que hcer ningun movimineto
        if (izq>=der) 
            return numeros;
        //en este caso se crean nuevas variables las cuales son punteor 
        //izq=i y puntero der=d
        int i=izq,d=der;
        //se presenta una comparacion para saber si el puntero isquierdo ess 
        //diferente de puntero derecho si es asi entra en un ciclo el cual 
        
        if (izq!=der){
            int pivote;
            int aux;
            pivote=izq;
         //compara nuevamente y si es asi    
            while (izq!=der){
                //Procede a realizar dos ciclos mas que haran ek movimiento 
                //de los punteros y comapararan
                while (numeros[der] >= numeros[pivote] && izq<der)
                der--;
                while (numeros[izq] < numeros[pivote] && izq<der)
                izq++;
                
                //Si este if se cumple presnta el cambi de posicion 
                if (der!=izq){

                    aux=numeros[der];
                    numeros[der]=numeros[izq];
                    numeros[izq]=aux;
                }
            }
                //este presnta el mismo proceso anteriormente planteado
                //solo que por ser un metdodo recursivo queda de esta forma
                if (izq==der) 
                {
                    Quicksort2(numeros, i,izq-1);
                    Quicksort2(numeros, izq+1,d);
                    
                }
                       
        }
        else
        return numeros;
        return numeros;       
    }       
}