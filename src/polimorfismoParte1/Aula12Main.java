package polimorfismoParte1;

public class Aula12Main {

	public static void main(String[] args) {
		
		Mamifero mamifero = new Mamifero();
		Reptil reptil = new Reptil();
		Peixe peixe = new Peixe();
		Ave ave = new Ave();
		
		// OBSERVE QUE ESTAMOS UTILIZANDO OS MESMOS MÉTODOS, MAS AS SAÍDAS SÃO DIFERENTES POSSUI VÁRIAS FORMAS
		// ISSO É O POLIMORFISMO DE SOBREPOSIÇÃO!
		
		mamifero.locomover();
		mamifero.alimentar();
		mamifero.emitirSom();
		
		
		reptil.locomover();
		reptil.alimentar();
		reptil.emitirSom();
		
		
		peixe.locomover();
		peixe.alimentar();
		peixe.emitirSom();
		
		ave.locomover();
		ave.alimentar();
		ave.emitirSom();  
		
		Tartaruga tartaruga = new Tartaruga();
		Canguru canguru = new Canguru();
		Cachorro cachorro = new Cachorro();
		Cobra cobra = new Cobra();
		//GoldFish goldFish = new GoldFish();
		//Arara arara = new Arara();
		

		canguru.setPeso(67.8);
		canguru.setCorPelo("Amarelo");
		canguru.setMembros(4);
		canguru.setIdade(12);
		canguru.status();
		canguru.locomover();
		canguru.usarBolsa();
		
		
		tartaruga.locomover();
		cachorro.emitirSom();
		
		cobra.setEspecieCobra("Cascavel");
		cobra.emitirSom();
		
	
	}

}
