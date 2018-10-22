package com.uco.parqueadero;

public class Parqueadero {
	private double tarifa;
	private double dineroCaja;
	private int cantidadParqueaderos;
	private Puesto[] puestos;
	
	public Parqueadero(double tarifa, double dineroCaja, int cantidadParqueaderos) {
		this.tarifa = tarifa;
		this.dineroCaja = dineroCaja;
		this.puestos = new Puesto[cantidadParqueaderos];
	}
	

	public int registrar(Carro carro) {
		int puestoAsignado = 0;
		if (cuposDisponibles()) {
			for (int i=0;i<cantidadParqueaderos;i++) {
				if (puestos[i].isDisponible()) {
					puestos[i].setDisponible(false);
					puestos[i].setOcupante(carro.getPlaca());
					carro.setPuesto(i+1);
					puestoAsignado = i+1;
				}
				}
			} 
		return puestoAsignado;
	}
	
	public boolean cuposDisponibles() {
		for (int i=0;i<cantidadParqueaderos;i++) {
			if (puestos[i].isDisponible()) return true;
		}
		return false;
	}
	
	public double retirarCarro(Carro carro) {
		int puestoAsignado = carro.getPuesto();
		
		return 0;
	}
	
	public int puestoOcupado(Carro carro) {
		int puestoOcupado = 0;
		for (int i=0; i<cantidadParqueaderos; i++)
		{
			if (puestos[i].getOcupante().equals(carro.getPlaca())){
				puestoOcupado = i+1;				
			}
		}
		return puestoOcupado;
	}	
}