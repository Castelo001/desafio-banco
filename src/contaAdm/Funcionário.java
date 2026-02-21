package contaAdm;

public class Funcionário {
	String nome;
	String departamento;
	String rG;
	String dataIngresso = "";
	double salario;

	void receberAumento(double percentual) {
		double descontoSalario = this.salario * (percentual / 100);
		System.out.println("O valor do desconto é: "+descontoSalario);
		this.salario += descontoSalario;
System.out.println("O salário com o aumento fica: "+this.salario);
	}

}
