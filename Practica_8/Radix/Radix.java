package Practica_8.Radix;

//Editar que se pueden ingresar los valores por teclado
//Editar que no se vea igual
//Jopcion pane

public class Radix {

        public void ordenarRadix(int [] arregloNum){
            int x, i, j;
    
            for(x=Integer.SIZE-1; x>=0; x--){
    
                int auxiliar[] = new int [arregloNum.length];
    
                j = 0;
    
                for (i=0; i<arregloNum.length; i++){
    
                    boolean mover = arregloNum[i] << x >=0;
    
                    if(x == 0 ? !mover: mover){
    
                        auxiliar[j] = arregloNum[i];
                        j++;
    
                    } else {
    
                        arregloNum[i-j] = arregloNum[i];
    
                    }
                }
    
                for (i=j; i < auxiliar.length; i++ ){
    
                    auxiliar[i] = arregloNum[i-j];
    
                }
                arregloNum = auxiliar;
            }
            System.out.println("Ordenamiento ordenado por radix");
            mostrarArregloRadix(arregloNum);
        }
    
        public void mostrarArregloRadix(int[] arregloNum) {
            
            int k; 
            for (k =0; k < arregloNum.length; k++){
                
                System.err.print("[" + arregloNum[k] + "] ");
            }
        }
    }