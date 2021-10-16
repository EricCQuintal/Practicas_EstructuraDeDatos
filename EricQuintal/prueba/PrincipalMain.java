package EricQuintal.prueba;


//se importo las librerias JOptionPane para visusalizar 
import javax.swing.JOptionPane;

//la calse principal main 
public class PrincipalMain {
    public static void main(String[] args) {
        //se crearon variables a usar 
        Pilas pilaprueba;//esta variable corresponde ala clase pilas 
        int opcion;//se creo la variable opcion para ser instanciada y usada en 
                   //estructura switch
        int elementos;//los elementos de la pila
        
        
        try {
            pilaprueba=new Pilas();
            do {
//en este caso la variable elemento realiza la funcion de obtner el valor dado 
//por el usuario y este es agregado ala pila que hemos creado con un tamaño 
//prevsto por nosostros              
elementos=Integer.parseInt(JOptionPane.showInputDialog("\nCREAR PILA PROGRAMA\nTECLEA LOS ELEMENTOS DE LA PILA TERMINA OPERACION CON -1\nDijite los elementos de la pila"));
pilaprueba.InsertarElemento(elementos);
              //en este caso el while se encarga de finalizar el do si este 
              //es diferente mientras sea  -1   
            } while (elementos!=-1);

            do{
                //por medio de JOption pane podemos enviar un mensaje el cual 
                //no proporcionara un mensaje por pantalla solicitando al usuario
                //la opcion a reaalizar opcion es la variable ala que se le es 
                //asignada esa accion       
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
                "8.- Mostrar Invertido\n"+
                "9.- Mostrar pila\n"+
                "10.- Elementos sin Repertir\n"+
                "11.- Salir\n"+
                "Elige una opcion:\n"+
                "\n--------------------------------------\n"
                +"\nElige una opcion a ejecutar\n"
));
//este switch es el encargado de realizar las operaciones de cada funcion
//que es mostrada por medio de pantalla
                switch (opcion) {
                    case 1:
                    System.out.println(".........................................");
                    System.out.println("INGRESA UN ELEMENTO A LA PILA");
                    elementos=Integer.parseInt(JOptionPane.showInputDialog("Dijite los elementos de la pila"));
                    pilaprueba.InsertarElemento(elementos);  
                        break;
                        case 2:
                        System.out.println(".........................................");
                        if (!pilaprueba.PilaVacia()) {
                           System.out.println("SE HA ELIMIDADO EL ELEMENTO DE LA PILA");
                           pilaprueba.Quitar(elementos); 
                        }
                        case 3:
                        System.out.println(".........................................");
                        if (pilaprueba.PilaVacia()) {
                           System.out.println("La pila esta vacia "); 
                        }else{
                            System.out.println("La pila tiene datos "); 
                        }
                        break;
                        case 4:
                        System.out.println(".........................................");
                        if (pilaprueba.PilaLlena()) {
                           System.out.println("La pila esta llena "); 
                        }else{
                            System.out.println("La pila no tiene datos "); 
                        }
                        break;
                        case 5:
                        System.out.println(".........................................");
                        if(pilaprueba.PilaLlena()){
                         pilaprueba.LimpiarPila();
                        }
                       
                        
                        break;
                        case 6:
                        System.out.println(".........................................");
                        if (pilaprueba.PilaLlena()) {
                           
                            pilaprueba.ChecarCimapila();
                            
                        }
                        break;
                        case 7:
                        System.out.println(".........................................");
                        pilaprueba.TamanPila();
                        
                        break;
                        case 8:
                        System.out.println(".........................................");
                        System.out.println("LOS ELEMENTOS INVERTIDOS DE LA PILA SON: ");
                        pilaprueba.MostrarPilaInvertido();;
                            
                            break;
                            case 9:
                        System.out.println(".........................................");
                        System.out.println("LOS ELEMENTOS DE LA PILA SON ");
                        pilaprueba.MostrarPila();
                            
                            break;
                            
                            case 10:
                        System.out.println(".........................................");
                        pilaprueba.EliminarRepetidos();
                            
                            break;
                    
                    default:
                        break;
                }
                //finaliza con la opcion 11
            }while(opcion!=11);
            
        } catch (Exception e) {
            //TODO: handle exception
        }  
    }   
}
