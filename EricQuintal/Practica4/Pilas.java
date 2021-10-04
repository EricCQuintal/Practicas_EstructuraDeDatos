package EricQuintal.Practica4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Pilas {
    private static final int pruetamanioPi=3;
    private int cimapila;
    private int listapi[];
    
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
        return this.cimapila==pruetamanioPi-1;

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
       
        //metodo quitar 
        public int Quitar(){
            if(PilaVacia()){
                System.out.println("pila vacia no se puede extraer ningun elemento");
            }
            int aux;
            aux=listapi[cimapila];
            cimapila--;
            return aux;
            
            
            
        }

        //metodo cima de la pila 
        public int Cimapila(){
            if (PilaVacia()) {
                System.out.println("pila vacia");
                return listapi[cimapila];
                
            }
            return listapi[cimapila];

        }
        



    }
                
            
        
        
    




    

