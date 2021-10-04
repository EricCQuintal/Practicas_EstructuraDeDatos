package EricQuintal.Practica4;



public class Pilas {
    private static final int pruetamanioPila=4;
    private int cimapila;
    private int listapi[];
    
    //constructor 
    public Pilas(){
        this.cimapila=-1;
        this.listapi=new int [pruetamanioPila];
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
    public void InsertarElemento(int elemento) 
    {
        if (elemento!=-1) {
            if (PilaLlena()) {
                System.out.println("LA PILA ESTA LLENA");
            } 
            cimapila++;
            listapi[cimapila]=elemento;
        }
            
            
        

    }

    //metodo de pila llena esta operacion es encargada de realizar el censo de 
    //los elementos de la pila y verificar con cuantos datos cuenta la pia para 
    //para saber si esta llena o vacia
    public boolean PilaLlena(){
        return this.cimapila==pruetamanioPila-1;

    }
    //metodo que verifica si la pila esta vacia es decir verifica si este
    //dispone de espacio y envia true or false segun sea el caso si tiene 
    //espacio true y si no tiene espacio falso
    public boolean PilaVacia() {
        return cimapila==-1;
        
    }
    //metodo que muestra el contenido de la pila 
    public void MostrarPila() {
        if (PilaVacia()) {
            System.out.println("PILA VACIA");
        }
        else{
            /*int i=0;
            while (i<cimapila) {
                System.out.println(listapi[i]);
                i++;*/
        
        int aux []=new int[listapi.length]; 
        for(int i=listapi.length-1, j=0; i>=0;i--,j++)
        {
            aux[j]=listapi[i];
            System.out.println(aux[j]);
        }
                
            }
            
            
        }
        /*public void Quitar(int elemento){
            //mostrar el ultimo valor y eleiminarlo
             if(PilaVacia()){
                 System.out.println("no se puede extraer ningun elemento");

             }
            elemento=listapi[cimapila];
            cimapila--;
            elemento=listapi.length-1; 
            
        }*/

        //metodo quitar 
        public void Quitar(int elemento){
            //mostrar el ultimo valor y eleiminarlo
             if(PilaVacia()){
                 System.out.println("no se puede extraer ningun elemento");

             }
            elemento=listapi[cimapila];
            cimapila--;
            elemento=listapi.length-1; 
            
        }

        //metodo cima de la pila 
        public void ChecarCimapila(){
            if (PilaVacia()) {
                System.out.println("pila vacia");  
            }else{
                System.out.println("La cima de la pila es: "+listapi[cimapila]);
            }
            

        }
        //metodo limpiar pila 
        public void LimpiarPila(int aux){
            if (PilaLlena()) {
                while (cimapila<=listapi[cimapila]) {
                    aux=listapi[cimapila];
                    cimapila--;
                    aux=listapi.length-3;
                    System.out.println("SE QUITO ELEMENTO CON EXITO: "+aux); 
                }
               
              
              
            }
        }
        //metodo tamanio pila 
        public int TamanioPila(){
         
            System.out.println("El tamaño de la pila es: "+ pruetamanioPila);
            return pruetamanioPila;
        }

    }


        



    
                
            
        
        
    




    

