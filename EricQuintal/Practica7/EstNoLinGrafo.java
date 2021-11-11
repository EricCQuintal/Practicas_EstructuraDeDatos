package EricQuintal.Practica7;
//se importaron librerias
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
//se importaron las clases ya que al ponerlas en otras carpetas solo pase a importarlas 
//para que realicen las funciones 
import EricQuintal.grafo.*;
import EricQuintal.Practica7Prueba.CaminosMinimos;


public class EstNoLinGrafo 
{
    //Este es una metodo el cual tiene como funcion agregra la arista esto en el caso de la calse de
    //de la matriz de pesos la cual tiene un peso y la operacion o metodo de la calse grafo obtiene 
    //los datos proporcionados por el susuario y los asigna alas varaibles que corresponden ala 
    //ala clase este le pide al usuario que ingrese ambas verctices y el peso de la arista.  
    public static void addArista(Grafo g){
        System.out.println("Opcion 4 Agregar arista con peso ");
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese v1 y v2");
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		System.out.println("Ingrese el peso de la arista");
		int pesoArista = in.nextInt();
		g.insertarArista(v1, v2, pesoArista);
	}
    //este metodo practicamente ya obtenidos los datos por teclado pasa a recibir los datos y  
    //asignarlos al la variable g y esta recibe o hace la iperacion de imprimir grafo
    public static void showGraph(Grafo g){
		g.imprimirGrafo();
	}
    //este recibe los parametros de una matriz proporcionadas por el usuario por medio del 
    //teclado estos parametros se asignan dependeineo de la posicion en la que esten 
    //tengo delclarado una matriz de 5X5 pero esto quiere decir que recibe una matriz de 
    //5X5
    public static void CaminoMinimo(){
         // TODO code application logic here
         Scanner teclado=new Scanner(System.in);
         long matrizA[][]=new long[5][5];
         for(long i=0;i<matrizA.length;i++){
             for(long j=0;j<matrizA.length;j++){
                 System.out.println("Ingresa valores de una matriz de pesos 5X5: ");
                 matrizA[(int) i][(int) j]=teclado.nextLong();
             }
         }
         CaminosMinimos ruta= new CaminosMinimos();
          System.out.println(ruta.algoritmoFloyd(matrizA));
     
     }
    
    public static void main(String[] args) throws Exception
    { 
        int opc=0;
        String nom, va, vb;
        

        BufferedReader entrada = new BufferedReader(new InputStreamReader (System. in));
       GrafoMatriz grafo = new GrafoMatriz();
       Grafo g = new Grafo();
        do
        { 
           try
           {
               System.out.println(
                "\n-------------------------------------------\n"
                        +"MENU              \n\n" +
                             "1. INSERTAR un Vértice \n" +
                             "2. ARISTA (CREAR Arco) \n" +
                             "3. MOSTRAR matriz de adyacencia \n" +
                             "4. Agregar Datos Matriz Pesos \n"+
                             "5. Mostrar Matriz pesos\n" +
                             "6.camino minimo\n"+
                             "7. Salir \n\n"+
                             "Elige una opción: \n" +
                "------------------------------------------- \n");

                  opc = Integer.parseInt(entrada.readLine());
                  switch (opc)
                  {
                      case 1:
                          System.out.println("Ingresa el nombre del vertice: ");
                          nom = entrada.readLine();
                          grafo.nuevoVertice(nom);
                          break;
                      case 2:
                          System.out.println("Ingresa el 1° vertice: ");
                          va = entrada.readLine();
                          System.out.println("Ingresa el 2° vertice: ");
                          vb = entrada.readLine();
                          grafo.nuevoArco(va, vb);

                          break;
                      case 3:
                        grafo.mostrarMat();
                        break;

                      case 4:
                        addArista(g);
                     
                        break;

                        case 5:
                        showGraph(g);
                        break;
                        case 6:
                        CaminoMinimo();
                        break;
                        case 7:
                        System.out.println("FIN");
                        break;

                    default:
                        break;
                    }
            }
            catch(NumberFormatException n)
            {
                throw new Exception("Error" + n.getMessage());
                }
            }while(opc!=7);
        }
    }