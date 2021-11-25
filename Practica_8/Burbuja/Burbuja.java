package Practica_8.Burbuja;

//Editar que se pueden ingresar los valores por teclado y falta de menu
//Editar que no se vea igual

public class Burbuja {
	//Atributos
	int i, j, temporal, intercambios, comparaciones;
	//Constructor
	public Burbuja() {
		this.i=0;
		this.j=0;
		this.temporal=0;
	} 

	//Burbuja, Forma 2G
		public void ordenarForma(int []nums, String tipoOrdenamiento) {
			comparaciones=0;
			intercambios=0;
			for (i = 0; i < nums.length - 1; i++) {
				for (j = i; j < nums.length; j++) {
					if(tipoOrdenamiento=="Asc") {
						if (nums[i] > nums[j]) {
							intercambios ++ ;
							temporal = nums[i];
							nums[i] = nums[j];
							nums[j] = temporal;
						}
					}else if(tipoOrdenamiento=="Des"){
						if (nums[i]  < nums[j]) {
							intercambios ++ ;
							temporal = nums[i];
							nums[i] = nums[j];
							nums[j] = temporal;
						}
					}
					comparaciones ++ ;
				}
			}
			System.out.println( " Numero de intercambios: " + intercambios);
			System.out.println( " Numero de comparaciones: " + comparaciones);
		}
	//Burbuja, Forma 0,  15 intercambios
	public void ordenarForma1(int []nums, String tipoOrdenamiento) {
		comparaciones=0;
		intercambios=0;
		for (i = 0; i < nums.length; i++) {
			for (j = i + 1; j < nums.length; j++) {
				if(tipoOrdenamiento=="Asc") {
					if (nums[i] > nums[j]) {
						intercambios ++ ;
						temporal = nums[i];
						nums[i] = nums[j];
						nums[j] = temporal;
					}
				}else if(tipoOrdenamiento=="Des"){
					if (nums[i]  < nums[j]) {
						intercambios ++ ;
						temporal = nums[i];
						nums[i] = nums[j];
						nums[j] = temporal;
					}
				}
				comparaciones ++;
			}
		}
		System.out.println( " Numero de intercambios: " + intercambios);
		System.out.println( " Numero de comparaciones: " + comparaciones);
	}
	
	//Burbuja, Forma 2, 12 comparaciones
	public void ordenarForma2(int []nums, String tipoOrdenamiento) {
		comparaciones=0;
		intercambios=0;
		boolean ordenado= true;
		//Recorrer el arreglo
		for (i = 0; i < nums.length - 1; i++) { 
			//Controlar intercambios
			ordenado=true;
			//Comparaciones
			for (j = 0; j < nums.length -i -1 ; j++) {			
				if(tipoOrdenamiento=="Asc") {
					if(nums[j]> nums[j + 1]) {
						intercambios ++ ;
						temporal = nums[j];
						nums[j]= nums[j + 1];
						nums[j + 1]= temporal;
						ordenado= false;
					}	
				}else if(tipoOrdenamiento=="Des") {
					if(nums[j]< nums[j+1]){	
						intercambios++;
						temporal = nums[j];
						nums[j]= nums[j + 1];
						nums[j + 1]= temporal;
						ordenado= false;
					}
				}	
			}
			comparaciones ++ ;
			if(ordenado==true){
				System.out.println(" Ya estoy ordenado, est� de m�s seguir");
				break;
			}
		}
		System.out.println( " Numero de intercambios: " + intercambios);
		System.out.println( " Numero de comparaciones: " + comparaciones);
	}
	//
	
	//Mostrar
	public void mostrarArreglo(int [] arregloNum){
		int k;
		for(k=0;k<arregloNum.length;k++) {
			System.out.print("[" + arregloNum[k] + "] ");	
		}
		System.out.println("");
	}
}