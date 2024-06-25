package poo_curso_em_video;

public class Notebook {
	
     // Atributos 
	String modelo;
	String Marca;
	String cor;
	float memoriaRam;
	int anoFabricacao;
	boolean aberto;
	boolean vaiProgramar;
	boolean vaiEstudar;
	
	// Metodos 
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Marca: " + this.Marca);
		System.out.println("Ano de fabricação: " + this.anoFabricacao);
		System.out.println("Memória ram: " + this.memoriaRam);
		System.out.println("Cor: " + this.cor);
	}
	
	
	public void programando() {
		if(this.aberto == true  ) {
			
			if(this.vaiProgramar == true) {
				System.out.println("Vamos programar!");
			}
		}else {
			System.out.println("Notebook fechado");
		}
	}
	
	public void assistindoVideos() {
		
	}
	
	public void estudando() {
		if(this.vaiEstudar == true && this.aberto == true && this.vaiProgramar == false) {
			System.out.println("Vamos estudar!");
		}else {
			System.out.println("Nao vamos estudar!");
		}
	}
	
	public void abrir() {
		aberto = true;
	}
	
	public void fechar() {
		this.aberto = false;
	}
	
	
}
