package Practica_8.Intercalacion;

    import java.util.Arrays;

	//Editar que se pueden ingresar los valores por teclado
	//editar que no se vea igual 

    public class Intercalacion {

	int i,j,temporal;
	public Intercalacion() {
		this.i=0;
		this.j=0;
		this.temporal=0;
	}
	//metodo burbuja
	public void burbuja1(int []arreglo) {
		for(i=0;i<arreglo.length;i++) {
			for(j=i+1;j<arreglo.length;j++) {
				if(arreglo[i]>arreglo[j]) {
					temporal=arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]= temporal;
				}
			}
		}
	}
	//mostrar arreglo
	public void mostrarArreglo(int[]arreglo) {
		int k;
		for(k=0;k<arreglo.length;k++) {
			System.out.print("["+arreglo[k]+"]");
		}
		System.out.println("");
	}
	//metodo por intercalacion
	public void intercalacion(int[] arregloA, int[]arregloB) {
		int i,j,k;
		int arregloC[]= new int [arregloA.length+arregloB.length];
		for(i=j=k=0;i<arregloA.length && j<arregloB.length;k++) {
			if(arregloA[i]< arregloB[j]) {
				arregloC[k]= arregloA[i];
				i++;
			}else {
				arregloC[k]=arregloB[j];
				j++;
			}
		}
		for(;i<arregloA.length;i++,k++) {
			arregloC[k]=arregloA[i];
		}
		for(;j<arregloB.length;j++,k++) {
			arregloC[k]=arregloB[j];
		}
		System.out.println("Arreglo por intercalacion ordenado");
		mostrarArreglo(arregloC);
		int contador=0;
		for(i=0;i<arregloC.length;i++) {
			for(j=0;j<arregloC.length;j++) {
				if(i!=j) {
					if(arregloC[i]==arregloC[j]) {
						arregloC[i]=0;
						contador++;
					}
				}
			}
		}
		int cont2=0;
		int aux[]= new int[arregloC.length-contador];
		for(i=0;i<arregloC.length;i++) {
			if(arregloC[i]!=0) {
				aux[cont2]=arregloC[i];
				cont2++;
			}
		}
		System.out.println("Sin elementos repetidos");
		mostrarArreglo(aux);
	}
}