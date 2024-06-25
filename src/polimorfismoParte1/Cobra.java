package polimorfismoParte1;

public class Cobra extends Mamifero{
	
	private String especieCobra;
	
	@Override
	public void status() {
		System.out.println("========== Dados do cobra ==========");
		System.out.println("Peso: " + getPeso() + "\nQuantidade de membros: " + getMembros()
		+ "\nIdade: " + getIdade());
	}
	
	

	public String getEspecieCobra() {
		return especieCobra;
	}

	public void setEspecieCobra(String especieCobra) {
		this.especieCobra = especieCobra;
	}

	@Override
	public void emitirSom() {
		if(getEspecieCobra().toUpperCase().equals("CASCAVEL"))
			System.out.println("Chacolhando a bage");
		else
			System.out.println("Não emito barulho");
	}
}
