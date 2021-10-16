package EricQuintal.prueba;
//nombre de la clase pilas 
public class Pilas {
    //tamaño de la pila designada por progrmador
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
            System.out.println("El elemento ingresado es: "+elemento);
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
    public void MostrarPilaInvertido() {
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
            System.out.println("El elemento es: "+aux[j]);          
        }
        }
                
            }
       
       //metodo mostrar este metodo es encargado de realizar por medio de un for 
       //un censo el cual usa un if para checar si la pila creada esta vacia en 
       //si esta vacia enviara un mensaje el cual dira pila esta vacia 
       //si no entrara a un or el cual estara encargado de realizar un censo 
       //de toda la pila el cual con ayuda de un for escanera toda la pila 
       //el punto lenght hace referencia al tamño de la pila. 
            public void MostrarPila() {
                if (PilaVacia()) {
                    System.out.println("PILA VACIA");
                }else{
                int aux []=new int[listapi.length]; 
                for(int i=listapi.length-1, j=0; i>=0;i--,j++)
                {
                    //al final este arreglo de tipo objeto creado 
                    //sera igual a la lista pila que creamos al principio
                    aux[i]=listapi[j];
                    //este al crear la nueva pila imprimira todos 
                    //los iteradores de tipo [i]
                    System.out.println("El elemento es: "+aux[i]);
                    
                }
            }
                
            }
//este metodo es el encargado de eliminar los datos obtneidos por teclado
//datos repetidos esta operacion es realzada con 2 for y un while los
//primeros 2 for crean dos listas y mediante el while comparan esta 
//y en caso de coincidir envia un mensaje de borrar datos repetido
            public void EliminarRepetidos(){
                int aux []=new int[listapi.length];  
                for(int i=0;i<aux.length;i++){
                    for(int j=i+1;j<aux.length;j++){
                        while(aux[i]==(aux[j])){
                            aux[i]=listapi[j];
                            j--;
                            System.out.println("Dato duplicado Removido: "+aux[j]);
                        }
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
             
            
        }

        //metodo cima de la pila este metodo tiene como in enviar un mensaje al 
        //ususario el cual sera la posicion ultima segun siguiendo las normas 
        //de la pila es decir el primero en entrar es el ultimo en salir
        //y el ultimo en entrar es el primero en salir por lo cual enviara 
        //la posicion ultima en entrar y el valor q cuenta.
        public void ChecarCimapila(){
            if (PilaVacia()) {
                System.out.println("PILA ESTA VACIA"); 
             }else{
                System.out.println("La cima de la pila es: "+listapi[cimapila]);
            }
            
            

        }
        //metodo limpiar pila como se pbserva el metodo siguiente limpia la pila es
        //decir elimina todos los datos almacenados en la pila y envia un mensaje al
        //final de su ejecucion 
        public void LimpiarPila(){
           while (!PilaVacia()) {
               Quitar(listapi[cimapila]);
               
           } 
           System.out.println("La pila se ha limpiado con exito");
              
              
            }
        
        //metodo tamanio pila este metodo tiene como fin enviar al ususrio segun 
        //el tamaño designado por el progrmamador con la variable con el valor del
        //arreglo el tamaño de la pila es decir el valor del tamaño.
        public int TamanPila(){
            System.out.println(pruetamanioPila);
            return cimapila;

            
        }

    }


        



    
                
            
        
        
    




    

