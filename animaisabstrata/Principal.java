package animaisabstrata;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo ("Trovão", "Masculino","Lobo Guará");
		lobo.caminhar();
		lobo.correr();
		lobo.dormir();
		lobo.emitirSom();
		
		Leao leao = new Leao ("Simba", "Masculino", "Leão-do-Congo");
		leao.caminhar();
		leao.correr();
		leao.dormir();
		leao.emitirSom();
		
		Tigre tigre = new Tigre ("Rajah", "Masculino", "Tigre-deBengala");
		tigre.caminhar();
		tigre.correr();
		tigre.dormir();
		tigre.emitirSom();
		
		Cachorro cachorro = new Cachorro ("Lolla", "Fêmea", "Pequinês");
		cachorro.caminhar();
		cachorro.correr();
		cachorro.dormir();
		cachorro.emitirSom();
		
		Gato gato = new Gato ("Felício", "Masculino", "Siamês");
		gato.caminhar();
		gato.correr();
		gato.dormir();
		gato.emitirSom();

	}

}
