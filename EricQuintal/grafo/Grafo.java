package EricQuintal.grafo; 
//se creo la clase grafo la cual crea una matriz de pesos
public class Grafo {
    private final int NUM_VERTICES;
	public int [][] grafo;
	
	//Crea un grafo de numVertices
	//La matriz de adyacencia es inicializada con ceros.
	public Grafo(int numVertices){
		this.NUM_VERTICES = numVertices;
		grafo = new int [NUM_VERTICES][NUM_VERTICES];
		
		for (int i = 0; i < grafo.length; i++) {
			for (int j = 0; j < grafo[i].length; j++) {
				grafo[i][j] = 0;
			}
		}
	}
	
	//Crea un grafo de 5 vertices
	public Grafo(){
		this(6);
	}
	//se encarga de asignar los valores a los vertices y posisionarlos 
	//en la matriz esta se encarga de asignar los vertices y el peso
	//de la arista
	public void insertarArista(int v1, int v2, int pesoArista) 
				throws ArrayIndexOutOfBoundsException ,
				IllegalArgumentException{
		if(pesoArista == 0){
			throw new IllegalArgumentException();
		}
		 this.grafo[v1][v2] = pesoArista;		
		 this.grafo[v2][v1] = pesoArista;
	}
	//este metodo verifica si esta arista o las arista entre el vertice 
	//1 y 2 exite una conexion 
	public boolean existeArista(int v1, int v2)
					throws ArrayIndexOutOfBoundsException{
		
		return (grafo[v1][v2] != 0);
	}
	
	//este metodo obtiene el peso de de la arista y los asigan al grafo 
	//o matriz 
	public int obtenerPesoArista(int v1, int v2)
				throws ArrayIndexOutOfBoundsException{
		return grafo[v1][v2];
	}
	
	//como menciona el metdod es encargado de imprimir el contenido de la
	//matriz de pesos y el contenido del grafo en posiscion iterativa de 
	//[i] y [j] de la matriz de pesos
	public void imprimirGrafo(){
		System.out.printf("  %d" , 0);
		for (int i = 1; i < grafo.length; i++) {
			System.out.printf(" %d" , i);
		}
		System.out.println();
		
		for(int i = 0; i < grafo.length; i++){
			System.out.printf("%d ",i);
			for(int j = 0; j < grafo[i].length; j++){
				System.out.printf("%d " , grafo[i][j]);
			}
			System.out.println();
		}
	}

	public int eliminarArista(int v1, int v2)
				throws ArrayIndexOutOfBoundsException,
					   IllegalArgumentException{
		if(grafo[v1][v2] == 0) throw new IllegalArgumentException("La arista No existe");
		int peso = grafo[v1][v2];
		grafo[v1][v2] = 0;
		grafo[v2][v1] = 0;
		return peso;
	}
	
	public void liberarGrafo(){
		for (int i = 0; i < grafo.length; i++) {
			for (int j = 0; j < grafo[i].length; j++) {
				grafo[i][j] = 0;
			}
		}
	}
	
// ----- Métodos para Mostrar la lista de adyacencia de un vértice -----//

	public boolean tieneAdyacentes(int v)
					throws ArrayIndexOutOfBoundsException{
		int vActual = 0;
		boolean existeLista = false;
		
		while(vActual < this.NUM_VERTICES && !existeLista){
			if(grafo[v][vActual] != 0){
				existeLista = true;
			}
			else{
				vActual = vActual + 1;
			}
		}
		
		return existeLista;
	}
	

	public int obtenerPrimerAdy(int v)
				 throws ArrayIndexOutOfBoundsException,
				 		UnsupportedOperationException{
		int adyacente = -1;
		int vActual = 0;
		boolean existeLista = false;
		
		while(vActual < this.NUM_VERTICES && !existeLista){
			if(grafo[v][vActual] == 0){
				vActual = vActual + 1;
			}
			else{
				adyacente = vActual;
				existeLista = true;
			}
		}
		
		if(!existeLista) throw new UnsupportedOperationException("No existe Lista");
		
		return adyacente;		
	}
	
	public int sgteAdyacente(int v, int anteriorAd)
	 			throws ArrayIndexOutOfBoundsException,
	 					UnsupportedOperationException{
		int adyacente = 0;
		int vActual = anteriorAd + 1;
		boolean existeLista = false;
		
		while(vActual < this.NUM_VERTICES && !existeLista){
			if(grafo[v][vActual] == 0){
				vActual = vActual + 1;
			}
			else{
				adyacente = vActual;
				existeLista = true;
			}
		}
		
		if(!existeLista)adyacente = -1;
		return adyacente;
	}
// ----- Fin de métodos para mostrar lista de adyacencia de un vértice -----//
    
}
