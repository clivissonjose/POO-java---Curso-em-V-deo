package heranca_parte2;

public abstract class  Pessoa {

	@Override
	public String toString() {
		return "Dados[nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "";
		
	}

	private String nome;
	private String sexo;
	private int idade;
	

	
	public void fazerAbiversario() {
		this.idade++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
