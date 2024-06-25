package polimorfismoParte2;

public class Cachorro extends Lobo{
	
	@Override
	public void emitirSom() {
		System.out.println("AU AU AUA AU!");
	}
	
	public void reagir(String frase) {
		if(frase.toUpperCase().equals("TOMA COMIDA") || frase.equals("Ola")) {
			System.out.println("Abanar o rabo e latir");
		}else {
			System.out.println("Rosnar! Sai vagabundo(a)");
		}
	}
	
	public void reagir(int hora, int min) {
		if(hora  < 12) {
			System.out.println("Abanar e latir, está cedo!");
		}else if(hora >= 12) {
			System.out.println("ignorar");
		}else {
			System.out.println("latir");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("Abanar rabo -  dono");
		}else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int idade, float peso) {
		if(idade < 5) {
			if(peso < 10) {
				System.out.println("Novo e leve! - Abanar");
			}else {
				System.out.println("Novo e pesado! - Rosnar");
			}
		}else {
			if(peso<5) {
				System.out.println("Velho e leve! - Latir");
			}else {
				System.out.println("Velho e pesado! - Abanar e latir");
			}
		}
	}

}
