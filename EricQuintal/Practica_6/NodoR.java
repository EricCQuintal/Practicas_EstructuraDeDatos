package EricQuintal.Practica_6;

public class NodoR { 
    int dato;
    String nombre;
    NodoR hDer, hIsq;
    
    public NodoR(int d, String nom){
        this.dato=d;
        this.nombre=nom;
        this.hDer=null;
        this.hIsq=null;
    }

    public String toString(){
        return dato +" --> " + nombre;

    }
    
   
   

}
