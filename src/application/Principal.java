package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Principal {

	public static void main(String[] args) {
		// Formatação padrão
		Locale.setDefault(Locale.US);
		// Scanner para poder utilizar a entrada de dados
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int codigoConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeConta = sc.nextLine();
		Conta conta = new Conta(codigoConta, nomeConta);

		System.out.print("Is there initial deposite (y/n)? ");
		char opcao = sc.next().charAt(0);

		// Estrutura condicional para caso o usuário desejar adicionar um depósito inicial
		if (opcao == 'y' || opcao == 'Y') {
			System.out.printf("Enter initial deposit value: ");
			double saldoConta = sc.nextDouble();
			// Acrescentar o valor digitado de depósito
			conta.depositoConta(saldoConta);
			System.out.println();
		} else if (opcao == 'n' || opcao == 'n') {
			System.out.println();
		}

		System.out.printf("Account data: %n" + conta);
		System.out.println();

		System.out.print("Enter deposit value: ");
		double saldoConta = sc.nextDouble();
		// Utilizando a função de depósito de conta
		conta.depositoConta(saldoConta);
		System.out.printf("Update account data: %n" + conta);
		System.out.println();

		System.out.print("Enter withdraw value: ");
		saldoConta = sc.nextDouble();
		// Utilizando a função de saque da conta
		conta.saqueConta(saldoConta);
		// Resultado final da conta bancária
		System.out.printf("Update aacount data: %n" + conta);
		
		// Encerrando a entrada de dados
		sc.close();
	}

}
