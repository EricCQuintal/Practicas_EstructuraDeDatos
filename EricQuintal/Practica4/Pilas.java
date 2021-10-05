package EricQuintal.Practica4;


//nombre de la clase pilas 
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
    //envia mensaje al usuario que la pila sobrepaso su limite y esta llena.
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
    //metodo que muestra el contenido de la pila y en caso de estar vacia
    //envia un mensaje al usuario pila vacia . 
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

        //metodo quitar el que me dio dolor de cabeza este metodo tiene como fin 
        //eliminar el valor de la posicion ultima a entrar hasta quitar todos
        //los elementos de la pila.
        public void Quitar(int elemento){
            //mostrar el ultimo valor y eleiminarlo
             if(PilaVacia()){
                 System.out.println("no se puede extraer ningun elemento");

             }
            elemento=listapi[cimapila];
            cimapila--;
            elemento=listapi.length-1;
            System.out.println(); 
            
        }

        //metodo cima de la pila este metodo tiene como in enviar un mensaje al 
        //ususario el cual sera la posicion ultima segun siguiendo las normas 
        //de la pila es decir el primero en entrar es el ultimo en salir
        //y el ultimo en entrar es el primero en salir por lo cual enviara 
        //la posicion ultima en entrar y el valor q cuenta.
        public void ChecarCimapila(){
            if (PilaVacia()) {
                System.out.println("pila vacia");  
            }else{
                System.out.println("La cima de la pila es: "+listapi[cimapila]);
            }
            

        }
        //metodo limpiar pila como se pbserva el metodo siguiente limpia la pila es
        //decir elimina todos los datos almacenados en la pila y envia un mensaje al
        //final de su ejecucion 
        public void LimpiarPila(int aux){
            if (PilaLlena()) {
                while (cimapila<=listapi[cimapila]) {
                    aux=listapi[cimapila];
                    cimapila--;
                    aux=listapi.length-3;
                    System.out.println("LA PILA SE VACIO CORRECTAMENTE"); 
                }
               
              
              
            }
        }
        //metodo tamanio pila este metodo tiene como fin enviar al ususrio segun 
        //el tamaño designado por el progrmamador con la variable con el valor del
        //arreglo el tamaño de la pila es decir el valor del tamaño.
        public int TamanioPila(){
         
            System.out.println("El tamaño de la pila es: "+ pruetamanioPila);
            return pruetamanioPila;
        }

    }


        



    
                
            
        
        
    




    

