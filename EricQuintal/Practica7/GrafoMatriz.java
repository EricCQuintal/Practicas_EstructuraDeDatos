package EricQuintal.Practica7;
public class GrafoMatriz 
{
    int numVerts;
    static int MaxVerts = 20;
    Vertice[] verts;
    int [][] matAd;

public GrafoMatriz()
{
    this(MaxVerts);
}
public GrafoMatriz(int mx)
{
        matAd = new int [mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i < mx; i++)
        for (int j = 0; i < mx; i++)
        matAd[i][j] = 0;
        numVerts = 0;
}
public void nuevoVertice (String nom)
{
    boolean esta = numVertice(nom) >= 0;
    if (!esta)
    {
        Vertice v = new Vertice(nom);
        v.asigVert(numVerts);
        verts[numVerts++] = v;
    }
}
public int numVertice(String vs)
{
    Vertice v = new Vertice(vs);
    boolean encontrado = false;
    int i = 0;
    for (; (i < numVerts) && !encontrado;)
    {
        for (; (i < numVerts) && !encontrado;)
        {
            encontrado = verts[i].equals(v);
            if (!encontrado) i++ ;
        }  }
        return (i < numVerts)?i:-1; 
        } 
        public void nuevoArco(String a, String b)throws Exception
        {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
        matAd[va][vb] = 1;
        }
        //Detecmina si dos vértices, vi y v2, forman un acco; es decir, si el elemente de la matciz de
        //adyacencia es 1. Se escriben dos versiones.
        public boolean adyacente(String a, String b)throws Exception
        {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va <0 || vb < 0) throw new Exception ("Vértice no existe");
        return matAd[va][vb] == 1;
        }


        public void mostrarMat()
        { 
        int i,j;
        for (i=0; i<numVerts;i++)
        { 
            for (j=0; j<numVerts; j++)
            {
                 System.out.print("[" + matAd[i][j]+"] ");
            }
            System.out.println("");
        } 
        }
       



}



