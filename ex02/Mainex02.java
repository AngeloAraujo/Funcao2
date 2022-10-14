package ex02;

import java.util.Scanner;

public class Mainex02 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Insira o valor do primeiro numero:");
		int num1 = entrada.nextInt();
		System.out.println("Insira o valor do segundo numero: ");
		int num2 = entrada.nextInt();
		

		Ordem a = new Ordem(num1, num2);
		
		System.out.println(a.retornaValor());
		
		entrada.close();
	}

}
