package examenfinal;

import java.util.Scanner;

public class Notas_Alumnos {

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] nombre = new String[10];
		int[] notaAlumno1 = new int[10];
		int[] notaALumno2 = new int[10];
		
		int[] edad = new int[10];
		int[] cedula = new int[10];
		String[] sexo = new String[10];
		int x=0,y,z,resp1;
		String resp2;
		do{
			do{
		System.out.println("Registro de Alumno");
		System.out.println("Seleccione una opción:");
		System.out.println("1 - Registro");
		System.out.println("2 - Consultar");
		System.out.println("3 - Modificar");
		resp1 = s.nextInt();
			}while(resp1<1||resp1>3);
		
		if(resp1==1){
			if(x==10){
				System.out.println("Máximo de alumnos registrados");
			}
			do{
			System.out.print("Ingrese el nombre del alumno "+(x+1)+": ");
			nombre[x] = s.next();
			System.out.print("Ingrese la cedula del alumno "+(x+1)+": ");
			cedula[x] = s.nextInt();
			System.out.print("Ingrese la edad del alumno "+(x+1)+": ");
			edad[x] = s.nextInt();
			System.out.print("Ingrese sexo del alumno "+(x+1)+": ");
			sexo[x] = s.next();
			System.out.print("Ingrese la nota 1 del alumno "+(x+1)+": ");
			notaAlumno1[x] = s.nextInt();
			System.out.print("Ingrese la nota 2 del alumno "+(x+1)+": ");
			notaALumno2[x] = s.nextInt();
			System.out.print("Ingrese la nota 3 del alumno "+(x+1)+": ");
			
			x++;
			do{
			System.out.println("¿Desea registrar otro alumno?");
			System.out.println("1 - si");
			System.out.println("2 - no");
			}while(resp1<1||resp1>2);
			resp1 = s.nextInt();
			}while(resp1==1);
		}
		
		if(resp1==3){
			if(x<=0){
				System.out.println("No existen alumnos registrados");
			}
			do{
			System.out.println("Ingrese nombre del alumno que desea consultar: ");
			resp1 = s.nextInt();
			for(int i=0;i<10;i++){
				if(resp1==cedula[i]){
					System.out.println("Nombre del alumno: "+nombre[(i+1)]);
					System.out.println("Edad del alumno: "+edad[(i+1)]);
					System.out.println("Sexo del alumno: "+sexo[(i+1)]);
					System.out.println("Nota 1 del alumno: "+notaAlumno1[(i+1)]);
					System.out.println("Nota 2 del alumno: "+notaALumno2[(i+1)]);
					
				}
			}
				do{
					System.out.println("¿Desea consultar otro alumno?");
					System.out.println("1 - si");
					System.out.println("2 - no");
					resp1 = s.nextInt();
					}while(resp1<1||resp1>2);
					}while(resp1==1);
		}
		
		
		do{
		System.out.println("¿Desea realizar alguna otra operación?");
		System.out.println("1 - si");
		System.out.println("2 - no");
		resp1 = s.nextInt();
		}while(resp1<1||resp1>2);
		}while(resp1==1);
	}
    
}
