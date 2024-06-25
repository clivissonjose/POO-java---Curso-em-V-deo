package polimorfismoParte1;

public abstract class Animal {
	
	protected double peso;
	protected double altura;
	protected int idade;
	protected int membros;
	
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	public abstract void status();
	
	// Getters e Setters 
  
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}

}
