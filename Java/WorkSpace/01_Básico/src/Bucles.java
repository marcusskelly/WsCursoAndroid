
public class Bucles {
	private static int numero;

	public static void main(String[] args) {
	setNumero(1);
	for(int i=0;i<=10;i++){
       System.out.println("el numero es:" + i);
		}
	int contador = 0;
    while(contador <= 10){//de 0 a N veces
        System.out.println("el contador vale: " + contador);
        contador++;
    	}
	}

	public static int getNumero() {
		return numero;
	}

	public static void setNumero(int numero) {
		Bucles.numero = numero;
	}
}
