package Practica8_metodosOrdenamiento.Burbuja;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		int hacer=1, max, dato, resul;
		Burbuja  burbuja= new Burbuja();		
		try {
			int numeros[];
			do {
				System.out.print("Ingresa el l�mite del arreglo: ");
				max= Integer.parseInt(entrada.readLine());
			}while(max<4);
			numeros = new int[max];
			do {
				switch(hacer){
				case 1:  
					for (int i=0; i<numeros.length; i++){
						System.out.print("Ingresar el elemento " + i  + ": ");
						dato= Integer.parseInt(entrada.readLine());
						numeros[i]= dato;
					}
					break;
				case 2: //Ordenar Ascendente
				        
						MenuBurbuja.menuBurbujaForma();
						int forma= Integer.parseInt(entrada.readLine());
						if(forma==1){
							burbuja.ordenarForma(numeros, "Asc");
						}else if(forma==2){
							burbuja.ordenarForma1(numeros, "Asc");
						}else if(forma==3){
							burbuja.ordenarForma2(numeros, "Asc");
						}	
						break;
				case 3://Ordenar Descendente
					MenuBurbuja.menuBurbujaForma();
					int forma2= Integer.parseInt(entrada.readLine());
					if(forma2==1){
						burbuja.ordenarForma(numeros, "Des");
					}else if(forma2==2){
						burbuja.ordenarForma(numeros, "Des");
					}else if(forma2==3){
						burbuja.ordenarForma(numeros, "Des");
					}	
					break;
				case 4:
						burbuja.mostrarArreglo(numeros);
					break;
				case 5:
					System.exit(0);
					System.out.println("Terminado");
					break;		
				default:
					System.exit(0);
					System.out.println("La opci�n Ingresada no Existe");
						break;
				}	
				//AQUI HAY AGREGAN SU PROPIO DISE�O DE SU MEN�
				hacer= Integer.parseInt(entrada.readLine());
			}while(true);
		} catch (NumberFormatException e){ System.out.println(e.getMessage());
		} catch (IOException e){ System.out.println(e.getMessage());
		} finally{ System.out.println("Proceso Finalizado");
		}
	}
} 
