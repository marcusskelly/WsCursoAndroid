package avion;

import java.util.ArrayList;

public class Avion {

	private ArrayList <Pasajero> listaPasajeros;
	private String tipoAvion;
	private ArrayList <Asientos> listaAsientos;
	
	public ArrayList<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}
	public void setListaPasajeros(ArrayList<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}
	public String getTipoAvion() {
		return tipoAvion;
	}
	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}
	public ArrayList<Asientos> getListaAsientos() {
		return listaAsientos;
	}
	public void setListaAsientos(ArrayList<Asientos> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}
	
	public int contarPasajeros() {
		return listaPasajeros.size();
	}
	@Override
	public String toString() {
		return "Avion [listaPasajeros=" + listaPasajeros + ", tipoAvion=" + tipoAvion + ", listaAsientos="
				+ listaAsientos + "]";
	}
	
	
}
