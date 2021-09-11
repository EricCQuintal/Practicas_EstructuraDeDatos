package EricQuintal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arista;
        System.out.println("Ingrese el numero de aristas: ");
        arista=sc.nextInt();
        TetraedroTDA aristar=new TetraedroTDA();
        aristar.VolumenTetraedro(arista);
        aristar.ImprimirVolumen();
        aristar.AreaTetraedro(arista);
        aristar.ImprimirArea();
        PrismaRectangular prisma=new PrismaRectangular();
        System.out.println(".................................................................");
        prisma.CalcularArea();
        System.out.println(".................................................................");
        prisma.CalcularVolumen();
    }

    
}
