package com.uco.parqueadero;

public class Carro {
	private String placa;
	private int horaEntrada;
	private int puesto;
	
	public Carro(String placa) {
		
		this.placa = placa;
		this.horaEntrada = 0;
		this.puesto = 0;
		
	}
	
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getPuesto() {
		return this.puesto;
	}

	public void setPuesto(int puesto) {
		this.puesto = puesto;
	}
	
	
}
