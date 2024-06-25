package polimorfismoParte1;

public class Peixe extends Animal {
	
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Estou nadando! -  Peixe");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo águas vivas! - Peixe");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Peixe não emite som! - Peixe");
	}
	
	public void trocarEscama() {
		System.out.println("Trocando escama! - Peixe");
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		
	}

}
