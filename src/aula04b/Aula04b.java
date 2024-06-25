package aula04b;



public class Aula04b {

	public static void main(String[] args) {
		
		Notebook note1 = new Notebook();
		
		note1.setModelo("Samsung");
		note1.setCor("preto");
		note1.setMemRam(8f);
		note1.setAberto(true);
		
		//note1.aberto = false;
		//note1.abrir();
		note1.setEstaProgramando(true);
		note1.setSsd(true);
		note1.status();
		
		note1.programando();
		
		
		
		
	/*	int beerNum = 99;
	 * 
	 * 
		String word = "bottles";
		
		while(beerNum > 0) {
			
			if (beerNum == 1) {
				word = "bottle";
			}
			
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down");
			System.out.println("Pass it around");
			beerNum -= 1;
			
			if(beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
			}else {
				System.out.println("No more bottles of beer on the wall");
			}
		}*/

	}

}
