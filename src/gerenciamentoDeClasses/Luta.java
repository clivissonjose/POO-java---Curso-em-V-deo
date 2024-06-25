package gerenciamentoDeClasses;

public class Luta {

	// Atributos 
	
	private Lutador  desafiado;
	private Lutador desafiante;
	private int round ;
	private boolean aprovada;
	
	//
	
	// Metodos especiasi ( getters e Setters)
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	public void marcarLuta(Lutador desafiado, Lutador desafiante) {
		
		
		
		if(desafiante.getNome() != desafiado.getNome() && 
		   desafiado.getCategoria() == desafiante.getCategoria()) {
			
			setAprovada(true);
			
			setDesafiado(desafiado);
			setDesafiante(desafiante);
			System.out.println("Luta aprovada!");
		}else {
			setAprovada(false);
			setDesafiado(null);
			setDesafiante(null);
			System.out.println("Luta não aprovada! ");
		}
	}
	
	public int vencedor(Lutador desafiante, Lutador desafiado) {
		double pontosDesafiante = 0.0;
		double pontosDesafiado = 0.0;
		
		// PESO 
		
		if (desafiante.getPeso() > desafiado.getPeso()) {
			//pontosDesafiante += 10;
			pontosDesafiante = pontosDesafiante + 10;
		}else  if(  desafiante.getPeso() < desafiado.getPeso()){
			pontosDesafiado = pontosDesafiado + 10;
		}
		
		// ALTURA 
		
		if( desafiante.getAltura() > desafiado.getAltura()) {
			pontosDesafiante = pontosDesafiante + 10;
		}else if(desafiante.getAltura() < desafiado.getAltura()) {
			pontosDesafiado += 10;
		}
		
		// IDADE 
		
		if(desafiante.getIdade() < desafiado.getIdade()) {
			pontosDesafiante = pontosDesafiante + 10;
		}else if(desafiante.getIdade() > desafiado.getIdade()) {
			pontosDesafiado += 10;
		}
		
		// Vitorias
		
		if(desafiante.getVitorias() > desafiado.getVitorias()) {
			pontosDesafiante = pontosDesafiante + 10;
		}else if(desafiante.getVitorias() < desafiado.getVitorias()) {
			pontosDesafiado += 10;
		}
		
		//  Derrotas 
		
		if(desafiante.getDerrotas() < desafiado.getDerrotas()) {
			pontosDesafiante = pontosDesafiante + 10;
		}else if(desafiante.getDerrotas() > desafiado.getDerrotas()) {
			pontosDesafiado += 10;
		}
		
		// Quantidade de lutas 
		
		int LutasDesafiante = desafiante.getVitorias()	+ desafiante.getDerrotas() + desafiante.getEmpates();
		int LutasDesafiado = desafiado.getVitorias() + desafiado.getDerrotas() + desafiado.getEmpates();
		
		if(LutasDesafiante > LutasDesafiado) {
			pontosDesafiante += 10;
		}else if(LutasDesafiado > LutasDesafiante) {
			pontosDesafiado += 10;
		}
		
		System.out.println("Pontos do " + desafiante.getNome() + " " + pontosDesafiante);
		System.out.println("Pontos do " + desafiado.getNome() + " " + pontosDesafiado);
		
		if(pontosDesafiante == pontosDesafiado) {
			return 0;
		}else if(pontosDesafiante < pontosDesafiado) {
			return 1;
		}else {
			return 2;
		}
		
	}
	
	public void lutar() {
		if(getAprovada()) {
			
			
			desafiado.apresentar();
			desafiante.apresentar();
			
			/*int num = (int) (Math.random() * 3);
			num = 1; */
			
			
			System.out.println("========= Resultado ==========");
			int num = vencedor(desafiante, desafiado);
			// 0 é empate, 1 é vitoria do desafiado e 2 é vitoria do desafiante
			
			switch(num) {
			   case 0:
				   System.out.println("Empate!");
				   desafiado.empatarLuta();
				   desafiante.empatarLuta();
				   break;
			   case 1: 
				   System.out.println("Vitoria do " + desafiado.getNome());
				   desafiado.ganharLuta();
				   desafiante.perderLuta();
				   break;
			   case 2:
				   System.out.println("Vitoria do  " + desafiante.getNome());
				   desafiado.perderLuta();
				   desafiante.ganharLuta();
				   break;
				   
			}
				
		}
	}
	

	
}
