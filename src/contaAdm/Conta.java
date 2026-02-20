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
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			System.out.println("Digite um valor positivo!");
			return false;
		}
	}

}
