package Practica8_metodosOrdenamiento.NoDirecta;

public class ClaseMain {
    public static void main(String[] args) {
		MetodosNodirecta Ordenar= new MetodosNodirecta();
		int vector1[]= {5,6,3,44,22,1};
		int vector2[]= {5,2,1,8,3,9,7,44,3,5,2};
		System.out.println("Vector 2 original");
		Ordenar.mostrarArreglo(vector2);
		System.out.println("Vector 2 ordenado");
		vector2= Ordenar.mezclaDirecta(vector2);
		System.out.println("Ascendente");
		Ordenar.mostrarArreglo(vector2);
		System.out.println("Descendente");
		Ordenar.mostrarArreglo2(vector2);
		System.out.println("Numero de elementos repetidos");
		System.out.println(Ordenar.numRepetidos(vector2));
		System.out.println("Elementos que se repiten"); 
		Ordenar.mostrarElementRepe(vector2);
	}	
    
}
