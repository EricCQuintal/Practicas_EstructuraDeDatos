package EricQuintal.Practica4;
import java.io.*;


import javax.swing.JOptionPane;

public class PrincipalMain {
    public static void main(String[] args) {
        Pilas pilaprueba;
        int element;
        int opcion;
        int elementos;
        
        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" CREAR PILA PROGRAMA ");
        System.out.println(" TECLEA LOS ELEMENTOS DE LA PILA TERMINA OPERACION CON -1  ");
        try {
            pilaprueba=new Pilas();
            do {
               
                elementos=Integer.parseInt(JOptionPane.showInputDialog("Dijite los elementos de la pila"));
                pilaprueba.InsertarElemento(elementos);
                
            } while (elementos!=-1);

            do{
                System.out.println(

                "\n--------------------------------------\n"+
                "                  menu                   \n "+
                "\n1.- Insertar\n"+
                "2.- Quitar\n"+
                "3.- Checar si pila esta vacia\n"+
                "4.- checar si pila esta llena\n"+
                "5.- Limpiar pila\n"+
                "6.- Checar cima \n"+
                "7.- checar tamaño de la pila\n"+
                "8.- Mostrar pila\n"+
                "9.- Salir\n"+
                "Elige una opcion:\n"+
                "\n--------------------------------------\n"


                
                );
                opcion=Integer.parseInt(JOptionPane.showInputDialog(
                "\n--------------------------------------\n"+
                "\n                  menu                \n"+
                "\n1.- Insertar\n"+
                "2.- Quitar\n"+
                "3.- Checar si pila esta vacia\n"+
                "4.- checar si pila esta llena\n"+
                "5.- Limpiar pila\n"+
                "6.- Checar cima \n"+
                "7.- checar tamaño de la pila\n"+
                "8.- Mostrar pila\n"+
                "9.- Salir\n"+
                "Elige una opcion:\n"+
                "\n--------------------------------------\n"
                +"\nElige una opcion a ejecutar\n"
));
                switch (opcion) {
                    case 1:
                    System.out.println("INGRESA UN ELEMENTO A LA PILA");
                    elementos=Integer.parseInt(JOptionPane.showInputDialog("Dijite los elementos de la pila"));
                    pilaprueba.InsertarElemento(elementos);  
                        break;
                        case 2:
                        if (!pilaprueba.PilaVacia()) {
                           System.out.println("se quito el elemento pila");
                           pilaprueba.Quitar(elementos); 
                        }
                        case 3:
                        if (pilaprueba.PilaVacia()) {
                           System.out.println("La pila esta vacia "); 
                        }else{
                            System.out.println("La pila tiene datos "); 
                        }
                        break;
                        case 4:
                        if (pilaprueba.PilaLlena()) {
                           System.out.println("La pila esta llena "); 
                        }else{
                            System.out.println("La pila no tiene datos "); 
                        }
                        break;
                        case 5:
                        if(pilaprueba.PilaLlena()){
                         pilaprueba.LimpiarPila(elementos);
                        }
                       
                        
                        break;
                        case 6:
                        if (pilaprueba.PilaLlena()) {
                           
                            pilaprueba.ChecarCimapila();
                            
                        }
                        break;
                        case 7:
                        pilaprueba.TamanioPila();
                        
                        break;
                        case 8:
                        pilaprueba.MostrarPila();
                            
                            break;
                    
                    default:
                        break;
                }
            }while(opcion!=9);
            
        } catch (Exception e) {
            //TODO: handle exception
        }

      
       
        
    }
    

    
}
