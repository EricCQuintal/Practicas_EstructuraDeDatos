package EricQuintal;

import java.util.Scanner;

public class PrismaRectangular implements InterfaceFiguras{

double base,ancho,altura,areatotal,areabase,arealateral,volumen;


public void CalcularArea(double area) {
   
    System.out.println("CALCULAR AREA PRISMA RECTANGULAR");
    System.out.println(".................................................................");
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

public void CalcularVolumen(double volumen) {
   
    System.out.println("CALCULAR VOLUMEN PRISMA RECTANGULAR");
    System.out.println(".................................................................");
   

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
