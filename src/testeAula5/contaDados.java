package testeAula5;

public class contaDados {
	
	
	// atributos 
	
	public int NumConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	// VER OS DADOS DO USUÁRIO 
	
	public void verDados() {
		System.out.println("Numero da conta: " +  getNumConta());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Cliente: " + getDono());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Conta aberta:  " + getStatus());
	}
	
	// Getters e Setters 
	public int getNumConta() {
		return this.NumConta;
	}
	public void setNumConta(int num) {
		this.NumConta = num;
	}
	
	
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String type) {
		this.tipo = type;
	}
	
	
	public String getDono() {
		return dono;
	}
	public void setDono(String owner) {
		dono = owner;
	}
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float sal) {
		saldo = sal;
	}
	
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus( boolean sta) {
		status = sta;
	}
	
	
	// METODOS 
	
	public contaDados(float sal, boolean sta) {
		setSaldo(sal);
		setStatus(sta);
	}
	
	public void criarConta(String tip) {
		if(tip == "CC") {
			
			setTipo(tip);
			setSaldo(50);
			
		} else if(tip == "CP") {
			
			setTipo(tip);
			setSaldo(150);
			
		}else {
			System.out.println("ERRO!");
		}
		setTipo(tip);
		setStatus(true);
	}
	
	public void fecharConta() {
		if( saldo == 0 ) {
			setStatus(false);
		}else {
			System.out.println("Você não pode fechar a conta");
		}
	}
	
	public void abrirConta() {
		if(getStatus() == true) {
			System.out.println("Sua conta já estava aberta!");

		}else {
			setStatus(true);
		}
	}
	public void depositar(float sal) {
		if(getStatus() == true) {
			setSaldo(getSaldo() + sal);
		}else {
			System.out.println("Não foi possível depositar! sua conta está fechada!");
		}
	}
	
	public void sacar(float quantia) {
		if( getStatus() == true && getSaldo() > 0 ) {
			if(getSaldo() - quantia >= 0 ) { // quantia <= getSaldo(
				setSaldo(getSaldo() - quantia);
			}else {
				System.out.println("Saldo insuficiente!");
			}
		}else {
			System.out.println("Saldo negativo ou conta fechada!");
		}
	}
	
	public void fechar() {
		if(getSaldo() == 0) {
			setStatus(false);
		}else {
			System.out.println("Você não pode fechar a conta, ainda possui débito ou crédito nela");
		}
	}
	
	public void pagarMensal() {
			
	if(getStatus() == true) {	
		if(getTipo()== "CC" && getSaldo() - 12 >= 0) {
			
			setSaldo(getSaldo() - 12);
			
		}else if(getTipo() == "CP" && getSaldo() - 25 >= 0) {
			setSaldo(getSaldo() - 25);
		}
	   
	}else {
		System.out.println("Sua conta está fechada!");
	}
	}
}
