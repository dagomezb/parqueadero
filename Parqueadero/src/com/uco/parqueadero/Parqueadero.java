package com.uco.parqueadero;

public class Parqueadero {
	private double tarifa;
	private double dineroCaja;
	private int cantidadParqueaderos;
	private Puesto[] puestos;
	private int horaActual;
	
	public Parqueadero(double tarifa, double dineroCaja, int cantidadParqueaderos) {
		this.tarifa = tarifa;
		this.dineroCaja = dineroCaja;
		this.cantidadParqueaderos = cantidadParqueaderos;
		puestos = new Puesto[cantidadParqueaderos];
		for( int i = 0; i < cantidadParqueaderos; i++ )
            puestos[ i ] = new Puesto();
		this.horaActual = 07;
	}
	

	public void registrar(Carro carro) {
		if (cuposDisponibles())
		{
			for (int i=0;i<cantidadParqueaderos;i++) 
			{ 
				if (puestos[i].isDisponible()) 
				{
					puestos[i].setOcupante(carro.getPlaca());
					carro.setPuesto(i+1);
					carro.setHoraEntrada(horaActual);
					puestos[i].setDisponible(false);
					break;
					
				}
			}
		} 
	}
	
	public boolean cuposDisponibles() {
		boolean hayCupo = false;
		for( int i = 0 ; i < this.cantidadParqueaderos ; i++ ) 
		{
			if (puestos[i].isDisponible()) 
			{
				hayCupo = true;
			}
		}
		return hayCupo;
	}
	
	public double retirarCarro(Carro carro) {
		int puestoAsignado = carro.getPuesto();
		puestos[puestoAsignado-1].setDisponible(true);
		puestos[puestoAsignado-1].setOcupante(null);
		int tiempoEnParqueadero = this.horaActual - (carro.getHoraEntrada() - 01);
		return (tiempoEnParqueadero * this.tarifa);
	}
	
	public void avanzarUnaHora() {
		this.horaActual = this.horaActual + 1;
	}

}