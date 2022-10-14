package Ex05;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pedidos {

	private double valor;
	private ArrayList<Integer> listquantidade =  new ArrayList<Integer>();
	private ArrayList<Integer> listcodigo =  new ArrayList<Integer>();
	private ArrayList<Float> listpreco =  new ArrayList<Float>();
	private ArrayList<String> listproduto =  new ArrayList<String>();
	
	

	public Pedidos(ArrayList<Integer> listquantidade, ArrayList<Integer> listcodigo, ArrayList<Float> listpreco,
			ArrayList<String> listproduto) {
		this.listquantidade = listquantidade;
		this.listcodigo = listcodigo;
		this.listpreco = listpreco;
		this.listproduto = listproduto;
	}

	public Array valorItem() {
		
		return null;
		
	}
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public ArrayList<Integer> getListquantidade() {
		return listquantidade;
	}

	public void setListquantidade(ArrayList<Integer> listquantidade) {
		this.listquantidade = listquantidade;
	}

	public ArrayList<Integer> getListcodigo() {
		return listcodigo;
	}

	public void setListcodigo(ArrayList<Integer> listcodigo) {
		this.listcodigo = listcodigo;
	}

	public ArrayList<Integer> getListtotal() {
		return listtotal;
	}

	public void setListtotal(ArrayList<Integer> listtotal) {
		this.listtotal = listtotal;
	}
	
	
	
	
}
