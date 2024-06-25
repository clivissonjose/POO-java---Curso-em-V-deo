package polimorfismoParte1;

public class Tartaruga extends Reptil{
	
	@Override
	public void status() {
		System.out.println("========== Dados do tartaruga ==========");
		System.out.println("Peso: " + getPeso() + "\nQuantidade de membros: " + getMembros()
		+ "\nIdade: " + getIdade());
	}

	@Override
	public void locomover() {
		//super.locomover();
		System.out.println("Andando bem devagar - Tartaruga");
	}
	
	

}
