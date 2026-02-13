package contaAdm;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			Conta[] arrayContas = new Conta[2];

			for (int i = 0; i < arrayContas.length; i++) {
				System.out.println("Informe os dados da conta " + (i + 1) + ": ");
				System.out.println("Informe o nome do usuario da conta: ");
				String nome = entrada.nextLine();
				System.out.println("Informe o numero da conta: ");
				String numeroC = entrada.nextLine();
				System.out.println("Informe o saldo da conta: ");
				double saldoC = entrada.nextDouble();
				entrada.nextLine();
				System.out.println("Informe o limite da conta: ");
				double limiteC = entrada.nextDouble();
				entrada.nextLine();
				arrayContas[i] = new Conta(nome,numeroC,saldoC,limiteC);
			
			}
			for (Conta exibirC : arrayContas) {
				System.out.println(exibirC.imprimirAtributos());
			}
		}

	}
}
