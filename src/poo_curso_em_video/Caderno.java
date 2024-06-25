package poo_curso_em_video;

public class Caderno {
       
	String marca;
	String dono;
	int QuantFolhas;
	float preco;
	float peso;
	boolean aberto;
	boolean estudar;
	
	public void status() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Dono: " + this.dono);
		System.out.println("Quantidade de folhas: " + this.QuantFolhas);
		System.out.println("Preço: " + this.preco);
		System.out.println("Peso: " + this.peso);
		System.out.println("Esta aberto? " + this.aberto);
	}
	
	public void estudar() {
		 if(this.aberto == true && this.estudar == true) {
			 System.out.println("Bons estudos!");
		 }else {
			 System.out.println("Não dar para estudar");
		 }
	}
	
	public void abrir() {
		this.aberto = true;
	}
	
	public void fechar() {
		this.aberto = false;
	}
	
}
