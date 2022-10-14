package Ex03;

public class Calcular {

	private float num1;
	private float num2;
	
	
	public Calcular(float num1, float num2) {
		this.num1 = num1;
		this.num2 = num2;
	}


	public float getNum1() {
		return num1;
	}


	public void setNum1(float num1) {
		this.num1 = num1;
	}


	public float getNum2() {
		return num2;
	}


	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	
	public float soma() {
		float valorSoma= (num1+num2);
		return valorSoma;
		
	}
	
	public float subtracao() {
		float subtrair = (num1- num2);
		return subtrair;
	}
	
	public float dividir() {
		float divisao = (num1/num2);
		return divisao;
	}
	
	public float multiplicar() {
		float mult= (num1*num2);
		return mult;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Calcular");
		builder.append("\n");
		builder.append("Valor 1: ");
		builder.append(num1);
		builder.append("\n");
		builder.append("Valor 2 :");
		builder.append(num2);
		builder.append("\n");
		builder.append("Resultados: ");
		builder.append("\n");
		builder.append("Soma: ");
		builder.append(soma());
		builder.append("\n");
		builder.append("Subtração: ");
		builder.append(subtracao());
		builder.append("\n");
		builder.append("Divisão: ");
		builder.append(dividir());
		builder.append("\n");
		builder.append("Multiplicação: ");
		builder.append(multiplicar());
		return builder.toString();
	}
	
	
}
