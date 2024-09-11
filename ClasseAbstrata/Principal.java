package ClasseAbstrata;

public class Principal {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro("00000", "F1", "Vermelho",2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		Carro fusca = new Carro ("22222","VW", "Rosa", 2020);
		fusca.ligar();
		fusca.acelerar();
		fusca.virar();
		fusca.frear();
		
		System.out.println("---------------------------------");
		
		Onibus marcopolo = new Onibus("11111", "XB1", "Prata,",2020);
		marcopolo.acelerar();
		marcopolo.ligar();
		marcopolo.virar();
		marcopolo.frear();
		
		System.out.println("----------------------------------");
		Moto BIZ = new Moto("4444", "125", "Preta", 2025);
		BIZ.acelerar();
		BIZ.ligar();
		BIZ.virar();
		BIZ.frear();

	}

}
