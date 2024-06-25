package polimorfismoParte1;

public class Reptil extends Animal {

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
		System.out.println("Rastejando!");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo mato!");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som de reptil");
	}
	
	public void soltarBolhas() {
		System.out.println("Soltando bolhas!");
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		
	}

	
}
