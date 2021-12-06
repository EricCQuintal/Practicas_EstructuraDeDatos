package Practica_9;

public class PrincipalMainHash {
    public static void main(String args[]){
        // Se inicializa un nuevo objeto
		BusquedaHash tablahash= new BusquedaHash(10);// Se asigna el modulo a usar y el tamaño del
        // Array

		String[] elementos=	{"20", "33", "21", "10", "13", "14", "56", "100", "44", "66"};
        // Se mandan a llamar los metdos creados con sus parametris correspondientes
		tablahash.OperacionHash(elementos, tablahash.array);
		tablahash.MostrarTabla();
		// Se busca el valor a encontrar
		String n="56";
		String buscado = tablahash.Buscar(n, elementos);
	
			
		}
			
    
}
