package DesafioAula09b;

public class ProjetoPessoa {

	public static void main(String[] args) {
		
		Pessoa p[] = new Pessoa[2];
		Livro l[] = new Livro[3];
		
		p[0] = new Pessoa("Clívisson", 22, "M");
		p[1] = new Pessoa("Izabel Yale Neves Nascimento", 21, "F");
		
		l[0] = new Livro("Mark Manson", "Models", 557, p[0]);
		l[1] = new Livro("Isadora Duarte", "POO", 394, p[1]);
		l[2] = new Livro("Gustavo Guanabara", "Curso de POO Java", 473, p[0]);
		
		
		l[1].abrir();
		l[1].folhear(18);
		System.out.println(l[1].detalhes());

	}

}
