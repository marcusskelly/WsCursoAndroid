package Casa;

public class MainCasa {

	public static void main(String[] args) {
		
		PersonaCasa p1 = new PersonaCasa("juanito","Calle saliente");
		imprimirPersona(p1);
		HabitacionCasa c1 = new HabitacionCasa("baño","5m2","si","luminosa","espaciosa");
		imprimirHabitacion(c1);
		
	}

	public static void imprimirPersona(PersonaCasa personaCasa) {
	System.out.println("nombre: " + personaCasa.nombre);
	System.out.println("direccion: " + personaCasa.direccion);
	}
	public static void imprimirHabitacion(HabitacionCasa habitacionCasa) {
		System.out.println("tipo: " + habitacionCasa.tipo);
		System.out.println("tamaño: " + habitacionCasa.tamaño);
		System.out.println("muebles: " + habitacionCasa.muebles);
		System.out.println("luminosa:" + habitacionCasa.luminosidad);
		System.out.println("espaciosa: " + habitacionCasa.espaciosa);
		
		
	}
}
