package EricQuintal.Practica_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstNoLinArbol{

public static void main(String[] args) throws Exception
{ 
int opc=0, elemento;
String nom;

BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
Paso2_OpArbol arbol = new Paso2_OpArbol();

    do
    { 
        try
        { 
            System.out.println(
                    "\n--------------------------------------\n"+
                    "\n            MENU ARBOLES              \n"+
                    "\n--------------------------------------\n"+
                            
                            "  1.Insertar Nodo \n" +
                            "  RECORRIDOS \n" +
                            "  2.PreOrden \n" +  
                            "  3.InOrden \n" +
                            "  4.PostOrden \n" +
                            "  5.BUSCAR nodo \n" +
                            "  6.ELIMINAR Nodo\n" +
                            "  7.SALIR \n" +
                            "Elige una opción: \n" +
                    "\n---------------------------------------\n");

opc = Integer.parseInt(entrada.readLine());
switch (opc)
{ 

    case 1:

        System.out.println("Ingresa el número del nodo: ");
        elemento = Integer.parseInt(entrada.readLine());
        System.out.println("Ingresa la info del nodo:");
        nom = entrada.readLine();
        arbol.InsertarNodo(elemento, nom);
        break;
    case 2:

        if(!arbol.Arbolvacio())
        { 
            System.out.println("Recorrido Preorden");
            arbol.PreOrden(arbol.raiz);
        }
        else
        { 

            System.out.println("El árbol está vacio");
        }
        break;

    case 3:
            if(!arbol.Arbolvacio())
        { 
            System.out.println("Recorrido Inorden");
            arbol.InOrden(arbol.raiz);
        }
        else
        { 
            System.out.println("El árbol está vacio");
        }
        break;
    case 4:
            if(!arbol.Arbolvacio())
        { 
            System.out.println("Recorrido PostOrden");
            arbol.PostOrden(arbol.raiz);
        }
        else
        { 
            System.out.println("El árbol está vacio");
        }
        break;
    case 5:
            if(arbol.Arbolvacio())
        { 
            System.out .println("Buscando Nodo. . .");
            System.out .println("Ingresa el núnero del nodo a buscar: ");
            elemento = Integer.parseInt(entrada.readLine());

            if(arbol.BuscarNodo(elemento)==null)
                System.out.println("Ese nodo no existe en el árbol");
        else
                System.out.println("Nodo existente con valor: " + arbol);
    }
    else
   { 
            System.out.println("El árbol está vacio");
   }
   break;

    case 6:
        if(!arbol.Arbolvacio())
        { 
            System.out .println("Eliminando Modo. ..");
            System.out.println("Ingresa el núnero del nodo a eliminar: ");
            elemento = Integer.parseInt(entrada.readLine());

            if(arbol.EliminarNodo(elemento)==false)
            System.out.println("Ese nodo no existe en el árbol");
    else
            System.out.println("nodo eliminado con éxito");
 }
 else
 { 
    System.out.println("El árbol está vacio");
 }
break;

    case 7:
            System.out.println("FIN");
    break;
    default:
    break;
   }
}

            catch (NumberFormatException n)
{ 
            throw new Exception("Error" + n.getMessage());
}
            
        }while(opc!=7);
    }
}
    

