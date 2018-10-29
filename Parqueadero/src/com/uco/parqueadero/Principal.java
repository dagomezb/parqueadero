package com.uco.parqueadero;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParqueaderoCarro AeroPark = new ParqueaderoCarro(3500, 0, 40);
		ParqueaderoMoto AeroMotoPark = new ParqueaderoMoto(1750, 0, 80);
		
		Carro carro2 = new Carro("MRC351");
		Moto moto1 = new Moto("UCO61E");
		
		AeroPark.registrar(carro2);
		AeroMotoPark.registrar(moto1);
				
				
		System.out.println(carro2.getPuesto());
		System.out.println(moto1.getPuesto());
		
		System.out.println(AeroPark.retirarCarro(carro2));
		
		System.out.println(AeroMotoPark.retirarCarro(moto1));
	}
}
