package Practica8_metodosOrdenamiento.Quicksort.expo;

public class EjercicioQuicksort 
{

    public void OrdenarQuicksort(int [] array) 
    {

        array=Quicksort1(array);
        
    }

    public int[] Quicksort1( int numeros[]){
        
        return Quicksort2(numeros,0,numeros.length-1);

    }
    public int[] Quicksort2(int numeros[],int izq,int der)
    {
        if (izq>=der) 
            return numeros;
        
        int i=izq,d=der;
        if (izq!=der) 
        {
            int pivote;
            int aux;
            pivote=izq;

            while (izq!=der) //Esto se ejecutara mientras sea diferente 
            {
                //este sera encargado de realizar el censo de los numeros del
                //arreglo
                while (numeros[der] >= numeros[pivote] && izq<der)
                der--;//decrementando posicion

                while (numeros[izq] < numeros[pivote] && izq<der)
                izq++;//aumentando posicion 

                //este if sera encargado de realizar el cambio o suustitucion de 
                //posicion de los valores 
                if (der!=izq) 
                {
                    aux=numeros[der];//variable auxialiar alamcenar valor
                    numeros[der]=numeros[izq];//igualamos
                    numeros[izq]=aux;}//sustituimos valores cambiamos posicion
            }

                if (izq==der) 
                {
                    Quicksort2(numeros, i,izq-1);
                    Quicksort2(numeros, izq+1,d);
                    
                }
                    
            
            
                
        }else
        return numeros;
        return numeros;
        
    }
            
        
}
    
     
    

