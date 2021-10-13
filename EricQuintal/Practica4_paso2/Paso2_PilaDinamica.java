package EricQuintal.Practica4_paso2;
//importamos libreria del vector

import java.util.Vector;

//declaramos la clase la cual sera la pila dinmica 
public class Paso2_PilaDinamica {
    //se declara el tamaño del vector el cual sera 4 
    private static final int tamanio=4;
    private int tope;//se inserta la variable tope que sera la cima o ultimo dato
    //pila
    private Vector listapila;//se declara el verctor llamado listapila
    private Object aux;
    //se crea constructor
    public Paso2_PilaDinamica(){
        this.tope=-1;
        this.listapila=new Vector(tamanio);
    }
    //se crea metodo ingresar dato a pila nombre push
    public void Push(int elemento){
        this.tope++;
        listapila.addElement(elemento);
    }
    //se crea metodo quitar funcion quitar datos de la pila 
    public int Quitar(int aux){
        
        if(PilaVacia()) {
            System.out.println("la pilas esta vacia no se pueden eliminar elementos");
        }
        
            this.aux=listapila.elementAt(tope);
            this.listapila.removeElementAt(tope);
            this.tope--;
            return aux;
           
    }
   //se crea metodo cima pila esta es encargado de proporcionar la cima 
   //o valor cima de la pila
    public void CimaPila(){
        if(PilaVacia()){
            System.out.println("pila vacia no se puede extraer");
        }
        System.out.println(listapila.elementAt(tope));
        
    }
    

//este metodo se encarga de devolver false o un true segun sea el caso 
    public boolean PilaVacia(){
        return this.tope==-1;
    }
//este metodo es encargado de realizar el vaciado de la pila 
    public void VaciarPila(){
        while(!PilaVacia()){
            Quitar(tope);
        }
    }
//este metodo es el encargado de realizar la muestra de pila esta vacia 
    public void MostrarPila() {
        if (PilaVacia()) {
            System.out.println("PILA VACIA");
        }
        else{
            /*int i=0;
            while (i<cimapila) {
                System.out.println(listapi[i]);
                i++;*/
                
            }
            
            
        }
         //metodo de pila llena esta operacion es encargada de realizar el censo de 
    //los elementos de la pila y verificar con cuantos datos cuenta la pia para 
    //para saber si esta llena o vacia
    public boolean PilaLlena(){
        return this.tope==tamanio-1;

    }

    public int TamanioPila(){
         
        System.out.println("El tamaño de la pila es: "+ tamanio);
        return tamanio;
    }



    }
    

