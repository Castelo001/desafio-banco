package contaAdm;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			// System.out.println("Digite quantas contas criar: ");
			// int numeroDeContas = entrada.nextInt();numeroDeContas

			Conta[] arrayContas = new Conta[2];
//
//			for (int i = 0; i < arrayContas.length; i++) {
//				System.out.println("Informe os dados da conta " + (i + 1) + ": ");
//				System.out.println("Informe o nome do usuario da conta: ");
//				String nome = entrada.nextLine();
//				System.out.println("Informe o numero da conta: ");
//				String numeroC = entrada.nextLine();
//				System.out.println("Informe o saldo da conta: ");
//				double saldoC = entrada.nextDouble();
//				entrada.nextLine();
//				System.out.println("Informe o limite da conta: ");
//				double limiteC = entrada.nextDouble();
//				entrada.nextLine();
//				arrayContas[i] = new Conta(nome, numeroC, saldoC, limiteC);
//
//			}

			arrayContas[0] = new Conta("Joao", "123", 100, 50);
			arrayContas[1] = new Conta("Jose", "321", 200, 100);
			for (Conta exibirC : arrayContas) {
				System.out.println(exibirC.imprimirAtributos());
			}

			while (true) {
				System.out.println("Qual conta operar?\n Informe o número da conta que deseja operar: ");
				String escolherConta = entrada.nextLine();
				Conta contaEscolhida = null;
				for (Conta comparaConta : arrayContas) {
					if (escolherConta.equals(comparaConta.numeroConta)) {
						contaEscolhida = comparaConta;
						System.out.println("Digite:\n 1 - Ver o saldo \n 2 - Depositar \n 3 - Sacar");
						int escolhaMenu = entrada.nextInt();
						entrada.nextLine();
						if (escolhaMenu == 1) {
							System.out.println(contaEscolhida.saldo);
						}
						if (escolhaMenu == 2) {
							System.out.println("Quanto deseja depositar ?");
							double vDeposito = entrada.nextDouble();
							entrada.nextLine();
							contaEscolhida.deposito(vDeposito);
						}
						if (escolhaMenu == 3) {
							System.out.println("Quanto deseja sacar ?");
							double vSaque = entrada.nextDouble();
							entrada.nextLine();
							contaEscolhida.sacar(vSaque);

						}
					}
				}

				if (contaEscolhida == null) {
					System.out.println("Digite uma conta válida!");
				} else {
					System.out.println(contaEscolhida.imprimirAtributos());
				}

			}
		}
	}
}

//			
//			while (true) {
//				System.out.println("Deseja operar em qual conta?\nDigite o numero da conta para acessar: ");
//				String escolhaConta = entrada.nextLine();
//				// encontra a conta
//				Conta contaEscolhida = null;
//				for (Conta contaAtual : arrayContas) {
//					if (escolhaConta.equals(contaAtual.numeroConta)) {
//						contaEscolhida = contaAtual;
//					}
//				}
//				if (contaEscolhida == null) {
//					System.out.println("Conta Inválida");
//				} else {
//					System.out.println(contaEscolhida.imprimirAtributos());
//				}
// executar o resto
