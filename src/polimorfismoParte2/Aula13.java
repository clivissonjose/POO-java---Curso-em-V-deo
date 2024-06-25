package polimorfismoParte2;

public class Aula13 {

	public static void main(String[] args) {
		
		// OBSERVE QUE ESTOU CHAMANDO UM MÉTODO DE MESMO NOME,
		// MAS ASSINATURAs DIFERENTES 
		
		Cachorro c = new Cachorro();
		
		c.reagir("Toma comida");
		c.reagir(true);
		c.reagir(2,12);
		c.reagir(4,  12.3f);
		
	}

}
