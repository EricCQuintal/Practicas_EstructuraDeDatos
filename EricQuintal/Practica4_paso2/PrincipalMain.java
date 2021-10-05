package EricQuintal.Practica4_paso2;



import javax.swing.JOptionPane;



public class PrincipalMain {
    public static void main(String[] args) {
        /*Paso2_PilaDinamica pila=new Paso2_PilaDinamica();
        int x;
        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("dijite numero de elementos: ");*/
         
        //se crearon variables a usar 
         Paso2_PilaDinamica pilaprueba;//esta variable corresponde ala clase pilas 
         int opcion;//se creo la variable opcion para ser instanciada y usada en 
                    //estructura switch
         int elementos;//los elementos de la pila
         try {
            pilaprueba=new Paso2_PilaDinamica();
            do {
               
                elementos=Integer.parseInt(JOptionPane.showInputDialog("\nCREAR PILA PROGRAMA\nTECLEA LOS ELEMENTOS DE LA PILA TERMINA OPERACION CON -1\nDijite los elementos de la pila"));
                pilaprueba.Push(elementos);
                
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
                    pilaprueba.Push(elementos); 
                        break;
                        case 2:
                        if (!pilaprueba.PilaVacia()) {
                           System.out.println("SE HA ELIMIDADO EL ELEMENTO DE LA PILA");
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
                       
                        
                        break;
                        case 5:
                        
                       
                        
                        break;
                        case 6:
                        
                        break;
                        case 7:
                        
                        
                        break;
                        case 8:
                       
                            
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
