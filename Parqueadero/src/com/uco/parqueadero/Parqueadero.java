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
		if (cuposDisponibles()>0)
		{ 
		  int puestoDisponible = cuposDisponibles();	 
		  puestos[puestoDisponible-1].setOcupante(carro.getPlaca());
          carro.setPuesto(puestoDisponible);
		  carro.setHoraEntrada(horaActual);
		  puestos[puestoDisponible-1].setDisponible(false);
		}		 
	}
	
	public int cuposDisponibles() {
		int puestoDisponible = 0;
		for( int i = 0 ; i < this.cantidadParqueaderos ; i++ ) 
		{
			if (puestos[i].isDisponible()) 
			{
				puestoDisponible = i+1;
				break;
			}
		}
		return puestoDisponible;
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