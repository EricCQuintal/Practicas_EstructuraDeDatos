package EricQuintal;

import java.util.Scanner;

public class TetraedroTDA implements InterfaceFiguras {
  private double arista;
  private double calc1,calc2,calc3,calc4;
  private double calca2,calca4;
  private float calca1,calca3;
  private double altura;
  private double calcarea;
  
  @Override
  public void CalcularArea(double area) {
    System.out.println(".................................................................");
    System.out.println("PROGRAMA CALCULA EL AREA Y VOLUMEN TETRAEDRO");
    System.out.println(".................................................................");
    System.out.println("Calcular Area Tetraedro");
    
    Scanner sc=new Scanner(System.in);
        
    System.out.println("Ingrese el tamaño arista: ");
    arista=sc.nextInt();
    // TODO Auto-generated method stub
    calca1=(float) Math.pow(arista, 2);// El resultado es: 25
    //calca1=(arista*arista); 
    calca2=(arista/2);//El resultado es:5/2
    calca3=(float) Math.pow(calca2, 2);// El resultado es: 2.5^2=6.25
    //calc3=(calca2*calca2);
    calca4=calca1-calca3;//25-6.25
    altura=Math.sqrt(calca4);//4.33
    calcarea= ((arista*altura)/2)*4;
    System.out.println("El Area del tetraedro es: "+ calcarea+" "+ "U^2");
  }
  @Override
  public void CalcularVolumen(double volumen) {
    // TODO Auto-generated method stub
    System.out.println(".................................................................");
    System.out.println("Calcular Volumen Tetraedro");
    System.out.println(".................................................................");
    Scanner sc=new Scanner(System.in);
        
    System.out.println("Ingrese el tamaño arista: ");
    arista=sc.nextInt();
    calc1=Math.sqrt(2);
    calc2=Math.pow(arista, 3);
    calc3=calc1/12;
    calc4=calc2*calc3;
    System.out.println("El volumen Del tetraedro es: "+ calc4 +" "+ "U^3");
  }



  //public double VolumenTetraedro(double arista) {
  //Scanner sc=new Scanner(System.in);
        
  //System.out.println("Ingrese el numero de aristas: ");
   // arista=sc.nextInt();
   // calc1=Math.sqrt(2);
   // calc2=Math.pow(arista, 3);
    //calc3=calc1/12;
    //calc4=calc2*calc3;
    
   // return calc4;
    
  //}
  //public double AreaTetraedro(double arista){
   // calca1=(float) Math.pow(arista, 2);// El resultado es: 25
    //calca1=(arista*arista); 
    //calca2=(arista/2);//El resultado es:5/2
    //calca3=(float) Math.pow(calca2, 2);// El resultado es: 2.5^2=6.25
    //calc3=(calca2*calca2);
   // calca4=calca1-calca3;//25-6.25
   // altura=Math.sqrt(calca4);//4.33
    //calcarea= ((arista*altura)/2)*4;
    
    
    //return calcarea;
 // }
  //public void ImprimirVolumen() {
  //  System.out.println("El volumen Del tetraedro es: "+ calc4 +" "+ "U^3");
    
 // }
  //public void ImprimirArea() {
   // System.out.println("El Area del tetraedro es: "+ calcarea+" "+ "U^2");
  //}
  
  
  
}
