package examenfinal;

import javax.swing.JOptionPane;

public class CalificacionesAlumnos {
    public static void main(String args[]){
        
        //Pedir tamaño del Arreglo al usuario:
        int tamaño=Integer.parseInt(JOptionPane.showInputDialog
                  ("¿De que tamaño desea su Arreglo?"));
          
        //Crear y establecer tamaño de los Arreglos:
        String nombres[] = new String[tamaño];
        int calific[] = new int[tamaño];
          
        //Insertar nombres de alumnos al Arreglo String:
        for(int contador=0; contador < nombres.length; contador++)
              nombres[contador]=JOptionPane.showInputDialog
                      ("Nombre?");
          
        //Insertar calificaciones de cada alumno al Arreglo int:
        for(int contador=0; contador < calific.length; contador++)
              calific[contador]=Integer.parseInt
                      (JOptionPane.showInputDialog
                      ("Cual es la calificacione de "
                      +nombres[contador]+"?"));
          
        //Mostrar alumno y su calificacion en pantalla:
        System.out.println("Nombre\tCalificacion");
        for(int contador=0; contador < nombres.length; contador++)
              System.out.println(nombres[contador]+"\t"
                      +calific[contador]);
      }
    
}
