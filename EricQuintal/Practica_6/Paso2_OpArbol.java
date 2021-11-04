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
    //metodo 5 este es encargado de hacer un proceso de un algoritmo el cual 
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
    //metodo 7 este metodo fue creado para buscar es decir censa si existe 
    //un nodo Raiz padre,Nodo Hijo isquierdo y nodo Hijo derecho con el fin
    //de eliminar el dato que integra la posicion en donde se encuentra 
    //almacenado el dato
    public boolean EliminarNodo(int d)
    {
        NodoR aux=raiz;
        NodoR padre=raiz;
        boolean HijoIsq=true;
        while (aux.dato!=d) 
        {
            padre=aux;
            if (d<aux.dato) 
            {
                HijoIsq=true;
                aux=aux.hIsq;
                
            }else
            {
                HijoIsq=false;
                aux=aux.hDer;

            }
            if (aux==null) 
            return false;    
        }

        if (aux.hIsq==null && aux.hDer==null) 
        {
            if (aux==raiz) 
            {
                raiz=null;
                
            }else if(HijoIsq){
                padre.hIsq=null;
            }else
            {
                padre.hDer=null;
            }  
        }
        else if (aux.hDer==null) 
        {
            if (aux==raiz) 
            {
                raiz=aux.hIsq; 
            }else if (HijoIsq) 
            {
                padre.hIsq=aux.hDer;    
            }else
            {
                padre.hDer=aux.hDer;
            }
            
        }else{
            NodoR nuevoRemplazo=Reemplazar(aux);
            if (aux==raiz) 
            {
                raiz=nuevoRemplazo;   
            }else if(HijoIsq)
            {
                padre.hIsq=nuevoRemplazo;
            }else
            {
                padre.hDer=nuevoRemplazo;
                nuevoRemplazo.hIsq=aux.hIsq;
            }      
        }
        return true;  

    }

    //metodo 8 aun no logro entender que funcion operacion realiza 
    //segun este se encarga de sustituir por el mayor de los menores 

    private NodoR Reemplazar(NodoR act) {
        NodoR reemp,reemplazo;
        reemp=act;
        reemplazo=act;
        NodoR aux=act.hDer;
        while (aux!=null) {
            reemp=reemplazo;
            reemplazo=aux;
            aux=aux.hIsq;
            
        }
        if (reemplazo!=act.hDer) {
            reemp.hIsq=reemplazo.hDer;
            reemplazo.hDer=act.hDer;
            
        }
        System.out.println("El nodo a eliminar es sustituiido por: "+reemplazo);
        return reemplazo;
    }
 
}
