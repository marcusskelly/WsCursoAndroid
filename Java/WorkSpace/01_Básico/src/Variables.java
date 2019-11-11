
public class Variables {

	public static void main(String[] args) {
		//En java tenemos dos tipos de variables
		//Tenemos variables primitivas y variables de referencias
		//las siguientes serían variables primitivas
		//int, long, double, boolean
		int numero = 0;//variable numerica 
		System.out.println("el numero es:" + numero);
		numero = 5;
		System.out.println(numero);
		int numero2 = 78;
		System.out.println(numero2);
		
		//Otros tipos
		long numeroLargo = 676;
		int x = 5;
		double numeroReal = 34.567;//para numeros decimales
		boolean cierto = true;//solo guarda true or false
		cierto = false;
		System.out.println(numeroLargo);
		System.out.println(numeroReal);
		
		//el otro tipo son las variables de referencia o directamente referencias 
		String nombre = "pepe";
		System.out.println("el nombre es:" + nombre);//el + se encarga de concatenar
		nombre = "laura"; //asignacion de la variable
		System.out.println("el nombre es:" + nombre);
		int numero3;// esto se puede hacer,pero es mejor declarar el valor straightaway
		numero3 = 98;
		System.out.println(numero3);
		
		double numero4 = 10;
		double numero5 = numero4;
		
		int numero6 = 56;
		double numero7 = numero6;
		
		double numero8 = 56;
		int numero9 = (int)numero8;//intenta meter int en double
		

	}

}
