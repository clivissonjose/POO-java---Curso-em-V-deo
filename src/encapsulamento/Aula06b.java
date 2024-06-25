package encapsulamento;

public class Aula06b {

	public static void main(String[] args) {
		
		ControleRemoto c = new ControleRemoto();
		c.desligar();
		//c.menosVolume();
		c.ligar();
		c.desligarMudo();
		c.play();
		c.pause();
		c.abrirMenu();
		
	}

}
