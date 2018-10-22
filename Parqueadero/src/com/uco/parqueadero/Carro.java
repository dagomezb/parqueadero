package com.uco.parqueadero;

public class Carro {
	private String placa;
	private int horaEntrada;
	private int puesto;
	
	public Carro(String placa, int horaEntrada) {
		this.puesto = 0;
		this.placa = placa;
		this.horaEntrada = horaEntrada;
	}
	
	public String getPlaca() {
		return placa;
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
		return puesto;
	}

	public void setPuesto(int puesto) {
		this.puesto = puesto;
	}
	
	
}
