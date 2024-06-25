package polimorfismoParte1;

public class Canguru extends Mamifero {

	@Override
	public void status() {
		System.out.println("========== Dados do canguru ==========");
		System.out.println("Peso: " + getPeso() + "\nQuantidade de membros: " + getMembros()
		+ "\nIdade: " + getIdade());
	}
	
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}
	
	public void usarBolsa() {
		System.out.println("Usando a bolsa");
	}
}
