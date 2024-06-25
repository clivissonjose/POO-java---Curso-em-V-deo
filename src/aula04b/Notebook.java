package aula04b;

public class Notebook {

	private String cor;
	public String modelo;
	private float memRam;
	private boolean aberto;
	public boolean estaProgramando;
	private boolean eSsd;
	
	//  Getters e Setters 
	
	  //  Getters e Setters cor: 
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	   // Getters e Setters modelo: 
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	    // Getters e Setters Memoria ram
	
	public float getMemRam() {
		return this.memRam;
	}
	
	public void setMemRam(float ram) {
		this.memRam = ram;
	}
	
	    // Getters e Setters aberto
	
	public boolean getAberto() {
		return this.aberto;
	}
	
	public void setAberto(boolean abr) {
		this.aberto = abr;
	}
	   // Getters e Setters programando
	
	public boolean getEstaProgramando() {
		return this.estaProgramando;
	}
	
	public void setEstaProgramando(boolean prog) {
		this.estaProgramando = prog;
	}
	 
	   // Getters e Setters ssd
	
	public boolean getSsd() {
		return this.eSsd;
	}
	
	public void setSsd(boolean result) {
		this.eSsd = result;
	}
	
	
	// Metodos 
	
	public void abrir() {
		this.aberto = true;
		
	}
	
	public void fechar() {
		this.aberto = false;
	}
	
	public void programando() {
        if(getAberto()== true && estaProgramando == true) {
        	System.out.println("Estamos programando!");
        	if(eSsd == true) { // ou getSsd() 
        		System.out.println("Temos SSD para facilitar a sua vida!");
        	}
        }else if(estaProgramando == false) {
        	System.out.println("Não estamos programando! ");
        }
	}
	
	
	public void status() {
		
		System.out.println("Modelo: " + getModelo());
		System.out.println("Cor: " + getCor());
		System.out.println("Memória ram: " + getMemRam());
		System.out.println("Está aberto: " + getAberto());
		System.out.println("ssd embutido: " + getSsd());
		
	}
}
