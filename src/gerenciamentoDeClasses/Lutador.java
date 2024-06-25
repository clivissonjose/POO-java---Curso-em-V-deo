package gerenciamentoDeClasses;

public class Lutador {
	
	// Atributos 

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	// Métodos Getters e Setters
	
	public String getNome() {

		return nome;
	}
	
	public void setNome(String name) {

		this.nome = name;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nac) {
		this.nacionalidade = nac;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int id) {
		this.idade = id;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float alt) {
		this.altura = alt;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float pe) {
		this.peso = pe;
		setCategoria();
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	private void setCategoria() {
		
		if(peso < 52.5) {
			this.categoria = "invalido";
		}else if(peso <= 74.9) {
			this.categoria = "Leve";
		}else if(peso <= 105.0) {
			this.categoria = "Médio";
		}else if(peso <= 125.0) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
		
	}
	
	public int getVitorias() {
		return vitorias;
	}
	
	public void setVitorias(int vi) {
		this.vitorias =  vi;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	
	public void setDerrotas(int de) {
		this.derrotas =  de;
	}
	
	public int getEmpates() {
		return empates;
	}
	
	public void setEmpates(int em) {
		this.empates = em;
	}
	
	// Método constructor
	public Lutador( String nome, String nac, int ida, float alt, float pe, int vi, int de, int em) {
		
		setNome(nome);
		setNacionalidade(nac);
		setIdade(ida);
		setAltura(alt);
		setPeso(pe);
		setVitorias(vi);
		setDerrotas(de);
		setEmpates(em);
		
	}
	
	public void  apresentar() {
		System.out.println("=================================");
		System.out.println("Conheça nosso lutador: ");
		System.out.println("Nome: " + getNome());
		System.out.println("Nacionalidade: " +  getNacionalidade());
		System.out.println("Peso: " + getPeso());
		System.out.println("Altura: " + getAltura());
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Vitorias: " + getVitorias());
		System.out.println("Derrotas: " + getDerrotas());
		System.out.println("Empates: " + getEmpates());
		System.out.println(" ");
	}
	
	public void status() {
		System.out.println("Conheça " + getNome() + " nosso peso " + getCategoria() + " com " + getVitorias() + " vitorias, " 
				+ getDerrotas() + " derrotas e " + getEmpates() + " empates!!!");
	}
	
	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
	}
	
	public void perderLuta() {
		setDerrotas(getDerrotas() +1);
	}
	
	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}
}
