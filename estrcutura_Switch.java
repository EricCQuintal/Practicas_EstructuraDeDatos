import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * estrcutura_Switch
 */
public class estrcutura_Switch {

    public static void main (String[] args)throws IOException

                {

                               InputStreamReader conversor;

                               BufferedReader teclado;

                               String linea,salir="n";

                               double lado1,lado2,lado3,radio,volumen,altura;

                               int opcion;

                              

                               conversor = new InputStreamReader(System.in);

                               teclado = new BufferedReader(conversor);

                               System.out.println("PROGRAMA PARA CALCULAR VOLUMENES DE CUERPOS");

                               do

                               {

                              

                                               System.out.println("\n Escoje el objeto: \n ");

                                               System.out.println("1-Prisma Rectangular ");

                                               System.out.println("2-Esfera ");

                                               System.out.println("3-Cilindro");

                                               System.out.print("\n Objeto numero: ");

                                               linea = teclado.readLine();

                                               opcion = Integer.parseInt(linea);

                                               System.out.println("\n");

                                               switch(opcion)

                                               {

                                                               case 1:

                                                                              System.out.print("Introduce el valor del lado uno: ");

                                                                              linea = teclado.readLine();

                                                                              lado1 = Double.valueOf(linea).doubleValue();

                                                                              System.out.print("Introduce el valor del lado dos: ");

                                                                              linea = teclado.readLine();

                                                                              lado2 = Double.valueOf(linea).doubleValue();

                                                                              System.out.print("Introduce el valor del lado tres: ");

                                                                              linea = teclado.readLine();

                                                                              lado3 = Double.valueOf(linea).doubleValue();

                                                                              volumen= lado1*lado2*lado3;

                                                                              System.out.println("El volumen: "+volumen);

                                                                              System.out.println("\n");

                                                                              break;

                                                               case 2:

                                                                              System.out.print("Introduce el valor del radio de la esfera: ");

                                                                              linea = teclado.readLine();

                                                                              radio= Double.valueOf(linea).doubleValue();

                                                                              volumen= 4*3.14159265*radio*radio*radio/3;

                                                                              System.out.println("El volumen: "+volumen);

                                                                              System.out.println("\n");

                                                                              break;

                                                               case 3:

                                                                              System.out.print("Introduce el valor del radio de la base del cilindro: ");

                                                                              linea = teclado.readLine();

                                                                              radio= Double.valueOf(linea).doubleValue();

                                                                              System.out.print("Introduce la altura del cilindro: ");

                                                                              linea = teclado.readLine();

                                                                              altura= Double.valueOf(linea).doubleValue();

                                                                              volumen= 3.14159265*radio*radio*altura;

                                                                              System.out.println("El volumen: "+volumen);

                                                                              System.out.println("\n");

                                                                              break;

                                                               }             

                                                               System.out.print("Quieres salir? (s/n)");

                                                               salir = teclado.readLine();

                                                               System.out.println("\n");

                               }while(!salir.equals("s"));

                              

               

                }
}