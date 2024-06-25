package DesafioAula09b;

public class Livro implements Publicacao{
    
	
	private String autor;
	private String titulo;
	private int totPaginas;
	private int pagAtual;
	private Pessoa leitor;
	private boolean aberto;
	
	
	public String detalhes() {
		return "Livro [autor=" + autor + ", titulo=" + titulo + "\n totPaginas=" + totPaginas + " pagAtual=" + pagAtual
				+ "\n leitor=" + leitor.getNome() + " aberto=" + aberto + "]";
	}
	 
	
	public Livro(String autor, String titulo, int totPaginas, Pessoa leitor) {
			super();
			this.autor = autor;
			this.titulo = titulo;
			this.aberto = false;
			this.pagAtual = 0;
			this.totPaginas = totPaginas;
			this.leitor = leitor;
	}
	  
	// Métodods Getters e Setters 
	  
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	
	
	@Override
	public void abrir() {
		
		setAberto(true);
		
	}
	@Override
	public void fechar() {
		setAberto(false);
		
	}
	@Override
	public void folhear(int pag) {
		if(pag > getTotPaginas())
		   setPagAtual(0);
		else if(isAberto())
			setPagAtual(pag);
		
	}
	@Override
	public void avancarPag() {
		
		if(getPagAtual() < getTotPaginas() && isAberto())
		   setPagAtual(getPagAtual() +1);
		
	}
	@Override
	public void voltarPag() {
		
		if( getPagAtual() > 0 && isAberto())
		  setPagAtual(getPagAtual() - 1);
		
	}


	  
	  
}
