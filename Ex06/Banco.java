package Ex06;

public class Banco {

	private String nome;
	private int numeroconta;
	private double saldo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length()>0) {
		this.nome = nome;
		}
	}
	
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		if (numeroconta>0) {
		this.numeroconta = numeroconta;
	}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	public boolean deposito(double valor) {
		if(valor > 0) {
			setSaldo(getSaldo()+valor);
			return true;
		}
		return false;
	}
		
	public boolean saque(double valor) {
		if(valor <= getSaldo() && valor > 0) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}
	
	
}
