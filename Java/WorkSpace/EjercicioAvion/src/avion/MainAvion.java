package avion;

import java.util.ArrayList;

public class MainAvion {

	public static void main(String[] args) {
		
		Avion avion = new Avion();
		
		ArrayList<Pasajero> listaPasajeros = new ArrayList<Pasajero>();
		ArrayList<Maleta> listaMaleta = new ArrayList<Maleta>();
		ArrayList<Asientos> listaAsientos = new ArrayList<Asientos>();
		Pasajero p1 = new Pasajero ();
		p1.setNombre("Juann");
		p1.setDni(51135186);
		p1.setTelefono(915737695);
		Maleta m1 = new Maleta();
		m1.setPeso(20);
		m1.setTipoMaleta("pequeña");
		Pasajero p2 = new Pasajero();
		p2.setNombre("saul");
		p2.setDni(5611898);
		p2.setTelefono(911747473);
		Maleta m2 = new Maleta();
		m2.setTipoMaleta("grande");
		m2.setPeso(43);
		listaMaleta.add(m1);
		listaMaleta.add(m2);
		listaPasajeros.add(p1);
		listaPasajeros.add(p2);
		
		avion.setListaPasajeros(listaPasajeros);
		avion.setTipoAvion("Boeing 747");
		
		Asientos asiento1 = new Asientos ();
		asiento1.setTipoAsiento("Business");
		asiento1.setFila("11");
		asiento1.setPosicion("A");
		asiento1.setPasajero(p1);
		
		Asientos asiento2 = new Asientos ();
		asiento2.setTipoAsiento("Turista");
		asiento2.setFila("22");
		asiento2.setPosicion("B");
		asiento2.setPasajero(p2);
		
		listaAsientos.add(asiento1);
		listaAsientos.add(asiento2);
		
		avion.setListaAsientos(listaAsientos);
		
		System.out.println(avion);
	}

}
