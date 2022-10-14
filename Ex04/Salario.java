package Ex04;

import java.text.DecimalFormat;

public class Salario {

	private double hora;
	private double valorhora;
	//private double totalsalario;
	
	
	
	public Salario(double hora, double valorhora) {
		this.hora = hora;
		this.valorhora = valorhora;
	}

	public double getHora() {
		return hora;
	}
	
	public void setHora(double hora) {
		if (hora>0)
		this.hora = hora;
	}
	
	public double getValorhora() {
		return valorhora;
	}
	
	public void setValorhora(double valorhora) {
		if (valorhora>0)
		this.valorhora = valorhora;
	}
	
	public double salariobruto() {
		double totalsalario = (hora*valorhora);
		return totalsalario;
	}
	
	public double descontoInss () {
		double descontoinss= (salariobruto()/100*8);
		return descontoinss;
	}
	
	public double descontoSindicato () {
		double descontosind= (salariobruto()/100*5);
		return descontosind;
	}
	
	public double descontoImpostoRenda() {
		double descontosirpf= (salariobruto()/100*11);
		return descontosirpf;
	}
	
	public double salarioliquido() {
		double salarioreal = (salariobruto() - descontoImpostoRenda()-descontoInss()-descontoSindicato());
		return salarioreal;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("+ Salario Bruto: ");
		builder.append((new DecimalFormat("#,##0.00").format(salariobruto())+ " reais."));
		builder.append("\n");
		builder.append("- INSS(8%): ");
		builder.append((new DecimalFormat("#,##0.00").format(descontoInss())+ " reais."));
		builder.append("\n");
		builder.append("- Sindicato (5%): ");
		builder.append((new DecimalFormat("#,##0.00").format(descontoSindicato())+" reais."));
		builder.append("\n");
		builder.append("- Imposto de Renda(11%): ");
		builder.append((new DecimalFormat("#,##0.00").format(descontoImpostoRenda())+ " reais."));
		builder.append("\n");
		builder.append("= Salário Líquido: ");
		builder.append((new DecimalFormat("#,##0.00").format(salarioliquido())+ " reais."));
		return builder.toString();
	}
	
	
	
	
}
