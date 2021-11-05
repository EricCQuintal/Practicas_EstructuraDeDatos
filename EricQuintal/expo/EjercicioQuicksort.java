package EricQuintal.expo;

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

            while (izq!=der) 
            {
                while (numeros[der] >= numeros[pivote] && izq<der)
                der--;
                while (numeros[izq] < numeros[pivote] && izq<der)
                izq++;

                if (der!=izq) 
                {
                    aux=numeros[der];
                    numeros[der]=numeros[izq];
                    numeros[izq]=aux;}
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
    
     
    

