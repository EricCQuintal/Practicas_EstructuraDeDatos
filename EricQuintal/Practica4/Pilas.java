package EricQuintal.Practica4;

public class Pilas {
    private static final int pruetamanioPi=10;
    private int cimapila;
    private int []listapi;
    
    //constructor 
    public Pilas(){
        this.cimapila=-1;
        this.listapi=new int [pruetamanioPi];
    }

    /*metodo con la operacion insertar dato al array
    public void Insertar(int elementopila, Object aux) throws Exception {
   
        if (elementopila !=-1) {
            if (PilaLlena()) {
               throw new Exception("Desbordamiento de pila");  
            }
            aux=listapi[cimapila];
            cimapila++;
            return;
        
    }

    }*/

    //metodo operacion insertar elemento ala pila Y en caso de estar llena
    //ocurre un mensaje de desbordamiento de la pila es decir envia
    //mensaje al usuario que la pila sobrepaso su limite
    public void InsertarElemento(int elementopila) throws Exception
    {
        if (elementopila!=-1) {
            if (PilaLlena()) {
                throw new Exception("Desbordamiento de la pila");
                
            }
            cimapila ++;
            listapi[cimapila]= elementopila;
            
        }

    }

    //metodo de pila llena esta operacion es encargada de realizar el censo de 
    //los elementos de la pila y verificar con cuantos datos cuenta la pia para 
    //para saber si esta llena o vacia
    public boolean PilaLlena(){
        return this.cimapila==pruetamanioPi-1;

    }




    
}
