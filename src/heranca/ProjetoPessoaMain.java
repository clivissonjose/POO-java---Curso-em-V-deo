package heranca;

public class ProjetoPessoaMain {

	public static void main(String[] args) {
		
		Aluno p1 = new Aluno();
		Professor p2 = new Professor();
		Funcionario p3 = new Funcionario();
		Pessoa p4 = new Pessoa();
		
		// Atributos da classe Pessoa herdados pela classe Aluno: 
		p1.setNome("Clívisson");
		p1.setIdade(23);
		p1.setSexo("M");
		p1.fazerAniver();
		
			p1.setMatricula(573644);
			p1.setCurso("Ciência da computação");
			
			// Não funcionam
		     // p1.setEspecialidade("Calculo");
		     // p1.setSalario(6863);
		
		
		// Atributos da classe Pessoa herdados pela classe Professor
		p2.setNome("Rafaela");
		p2.setIdade(20);
		p2.setSexo("F");
		p2.fazerAniver();
		
		  // atributos próprios da classe Professor, esses straibutos não funciona em outras classe.
		  p2.setEspecialidade("Física");
		  p2.setSalario(2673.0);
		
		
		// Atributos da classe Pessoa herdados pela classe Funcionario
		p3.setNome("Lucas");
		p3.setIdade(18);
		p3.setSexo("M");
		p3.fazerAniver();
			
			// Atributos próprios da classe Funcionario
			p3.setSetor("Almoxarifado");
			p3.setTrabalhando(true);
		
		
		p4.setNome("Camila");
		
		

		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println();
		

	}

}
