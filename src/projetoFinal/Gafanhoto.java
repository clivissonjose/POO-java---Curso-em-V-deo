package projetoFinal;

public class Gafanhoto extends Pessoa {

	

	private String login;
	private int totAssitido;
	
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssitido = 0;
		// TODO Auto-generated constructor stub
	}
	
	public void setTotAssitido(int totAssitido) {
		this.totAssitido = totAssitido;
	}

	public void viuMaisUm() {
		
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssitido() {
		return totAssitido;
	}

	@Override
	public String toString() {
		return "Gafanhoto " + super.toString()  + "[login=" + login + ", totAssitido=" + totAssitido + "]";
	}

}
