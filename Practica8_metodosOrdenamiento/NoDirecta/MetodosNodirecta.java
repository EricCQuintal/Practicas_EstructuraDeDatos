package Practica8_metodosOrdenamiento.NoDirecta;

public class MetodosNodirecta {
    int i,j,temporal;
	public MetodosNodirecta() {
		this.i=0;
		this.j=0;
		this.temporal=0;
	}
	//metodo burbuja
	//mostrar arreglo
	public void mostrarArreglo(int[]arreglo) {
		int k;
		for(k=0;k<arreglo.length;k++) {
			System.out.print("["+arreglo[k]+"]");
		}
		System.out.println("");
	}
	//metodo por mezcla directa
	public int[] mezclaDirecta(int[]arreglo) {
		int i,j,k;
		if(arreglo.length>1){
			int nElementoIzq= arreglo.length/2;
			int nElementoDer= arreglo.length-nElementoIzq;
			int arregloIzq[]= new int[nElementoIzq];
			int arregloDer[]= new int [nElementoDer];
			for(i=0;i<nElementoIzq;i++) {
				arregloIzq[i]=arreglo[i];
			}
			for(i=nElementoIzq;i<nElementoIzq+nElementoDer;i++) {
				arregloDer[i-nElementoIzq]=arreglo[i];
			}
			arregloIzq=mezclaDirecta(arregloIzq);
			arregloDer=mezclaDirecta(arregloDer);
			i=0;
			j=0;
			k=0;
			while(arregloIzq.length!=j&&arregloDer.length!=k) {
				if(arregloIzq[j]<arregloDer[k]) {
					arreglo[i]=arregloIzq[j];
					i++;
					j++;
				}else {
					arreglo[i]=arregloDer[k];
					i++;
					k++;
				}
			}
			
			while(arregloIzq.length != j) {
				arreglo[i]=arregloIzq[j];
				i++;
				j++;
			}
			while(arregloDer.length != k){
				arreglo[i]=arregloDer[k];
				i++;
				k++;
			}
		}
		return arreglo;
	}
	public void mostrarArreglo2(int[]arreglo) {
		int k;
		for(k=0;k<arreglo.length;k++) {
			System.out.print("["+arreglo[arreglo.length-1-k]+"]");
		}
		System.out.println("");
	}
	
	public void mostrarElementRepe(int []arreglo) {
		int aux[]= new int[numRepetidos(arreglo)];
		int contador2=0;
		for(i=0;i<arreglo.length;i++) {
			for(j=0;j<arreglo.length;j++) {
				if(i!=j) {
					if(arreglo[i]==arreglo[j]) {
						arreglo[i]=0;
						contador2++;
						aux[contador2-1]=arreglo[i+1];
						
					}
				}
			}
		}
		mostrarArreglo(aux);
	}
	public int numRepetidos(int[]arreglo) {
		int contador=0;
		int aux2[]= new int[arreglo.length];
		for(int i=0;i<aux2.length;i++) {
			aux2[i]=arreglo[i];
		}
		for(i=0;i<aux2.length;i++) {
			for(j=0;j<aux2.length;j++) {
				if(i!=j) {
					if(aux2[i]==aux2[j]) {
						aux2[i]=0;
						contador++;
					}
				}
			}
		}
		return contador;
	}
    
}
