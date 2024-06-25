package DesafioAula09b;

public class Pessoa {
	
	public Pessoa(String nome, int idade, String sexo) {
		//super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}


	private String nome;
	private int idade;
	private String sexo;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int ida) {
		this.idade =  ida;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	public void fazerAniver() {
		this.idade += 1;
	}

}


