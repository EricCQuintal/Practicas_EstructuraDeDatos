package EricQuintal.Practica_6;

public class Paso2_OpArbol {
    NodoR raiz;
    //constructor 
    public Paso2_OpArbol()
    {
        this.raiz=null;
    }
    //metodos 
    //primer metodo Insertar Nodo este es encargado de realizar la insercion de 
    //un nuevo nododependiendo la posiciion que el puntero asignado desde la 
    //raiz Nodo padre a nodo hijo posicion puntero Isquierdo o derecho.
    
    public void InsertarNodo(int d, String nom){
        NodoR nuevo=new NodoR(d,nom);
        if (raiz==null) 
        {
            raiz=nuevo;  
        } else 
        {
            NodoR aux=raiz;
            NodoR padre;
            while (true) 
            {
                padre=aux;
                if (d<aux.dato) 
                {
                    aux=aux.hIsq;
                    if (aux==null) 
                    {
                        padre.hIsq=nuevo;
                        return;                        
                    }else
                    {
                        aux=aux.hDer;
                        if (aux==null) 
                        {
                            padre.hDer=nuevo;
                            return;
                        }
                    }
                }
            }
        }
    }

    //Metodo 2 este es encargado de verificar si el arbol se encuentra vacio 
    public boolean Arbolvacio()
    {
        return raiz==null;

    }

    //metdo 3 este es encargado de imprimir lo que se encuentra en el primer nodo
    public void Visitar(NodoR raizA)
    {
        System.out.println(raizA.dato +",");

    }
    
    //metodo 3 este es encargado de hacer un proceso de un algorito el cual 
    //representa el recorrido preorden de un arbol.
    public void PreOrden(NodoR raizA)
    {
        if (raizA!=null) 
        {
            Visitar(raizA);
            PreOrden(raizA.hIsq);
            PreOrden(raizA.hDer);            
        }
    }
    
    //metodo 4 este es encargado de hacer un proceso de un algorito el cual 
    //representa el recorrido InOrden de un arbol.
    public void InOrden(NodoR raizA)
    {
        if (raizA!=null) 
        {
            InOrden(raizA.hIsq);
            Visitar(raizA);
            InOrden(raizA.hDer);
        }
    }
    //metodo 5 este es encargado de hacer un proceso de un algorito el cual 
    //representa el recorrido PostOrden de un arbol.
    public void PostOrden(NodoR raizA) 
    {
        if (raizA!=null )
        {
            PostOrden(raizA.hIsq);
            PostOrden(raizA.hDer);
            Visitar(raizA);  
        }    
    }
    //metodo 6 este es encargado de realizar la operacion de buscar un nodo por
    //medio de este metodo este verifica las posiciones de los nodos y verifica 
    //si este este tiene un dato ocupado siendo esto o buscando nodo raiz padre
    //he hijos Puntero iquierdo y derecho 
    public NodoR BuscarNodo(int d) 
    {
        NodoR aux=raiz;
        while (aux.dato!=d) 
        {
            if (d<aux.dato) 
            {
                aux=aux.hIsq;  
            }else
            {
                aux=aux.hDer;
                if (aux==null) 
                {
                    return null;   
                }
            }     
        }
        return aux;   
    }
    




    



    







    


    
    
}
