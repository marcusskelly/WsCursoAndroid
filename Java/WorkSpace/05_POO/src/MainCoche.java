//pedir 3 coches al usuario,meterlos en array y luego recorrer el array
import java.util.ArrayList;
import java.util.Scanner;

public class MainCoche {

	public static void main(String[] args) {
		ArrayList<Coche> listaCoches = new ArrayList<Coche>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1;i<4;i++) {		
			System.out.println("introduce marca");
			String marca = sc.nextLine();
			System.out.println("introduce modelo");
			String modelo = sc.nextLine();
			System.out.println("introduce matricula");
			String matricula = sc.nextLine();
			System.out.println("inserte estado");
			String estado = sc.nextLine();
			Coche coche = new Coche(matricula,marca,modelo,estado);
			listaCoches.add(coche);
		}
		
		for(Coche coche : listaCoches) {
			mostrarCoche(coche);
		}
			
			
			
	}

	public static void mostrarCoche(Coche coche) {
		System.out.println("matricula: " + coche.matricula);
		System.out.println("marca: " + coche.marca);
		System.out.println("modelo: " + coche.modelo);
		System.out.println("es nuevo: " + coche.isNew);
	}
	
}
