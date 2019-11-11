import java.util.ArrayList;
import java.util.Scanner;

public class MainPelicula {

	public static void main(String[] args) {
		ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1- Alta pelicula");
		System.out.println("0- Salir de programa");
		
		int opcion = 0;
		opcion = sc.nextInt();
			if(opcion == 1) {
				System.out.println("Introduzca el titulo");
				String titulo = sc.nextLine();
				System.out.println("Introduzca el genero");
				String genero = sc.nextLine();
				System.out.println("Introduzca el director");
				String director = sc.nextLine();
				System.out.println("Introduzca la puntuacion");
				boolean isRated = sc.hasNext();
				Pelicula pelicula = new Pelicula(titulo,genero,director);
				listaPeliculas.add(pelicula);
			
		} while(opcion > 0);
			
		for(Pelicula pelicula : listaPeliculas) {
			mostrarPeliculas(pelicula);
		}
			
			
		}
		public static void mostrarPeliculas(Pelicula pelicula) {
			System.out.println("titulo: " + pelicula.titulo);
			System.out.println("genero: " + pelicula.genero);
			System.out.println("director: " + pelicula.director);
			
	}

}
