package polimorfismoParte1;

public class Mamifero extends Animal{

	private String corPelo;
	
	@Override
	public void locomover() {
        System.out.println("Estou correndo!");	
	}
	
	@Override
	public void alimentar() {
		System.out.println("Estou mamando");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Som mamifero");
	}
	
	public String gerCorPelo() {
		return this.corPelo;
	}
	
	public void setCorPelo(String cor) {
		this.corPelo = cor;
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		
	}
	
	
}
