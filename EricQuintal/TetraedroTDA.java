package EricQuintal;

public class TetraedroTDA {
  double arista;
  double calc1,calc2,calc3,calc4;
  double calca2,calca4;
  float calca1,calca3;
  double altura;
  double calcarea;



  public double VolumenTetraedro(int arista) {
    calc1=Math.sqrt(2);
    calc2=Math.pow(arista, 3);
    calc3=calc1/12;
    calc4=calc2*calc3;
    
    return calc4;
    
  }
  public double AreaTetraedro(double arista){
    calca1=(float) Math.pow(arista, 2);// El resultado es: 25
    //calca1=(arista*arista); 
    calca2=(arista/2);//El resultado es:5/2
    calca3=(float) Math.pow(calca2, 2);// El resultado es: 2.5^2=6.25
    //calc3=(calca2*calca2);
    calca4=calca1-calca3;//25-6.25
    altura=Math.sqrt(calca4);//4.33
    calcarea= ((arista*altura)/2)*4;
    
    
    return calcarea;
  }
  public void ImprimirVolumen() {
    System.out.println("El volumen Del tetraedro es: "+ calc4 +" "+ "U^3");
    
  }
  public void ImprimirArea() {
    System.out.println("El Area del tetraedro es: "+ calcarea+" "+ "U^2");
  }
  
  
  
}
