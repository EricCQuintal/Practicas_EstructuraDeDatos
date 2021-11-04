package EricQuintal.Practica_6;

public class Paso2_OpArbol {
    NodoR raiz;
    //constructor 
    public Paso2_OpArbol(){
        this.raiz=null;

    }

    //metodos 

    //primer metodo Insertar Nodo este es encargado de realizar la insercion de 
    //un nuevo nododependiendo la posiciion que el puntero asignado desde la 
    //raiz Nodo padre a nodo hijo posicion puntero Isquierdo o derecho.
    
    public void InsertarNodo(int d, String nom){
        NodoR nuevo=new NodoR(d,nom);
        if (raiz==null) {
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




    


    
    
}
