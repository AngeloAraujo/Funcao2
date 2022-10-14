package ex02;

public class Ordem {

	private int num1;
	private int num2;

	
	
	public Ordem(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum1(int num1) {
		if (num1>0)
			this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		if (num2>0)
			this.num2 = num2;
	}
	
	public StringBuilder retornaValor() {
		StringBuilder valores = new StringBuilder();
		if(num1> num2) {
			int aux = num1;
			num1= num2;
			num2=aux;
		}
		for(int i= num1+1;i<num2;i++ ) {
			valores.append (i);
			valores.append(" | ");
		}
		
		return valores;
	}
	
	
}
