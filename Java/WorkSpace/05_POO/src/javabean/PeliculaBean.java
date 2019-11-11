package javabean;

public class PeliculaBean {

	private String titulo;
	private String genero;
	private String director;
	
	public PeliculaBean(String titulo, String genero, String director) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		
	}
	public String toString() {
		return "PeliculaBean [titulo=" + titulo + ", genero=" + genero + ", director =" + director + "]";
		
	}
				
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero(String genero) {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
}

