package EricQuintal.Practica4_paso2;

import java.util.Vector;

public class Paso2_PilaDinamica {

    private static final int tamanio=4;
    private int tope;
    private Vector listapila;
    private Object aux;

    public Paso2_PilaDinamica(){
        this.tope=-1;
        this.listapila=new Vector(tamanio);
    }
    public void Push(int elemento){
        this.tope++;
        listapila.addElement(elemento);
    }
    public int Quitar(int aux){
        
        if(PilaVacia()) {
            System.out.println("la pilas esta vacia no se pueden eliminar elementos");
        }
        
            this.aux=listapila.elementAt(tope);
            this.listapila.removeElementAt(tope);
            this.tope--;
            return aux;
           
    }

    public Object CimaPila()throws Exception{
        if(PilaVacia()){
            throw new Exception("pila vacia no se puede extraer");
        }
        return listapila.elementAt(tope);
    }


    public boolean PilaVacia(){
        return this.tope==-1;
    }

    public void VaciarPila(){
        while(!PilaVacia()){
            Quitar(tope);
        }
    }

    }
    

