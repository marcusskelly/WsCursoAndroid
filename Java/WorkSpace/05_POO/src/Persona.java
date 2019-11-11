//las clases en java son moldes para la creacion de objetos. Son planos en los que java se va a basar para la creacion de objetos
public class Persona {

	//Una clase java( en cualquier lenguaje) tiene atributos y tiene metodos
	//los atributos en java se suelen poner dentro de la clase y al principio de ella
	public String nombre;
	public double peso;
	public int edad;
	
	//este es el constructor por defecto
	//se llaman igual que la clase
	public Persona() {
		
	}
	//podemos tener muchos constructores
	public Persona(String nombre, double peso, int edad) {
		super();
		this.nombre = nombre;//this es una referencia al propio objeto
		this.peso = peso;
		this.edad = edad;
	}
	
	
}
