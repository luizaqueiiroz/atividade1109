package reinoanimal;

public class Principal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo();
		lobo.caminhar();
		lobo.correr();
		lobo.dormir();
		lobo.emitirSom();
		
		
		Cachorro cachorro = new Cachorro();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.dormir();
		cachorro.emitirSom();
	}

}
