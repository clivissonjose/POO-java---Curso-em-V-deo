package projetoFinal;

public class ProjetoYouTube {

	public static void main(String[] args) {
		
		Video[] video = new Video[3];
		video[0] = new Video("Curso POO");
		video[1] = new Video("Curso PHP");
		video[2] = new Video("Curso JavaScript");
		
		Gafanhoto[] gafanhoto = new Gafanhoto[2];
		gafanhoto[0] = new Gafanhoto("Clívisson", 23, "M", "N");
		
		var visualizacao = new Visualizacao(gafanhoto[0], video[0]);
	//	var visualizacao2 = new Visualizacao(gafanhoto[0], video[0]);
		System.out.println(visualizacao.toString());
		
		
	}

}
