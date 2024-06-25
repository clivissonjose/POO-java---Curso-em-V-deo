package heranca_parte2;

public class Aula11b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Visitante v1 = new Visitante();
	
	v1.setNome("Clivisson");
    v1.setIdade(18);
    v1.setSexo("M");
    
    System.out.println(v1.toString());
    System.out.println(" ");
    
    Aluno a1 = new Aluno();
    
    a1.setNome("Joao");
    a1.setIdade(14);
    a1.setSexo("M");
    
    a1.setCurso("Algebra Linear");
    a1.setMatricula(749750);
    a1.pagarMensalidade();
    
    System.out.println(a1.toString());
    System.out.println(" ");
    
    Bolsita b1 = new Bolsita();
    
    b1.setNome("Valéria");
    b1.setIdade(23);
    b1.setSexo("M");
    
    b1.setCurso("BCC");
    b1.setMatricula(646856);
    b1.pagarMensalidade();
    
    System.out.println(" ");
    
    Tecnico t1 = new Tecnico();
    
    t1.setNome("Rafaela");
    t1.setIdade(19);
    t1.setSexo("F");
    
    t1.setRegistroProfissional(6758569);
    t1.praticar();
    
    Funcionario f1 = new Funcionario();
    
    f1.setNome("Rafaela meneze");
    b1.setIdade(40);
    b1.setSexo("F");
    
    
    f1.setEspecialidade("Nutricionista");
    f1.setSalario(6386.8);
    
    
    
    
  }

}
