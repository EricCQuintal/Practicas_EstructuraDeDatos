package EricQuintal;


//Esta es la clase principal 
public class Main {
    //se agregan dos atributos de forma estatica 
    private static double area;
    private static double volumen;
    //se proporciona el void main para la ejecucion del programa
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
    
        //System.out.println("Ingrese el numero de aristas: ");
       // arista=sc.nextInt();
     //se crea una nueva instancia de obejto llamada tetraedro la figura a calcular
     //llamado aristar 
        TetraedroTDA aristar=new TetraedroTDA();
        //metodos 
        aristar.CalcularArea(area);
        aristar.CalcularVolumen(volumen);
        //se crea nueva instancia de obejto llamada prisma de la clase prisma 
        //rectangular
        PrismaRectangular prisma=new PrismaRectangular();
        //metods asignados 
        System.out.println(".................................................................");
        prisma.CalcularArea(area);
        System.out.println(".................................................................");
        prisma.CalcularVolumen(volumen);
        System.out.println(".................................................................");
        Cubo cubo1=new Cubo();
        cubo1.CalcularArea(area);
        System.out.println(".................................................................");
        cubo1.CalcularVolumen(volumen);

    }
    

    
}
