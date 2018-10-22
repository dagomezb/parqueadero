package com.uco.parqueadero;

public class Puesto {
	private boolean disponible;
	private String ocupante;

	public Puesto() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getOcupante() {
		return ocupante;
	}

	public void setOcupante(String ocupante) {
		this.ocupante = ocupante;
	}
	
	
}
