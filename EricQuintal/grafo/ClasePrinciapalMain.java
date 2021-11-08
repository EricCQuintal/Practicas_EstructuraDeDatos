package EricQuintal.grafo;

import java.util.Scanner;

public class ClasePrinciapalMain {
    public static void menu(){
		System.out.println("1. Añadir arista");
		System.out.println("2. Eliminar arista");
		System.out.println("3. Eliminar Grafo");
		System.out.println("4. Mostrar Grafo");
		System.out.println("5. Obtener lista Adyacencia vertice");
		System.out.println("6. Salir");
	}
	
	public static void addArista(Grafo g){
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese v1 y v2");
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		System.out.println("Ingrese el peso de la arista");
		int pesoArista = in.nextInt();
		g.insertarArista(v1, v2, pesoArista);
	}
	
	public static void deleteArista(Grafo g){
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese v1 y v2");
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		if(g.existeArista(v1, v2))g.eliminarArista(v1, v2);
		else System.out.println("Arista buscada no existe");
	}
	
	public static void deleteGraph(Grafo g){
		System.out.println("Borrando grafo");
		g.liberarGrafo();
	}
	
	public static void showGraph(Grafo g){
		g.imprimirGrafo();
	}
	
	public static void getAdList(Grafo g){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserte vertice");
		int v = in.nextInt();
		if(!g.tieneAdyacentes(v)){
			System.out.println("La lista esta vacia");
		}
		else{
			int aux = g.obtenerPrimerAdy(v);
			System.out.println("Lista: ");
			while(aux != -1){
				System.out.print(" " + aux);
				aux = g.sgteAdyacente(v, aux);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int opcion;
		Grafo g = new Grafo();
		
		do{
			menu();
			
			System.out.println("Ingrese una opcion");
			Scanner in = new Scanner(System.in);
			opcion = in.nextInt();
			
			switch(opcion){
			case 1: addArista(g);break;
			case 2: deleteArista(g);break;
			case 3: deleteGraph(g);break;
			case 4: showGraph(g);break;
			case 5: getAdList(g);break;
			case 6: break;
			default: System.out.println("Incorrect option");
			}
		}while(opcion != 6);
	}
    
}
