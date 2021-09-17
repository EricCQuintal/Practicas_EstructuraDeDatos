package EricQuintal.practica1;
//se agrego libreria scanner 
import java.util.Scanner;

public class Cubo implements InterfaceFiguras {
    //Atrisbutos declarados
    private double base,ancho,altura,areatotal;

    @Override
    public void CalcularArea(double area) {
        // TODO Auto-generated method stub
        System.out.println("PROGRAMA QUE CALCULA AREA Y VOLUMEN DE CUBO");
        System.out.println(".................................................................");
        System.out.println("Calcular area de un cubo ");
        System.out.println("                                                                 "); 
        System.out.print("Ingresa el valor Base: ");
        Scanner b=new Scanner(System.in);
        base=b.nextDouble();
    
        System.out.print("Ingresa el valor Altura: ");
        Scanner al=new Scanner(System.in);
        altura=al.nextDouble();

        areatotal=((base*altura)*6);
        System.out.println("El area total del cubo es: "+areatotal+" "+"U^2");
    }

    @Override
    public void CalcularVolumen(double volumen) {
        // TODO Auto-generated method stub
        System.out.println("Calcular volumen de un cubo");
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
