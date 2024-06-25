package polimorfismoParte1;

public class Cachorro extends Mamifero {
	
	@Override
	public void status() {
		System.out.println("========== Dados do cachorro ==========");
		System.out.println("Peso: " + getPeso() + "\nQuantidade de membros: " + getMembros()
		+ "\nIdade: " + getIdade());
	}
	
	@Override
	public void emitirSom() {
		System.out.println("AUAUAUAUAU!");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando o rabo! - Cachorro");
	}
	
	public void enterrarOsso() {
		System.out.println("Enterrando o osso!");
	}

}
