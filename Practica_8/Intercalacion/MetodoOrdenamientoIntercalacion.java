package Practica_8.Intercalacion;

    public class MetodoOrdenamientoIntercalacion {

	int a,b,auxiliar;

	//constructor de metdodo por intercalacion
	public MetodoOrdenamientoIntercalacion() 
	{
		this.a=0;
		this.b=0;
		this.auxiliar=0;
	}
	//metodo burbuja se usa para el ordenamiento previo del arreglo
	//metodo burbuja
	public void OrdenaArreB(int []arreglo) 
	{

		for(a=0;a<arreglo.length;a++) 
		{
			for(b=a+1;b<arreglo.length;b++) 
			{
				if(arreglo[a]>arreglo[b]) 
				{
					auxiliar=arreglo[a];
					arreglo[a]=arreglo[b];
					arreglo[b]= auxiliar;
				}
			}
		}
	}
	//metodo mostrar el arreglo
	public void MostrarArreglo(int[]arreglo) {
		int a;
		for(a=0;a<arreglo.length;a++) {
			System.out.print("["+arreglo[a]+"]");
		}
		System.out.println("");
	}
	//metodo por intercalacion esste es el encragado de realizar el proceso 
	//de intercalacion comparando si estos son menores o mayores 
	//dependiendo se acomodaria en a posicion que le corresponde
	public void IntercalarArreglos(int[] array1, int[]array2) {
		int a,b,c;
		
		int array3[]= new int [array1.length+array2.length];
		for(a=b=c=0;a<array1.length && b<array2.length;c++) {
			if(array1[a]< array2[b]) {
				array3[c]= array1[a];
				a++;
			}else {
				array3[c]=array2[b];
				b++;
			}
		}
		//for inicia el arreglo donde termino anterior arreglo
		for(;a<array1.length;a++,c++) {
			array3[c]=array1[a];
		}
		for(;b<array2.length;b++,c++) {
			array3[c]=array2[b];
		}
		System.out.println("Datos de Arreglo por intercalacion ordenado");
		//metodo el cual realiza la imprenta de el nuevo arreglo
		//seria ambos arreglos anteriores ya ordenados
		MostrarArreglo(array3);
		int contador=0;
		for(a=0;a<array3.length;a++) {
			for(b=0;b<array3.length;b++) {
				if(a!=b) {
					if(array3[a]==array3[b]) {
						array3[a]=0;
						contador++;
					}
				}
			}
		}
		//El proceso realizado en esta parte del codigo es el encragdo 
		//si hay elemntos repetidos no los mostrara
		int cont2=0;
		int aux[]= new int[array3.length-contador];
		for(a=0;a<array3.length;a++) {
			if(array3[a]!=0) {
				aux[cont2]=array3[a];
				cont2++;
			}
		}
		System.out.println("Arreglo final Sin elementos repetidos");
		MostrarArreglo(aux);
	}
}