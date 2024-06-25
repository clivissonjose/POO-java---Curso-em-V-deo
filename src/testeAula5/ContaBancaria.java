package testeAula5;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		contaDados usuario1 = new contaDados(0.0f, false);
		int opcao;
		//usuario1.verDados();
		
		do{
			System.out.println("Olá o que deseja fazer?");
			System.out.println("1 - Criar conta: ");
			System.out.println("2 - Depositar: ");
			System.out.println("3 - Sacar: ");
			System.out.println("4 - Ver dados: ");
			System.out.println("5 - Fechar: ");
			System.out.println("6 - Pagar mensalidade: ");
			System.out.println("7 - abrir conta: ");
			System.out.println("0 - Sair: ");
			opcao = input.nextInt();
			input.nextLine();
			
			
			if(opcao == 1) {
				// Criando conta usando o método constructor
				
				usuario1.setNumConta(85849);
				
				// TIPO DA CONTA 
				System.out.println("Qual o tipo da: \n 1 - conta CC (conta corrente) \n 2 - CP (conta poupança)? ");
				int tipoDaConta = input.nextInt();
				input.nextLine();
				
				if(tipoDaConta == 1) {
					usuario1.criarConta("CC");
				}else if(tipoDaConta == 2) {
					usuario1.criarConta("CP");
				}else {
					System.out.println("Opção invalida!");
				}
				
				// NOME DO DONO DA CONTA 
				
				System.out.println("Digite seu nome: ");
				String nome = input.nextLine();
				usuario1.setDono(nome);
				
				usuario1.verDados();
				
			}else if(opcao == 2) {
				System.out.println("Digite quanto voçê vai depositar: ");
				float deposito =  input.nextFloat(); 
				usuario1.depositar(deposito);
				usuario1.verDados();
			}else if(opcao == 3) {
				System.out.println("Quanto irá sacar? ");
				float saque =  input.nextFloat();  
				usuario1.sacar(saque);
			}else if(opcao == 4) {
				usuario1.verDados();
			}else if(opcao == 5) {
				usuario1.fechar();
			}else if(opcao == 6) {
				usuario1.pagarMensal();
			}else if(opcao == 7) {
				usuario1.abrirConta();
			}

		}while(opcao != 0);
		
		System.out.println("Fim!");
		
		input.close();
	}

}
