package aula04;

public class Caneta {
   
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	// Constructor 
	// O nome do constructor tem que ser o mesmo da classe 
	
	public Caneta(String m, String c, float p) {
		
		this.setModelo(m);
		this.setPonta(p);
		this.setCor(c);
		this.tampar();
		
	}
	
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	// Getters  e Setters da ponta 
	
	public float getPonta() {
		return this.ponta;
	}
	
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	// Getters e Setters cor 
	
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	
	// functions tampar and destampar 
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		
		System.out.println("Dados da caneta: ");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
		
	}
}
