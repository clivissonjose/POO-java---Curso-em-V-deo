package heranca_parte2;

//  Esse final significa que a classe não pode ter filhos

public final class Bolsita extends Aluno {
	
	private float bolsa;
	
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa!");
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println("Bolsista! Pagando mensalidade do bolsista");
	}
	
	public float getBolsa() {
		return this.bolsa;
	}
	
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}
