package EricQuintal.Practica7;

public class GrafoMatriz {
    int numerovertices;
    static int maxVertices = 20;
    Vertice[] vertices;
    int[][] matrizAd;

    public GrafoMatriz() {
        this(maxVertices);
    }

    // constructor
    public GrafoMatriz(int mx) {
        matrizAd = new int[mx][mx];
        vertices = new Vertice[mx];
        for (int i = 0; i < mx; i++)
            for (int j = 0; i < mx; i++)
                matrizAd[i][j] = 0;
        numerovertices = 0;
    }

    // metdodo 1 agregar nuevo vertice
    public void NuevoVertice(String nom) {
        boolean esta= NumVertice(nom)>=0;
        if (!esta) {
            Vertice v=new Vertice(nom);
            v.AsignarVertice(numerovertices);
            vertices[numerovertices++]=v;
            
        }
    //identificador de numero de vertice 
        public int NumVertice(String vs){
            Vertice v=new Vertice(vs);
            boolean encontrado=false;
            int i=0;
            for(;(i<numerovertices) && !encontrado;)
            {
                encontrado=vertices[i].equals(v);
                if (!encontrado) i++;  
                
            }
            return (i<numerovertices)?i:-1;
        
        }


        //metodo 4 public 
        public void NuevoArco(String a,String b)  
        {
            int va,vb;
            va=NumVertice(a);
            vb=NumVertice(b);
            if(va<0|| vb<0)throw new Exception("vertice no existe");
            matrizAd[va][vb]=1;
            
        }
        //determina si dos vertices v1 y v2 forman un arco; es decir, si el 
        //elemento de la matriz de adayacencia es 1 se escriben dos versiones 

        public boolean Adyacente(String a,String b)throws Exception
        {
            int va,vb;
            va=NumVertice(a);
            vb=NumVertice(b);
            if(va<0 || vb<0)throw new Exception("vertice no existe");

        }

        public void MostrarMatriz()
        {
            int i,j;
            for(i=0; i<numerovertices;i++);

        }
        




        
    }

}
