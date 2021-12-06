package Practica_9;
// se importaron las librerias del tipo arraay
import java.util.Arrays;
public class BusquedaHash {
    //Atributos
	String array[];
	int tam, contador;
	//Constructor
	public BusquedaHash(int tam) {
		this.tam= tam;
		array= new String [tam];
        // Si es igual a -1 el arreglo está vacio lo que determina el contenido del vector 
		Arrays.fill(array, "-1"); 
	}
	//Método Operacion de la tabal hash 
	public void OperacionHash(String cadenaArreglo[], String arreglo[]){ //Asignar una clave

		int i;
        //Insertar el elemeto a la pocision de la cadenaArreglo en el iterativo de i
		for(i=0; i<cadenaArreglo.length; i++){
			String elemento= cadenaArreglo[i]; 
			int indiceArreglo= Integer.parseInt(elemento)% (cadenaArreglo.length-1); //Convertir
			System.out.println("El indice es " + indiceArreglo + " Para el elemento " + elemento);
			//Tratar colisiones
			while(arreglo[indiceArreglo]!="-1"){
				indiceArreglo++;
				indiceArreglo%=tam;
			}
            //Asignar al arreglo comp parmatro indice de arreglo esto asignarlo a elemento
			arreglo[indiceArreglo]=elemento; 
		}
	}
    //busca la clave del arreglo 
	public String Buscar(String elemento, String[]cadenaArreglo){
		int indiceArreglo= Integer.parseInt(elemento)% (cadenaArreglo.length - 1);
		int contador=0;
        //se inicializara en la posicion del indice -1 que quiere decir que esta vacio
        //si es diferente de vacio ingresa en la condicional if
		if(array[indiceArreglo]!="-1"){
            //Si es diferente de vacio ingresa al ciclo while 
			while(array[indiceArreglo]!="-1"){
                //en caso de encontrar la clave en el indice del arreglo enviara mensaje segun 
                //esetn ubicados los valores en la tabla hash
				if(array[indiceArreglo]==elemento){
					System.out.println("El elemento " + elemento + " fue encontrado en el indice "
							+ indiceArreglo);
					return array[indiceArreglo];
                    //el indice arreglo esta limitado por el modulo del parametro de la variable 
                    //tam la cual teiene un valor asignado en el main de 10 segun lo solicitado
                    //por el compñero de clase.
				}else {
					indiceArreglo++;
					indiceArreglo%=tam;
					contador++;
				}
                //en caso de cumplirse esta condicion se pretende terminar la busqueda 
                //de la clave y fializar 
				if(contador>(cadenaArreglo.length-1)){
					break;
				}
			}
		}
		return null;
	}

	//Es el encragado de mostrar la tabla la cual tienen en su interio los valores 
    //y la clave a buscar 
	public void MostrarTabla(){
		int incremento= 0, i, j;
		for(i=0; i<1; i++){
			incremento+=array.length;
			for(j=0; j<71; j++){
				System.out.print("-");
			}
			System.out.println();
			for(j=incremento -array.length; j<incremento; j++) {
				System.out.format("| %3s " + " ", j);
			}
			System.out.println("|");
			for(int n=0; n< 71; n++){
				System.out.print("-");
			}
			System.out.println();
			for(j=incremento - array.length; j< incremento; j++){
				if(array[j].equals("-1")) {
					System.out.print("|     ");
				}else {
					System.out.print(String.format("| %3s " + " ", array[j]));
				}
			}
			System.out.println("|");
			for(j=0;j<71; j++){
				System.out.print("-");
			}
			System.out.println();
		}
	}
    
}
