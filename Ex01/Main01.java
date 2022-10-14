package Ex01;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Insira o seu nome:");
		String nome= entrada.nextLine();
		System.out.println("Insira o seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		Pessoa pessoa = new Pessoa(nome,sobrenome);
		
		System.out.println(pessoa.nomeCompleto());
		
		entrada.close();
	}

}
