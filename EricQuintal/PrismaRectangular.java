package EricQuintal;
//se importa la libreia scanner para poder obtener los datos por medio del 
//teclado 
import java.util.Scanner;
//se asigna la clase a trabajar esto incluye la implementacion de la interfaz 
//esta llamada InterfaceFiguras se implementa con el api java implements
//al implementar esta interfas pedira los metodos asignados en la interfaz
public class PrismaRectangular implements InterfaceFiguras{
//se asignan las varibles o atributos de la clase que es el prisma rectangular 
private double base,ancho,altura,areatotal,areabase,arealateral;

//metodos 
//Este es el metodo asignado por la interfaz esta se encarga de calcular y hacer 
//las operaciones para saber que cantidad tiene el area
public void CalcularArea(double area) {
   
    System.out.println("PROGRAMA QUE CALCULA AREA Y VOLUMEN DE PRISMA RECTANGULAR");
    System.out.println(".................................................................");
    System.out.println("Calcular area prisma rectangular");
    System.out.print("Ingresa el valor Base: ");
    Scanner b=new Scanner(System.in);
    base=b.nextDouble();

    System.out.print("Ingresa el valor Ancho: ");
    Scanner a=new Scanner(System.in);
    ancho=a.nextDouble();

    System.out.print("Ingresa el valor Altura: ");
    Scanner al=new Scanner(System.in);
    altura=al.nextDouble();

    areabase=(base*ancho)*2;
    arealateral=(altura*ancho)*4;
    areatotal=areabase+arealateral;

    System.out.println("El area total del PRISMA rectangular es: "+areatotal+" "+"U^2");
   
}
//metodo
//Este segundo metodo es el encargado de realizar la operacion y calculo 
//del volumen de la figura geometrica
public void CalcularVolumen(double volumen) {
   
    System.out.println("Calcular volumen prisma rectangular");
    System.out.print("Ingresa el valor Base: ");
    Scanner b=new Scanner(System.in);
    base=b.nextDouble();

    System.out.print("Ingresa el valor Ancho: ");
    Scanner a=new Scanner(System.in);
    ancho=a.nextDouble();

    System.out.print("Ingresa el valor Altura: ");
    Scanner al=new Scanner(System.in);
    altura=al.nextDouble();

    volumen=base*altura*ancho;
    System.out.println("El volumen del prisma rectangular es:  "+ volumen+" "+"U^3");

}

}
