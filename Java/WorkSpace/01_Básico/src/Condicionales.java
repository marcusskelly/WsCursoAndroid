
public class Condicionales {
	public static void main(String[] args) {
		boolean cierto = true;
        //ifs
        if(cierto == true){
            System.out.println("El valor es cierto");
	}
        
		cierto = false;
        if(cierto!= true){
        	System.out.println("El valor es falso");
        }
        if(cierto == false){
            System.out.println("el valor es falso");
        }
        if(!cierto){
            System.out.println("el valor es falso");
        }
        if(cierto){//esto es equivalente a cierto == true
            System.out.println("es cierto");
            System.out.println("y lo sabes");
        }
        if(!cierto){
            System.out.println("es falso");
        }
        cierto = false;
        if(!cierto){
            System.out.println("es falso");
            System.out.println("de hecho muy falso");
        }
        int numero1 = 1;
        int numero2 = 10;

        if(numero1 > 0 && numero2 < 20){//&& = AND
            System.out.println("el numero es mayor que 0 y menor que 20");
        }
        if(numero1 < 0 || numero2 < 20){//|| = OR
            System.out.println("numero1 es menor que 0 or numero2");
	
        }
        if(cierto){
            System.out.println("la variable es cierta");
        }else{
            System.out.println("la variable no es cierta");
        }
        int numero = 1;
        if(numero == 0){
            System.out.println("el numero vale 0");
        }else if(numero == 1){
            System.out.println("el numero vale 1");
        }else if(numero == 2){
            System.out.println("el numero vale 2");
        }else{
            System.out.println("el numero no vale ni 0,ni 1,ni 2");
        }
        
    }
	
        

}

	