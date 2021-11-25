package Practica_8.Intercalacion;

public class IntercalacionMain {
    public static void main(String[] args) {
		Intercalacion Ordenar= new Intercalacion();
		int vector1[]= {5,6,3,44,22,1};
		int vector2[]= {5,2,1,8,3,9,7,44,3,5,2};
		System.out.println("Arreglo vector 1 original");
Ordenar.mostrarArreglo(vector1);
System.out.println("Arreglo vector 2 original");
Ordenar.mostrarArreglo(vector2);
Ordenar.burbuja1(vector1);
Ordenar.burbuja1(vector2);
System.out.println("Arreglo vector 1 ordenado");
Ordenar.mostrarArreglo(vector1);
System.out.println("Arreglo vector 2 ordenado");
Ordenar.mostrarArreglo(vector2);
Ordenar.intercalacion(vector1, vector2);
	}	
}