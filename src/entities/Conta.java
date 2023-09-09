package entities;

public class Conta {
	//Utilizei o membro estático pois a taxa possui um valor fixo
	public static final double taxaConta = -5.00; 
	private int codigoConta;
	private String nomeConta;
	private double saldoConta;

	// Contrutores
	public Conta(int codigoConta, String nomeConta, double saldoConta) {
		this.codigoConta = codigoConta;
		this.nomeConta = nomeConta;
		this.saldoConta = saldoConta;
	}

	public Conta(int codigoConta, String nomeConta) {

		this.codigoConta = codigoConta;
		this.nomeConta = nomeConta;
	}

	public int getCodigoConta() {
		return codigoConta;
	}

	
	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	// Tem como função adicionar o valor do depósito
	public void depositoConta(double saldoConta) {
		this.saldoConta += saldoConta;
	}

	// Tem como função remover/sacar o valor da conta
	public void saqueConta(double saldoConta) {
		this.saldoConta -= saldoConta - taxaConta;
	}
	
	// Criei esse método com a função de poupar linhas escritas na classe Principal 
	public String toString() {
		return "Account " + getCodigoConta() + ", Holder: " + getNomeConta() + ", Balance: $ "
				+ String.format("%.2f", getSaldoConta());
	}

}
