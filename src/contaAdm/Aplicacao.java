package contaAdm;



public class Aplicacao {

	public static void main(String[] args) {
		Conta conta1 = new Conta("Alan", "0009", 9000.00, 12000.00);
		Conta conta2 = new Conta("Julia", "0033", 4000.00, 8000.00);
		Conta conta3 = new Conta("Bia", "0021", 1000.00, 15000.00);

		System.out.println(conta1.imprimirAtributos());
		System.out.println(conta2.imprimirAtributos());
		System.out.println(conta3.imprimirAtributos());
	
	}

}
