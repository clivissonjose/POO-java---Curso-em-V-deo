package encapsulamento;

public class ControleRemoto implements Controlador{
   
	private int volume;
	private boolean tocando;
	private boolean ligado;
	
	// Método construtor
	
	public ControleRemoto() {
		this.volume = 50;
		this.tocando = false;
		this.ligado = true;
	}
	
	// Getters e Setters 
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean getTocando() {
		return tocando;
	}
	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	public boolean getLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	// METODOS ABSTRATOS 

	@Override
	public void ligar() {
		
		setLigado(true);
		
	}

	@Override
	public void desligar() {
		
		setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		
		if(getLigado() == true) {
			System.out.println("Está ligado? " + getLigado());
			System.out.println("Está tocando? " + getTocando());
			System.out.println("Volume: " + getVolume());
			
			for(int i = 0; i <= getVolume(); i+=10) {
				System.out.print(" | ");
			}
		}
		
	}

	@Override
	public void fecharMenu() {
		
		System.out.println("Fechando o menu! ");
		
	}

	@Override
	public void maisVolume() {
		
		if(getLigado() == true ) {
			setVolume(getVolume() + 5);
		}else {
			System.out.println("Não foi possível aumentar o volume!");
		}
		
	}

	@Override
	public void menosVolume() {
		
		if(getLigado() == true) {
			setVolume(getVolume() - 5);
		}else {
			System.out.println("Não foi possível abaixar volume!");
		}
		
	}

	@Override
	public void ligarMudo() {
		
		if(getLigado() == true && getVolume() > 0 ) {
			setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		
		if(getLigado() == true && getVolume() == 0) {
			setVolume(50);
		}
		
	}

	@Override
	public void play() {
		
		if(getLigado() && !(getTocando())) {
			setTocando(true);
		}
		
	}

	@Override
	public void pause() {

		if(getLigado() && getTocando() == true) {
			setTocando(false);
		}
		
	}
}
