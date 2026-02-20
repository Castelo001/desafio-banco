package contaAdm;

public class Conta {

	String numeroConta;
	String dono;
	double saldo;
	double limite;

	Conta() {

	}

	Conta(String dono, String numeroConta, double saldo, double limite) {
		this.dono = dono;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.limite = limite;
	}

	String imprimirAtributos() {
		return String.format("""
				Dono: %s
				Numero da Conta: %s
				Saldo:  R$ %.2f
				Limite: R$ %.2f
				===================""", this.dono, numeroConta, saldo, limite);
	}

	boolean deposito(double valor) {
		if (valor <= 0) {
			System.out.println("Digite um valor válido!");
			return false;
		}
		this.saldo += valor;
		return true;
	}

	boolean sacar(double valorSaque) {
		if (valorSaque < 0) {
			System.out.println("====\n  Valor inválido para sáque!  \n====");
			return false;
		}
		if (valorSaque > this.limite) {
			System.out.println("Exede o limite permitido");
		}
		if (valorSaque > this.saldo) {
			System.out.println("Exede o salto permitido");
		}
		if (valorSaque < this.saldo) {
			this.saldo -= valorSaque;
			return true;
		}
		this.limite -= valorSaque;
		return true;
	}

	boolean transferir(Conta destino, double valor) {
		boolean retirada = this.sacar(valor);
		if (retirada == false) {
			return false;
		}
		destino.deposito(valor);
		return true;
	}

}
