package EricQuintal.Practica7;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstNoLinGrafo 
{
    public static void main(String[] args) throws Exception
    { 
        int opc=0;
        String nom, va, vb;

        BufferedReader entrada = new BufferedReader(new InputStreamReader (System. in));
       GrafoMatriz grafo = new GrafoMatriz();
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
                             "4. Salir \n\n" +
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
            }while(opc!=4);
        }
    }