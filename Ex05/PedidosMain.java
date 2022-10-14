package Ex05;

import java.util.ArrayList;
import java.util.Scanner;

public class PedidosMain {

	public static void main(String[] args) {

		Scanner entrada= new Scanner (System.in);
		
	String finalizar;	
	
	Pedidos a = new Pedidos(null, null, null, null);
	ArrayList<Integer> quantidade =  new ArrayList<Integer>();
	ArrayList<Integer> codigo =  new ArrayList<Integer>();
	
	do {
		System.out.println("Insira o código do produto: ");
		int valorcod = entrada.nextInt();
		System.out.println("Insira q quantidade do produto: ");
		int valorquantidade= entrada.nextInt();
		
		codigo.add(valorcod);
		quantidade.add(valorquantidade);
		System.out.println("Deseja continuar o pedido? (S/N) ");
		finalizar= entrada.nextLine();
		
	}while(!finalizar.equalsIgnoreCase("S"));
	
	}

}
