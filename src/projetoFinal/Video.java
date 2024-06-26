package projetoFinal;

public class Video implements AcoesVideo{

	private String  titulo;
	private int avaliacao;
	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	
	
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas =0;
		this.reproduzindo = true;
	}
	@Override
	public void like() {
		this.curtidas++;
		
	}
	@Override
	public void play() {
		this.reproduzindo = true;
	}
	@Override
	public void pause() {
		this.reproduzindo= false;
	}
	
	// Getters e Setters
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	
}
