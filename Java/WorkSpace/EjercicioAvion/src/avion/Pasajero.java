package avion;

import java.util.ArrayList;

public class Pasajero {


	private String nombre; 
	private int dni;
	private int telefono; 
	private ArrayList<Maleta> listaMaleta;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public ArrayList<Maleta> getListaMaleta() {
		return listaMaleta;
	}
	public void setListaMaleta(ArrayList<Maleta> listaMaleta) {
		this.listaMaleta = listaMaleta;
	}
	
	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", listaMaleta=" + listaMaleta
				+ "]";
	}
	
	
}
