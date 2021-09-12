package EricQuintal;



public class Main {

    private static double area;
    private static double volumen;

    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
    
        //System.out.println("Ingrese el numero de aristas: ");
       // arista=sc.nextInt();
       
        TetraedroTDA aristar=new TetraedroTDA();
        aristar.CalcularArea(area);
        aristar.CalcularVolumen(volumen);
        PrismaRectangular prisma=new PrismaRectangular();
        System.out.println(".................................................................");
        prisma.CalcularArea(area);
        System.out.println(".................................................................");
        prisma.CalcularVolumen(volumen);
    }

    
}
