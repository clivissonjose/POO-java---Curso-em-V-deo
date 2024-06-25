package polimorfismoParte1;

public class Arara extends Ave{
 
	@Override
	public void status() {
		System.out.println("========== Dados do arara ==========");
		System.out.println("Peso: " + getPeso() + "\nQuantidade de membros: " + getMembros()
		+ "\nIdade: " + getIdade());
	}
}
