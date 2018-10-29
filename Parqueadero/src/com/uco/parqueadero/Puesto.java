package com.uco.parqueadero;

public class Puesto {
	private boolean disponible;
	private String ocupante;

	public Puesto() {
		this.disponible = true;
		this.ocupante = null;
	}
	
	public boolean isDisponible() {
		return this.disponible;
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
