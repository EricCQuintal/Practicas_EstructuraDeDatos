package EricQuintal.Practica7;

public class Vertice {

    String nombre;
    int numerov;
    public Vertice(String mx)
    {
        nombre =mx;
        numerov=-1;
    }


    public String NombreVertice() {
        return nombre;  
    }

    public boolean equals(Vertice n)
    {
        return nombre.equals(n.nombre);
    }

    public void AsignarVertice(int n)
    {
        numerov=n;
    }
    public String toString(){
        return nombre+"("+numerov+")";
    }

    
}
