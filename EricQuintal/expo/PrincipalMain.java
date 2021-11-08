package EricQuintal.expo;


public class PrincipalMain {
    
    public static void main(String[] args) {
        int []arreglo={3,2,8,6,1,4};
        EjercicioQuicksort ordenador=new EjercicioQuicksort();
        ordenador.OrdenarQuicksort(arreglo);

        for(int i=0; i<arreglo.length;i++)
        {
            System.out.println(arreglo[i]);  
        }


    }

    
}
