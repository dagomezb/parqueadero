package com.uco.parqueadero;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parqueadero AeroPark = new Parqueadero(3500, 0, 40);
		
		Carro carro2 = new Carro("MRC351");
		
		AeroPark.registrar(carro2);
		
		Carro carro3 = new Carro("MRC352");
		
		AeroPark.registrar(carro3);
		
				
		System.out.println(carro2.getPuesto());
		System.out.println(carro3.getPuesto());
		
		System.out.println(AeroPark.retirarCarro(carro2));
		AeroPark.avanzarUnaHora();
		System.out.println(AeroPark.retirarCarro(carro3));
	}
}
