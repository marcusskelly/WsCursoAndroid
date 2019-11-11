package javabean;

public class MainPeliculaBean {

	public static void main(String[] args) {
		PeliculaBean p1 = new PeliculaBean("doctor sueño", "horror", "martin");
		imprimirPeliculaBean(p1);

	}
	public static void imprimirPeliculaBean(PeliculaBean p1) {
		System.out.println("titulo: " + p1.getTitulo());
		System.out.println("genero " + p1.getGenero(""));
		System.out.println("director " + p1.getDirector());
		
	}
}
