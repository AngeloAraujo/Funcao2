package Ex01;

public class Pessoa {

	private String nome;
	private String sobrenome;
	
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		if(nome.length()> 0) 
			this.nome = nome;
		
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		if (sobrenome.length()>0)
			this.sobrenome = sobrenome;
	}
	
	
	public StringBuilder nomeCompleto() {
		StringBuilder nome = new StringBuilder();
		
		nome.append("Seu nome completo é: ");
		nome.append(getNome());
		nome.append(" ");
		nome.append(getSobrenome());
		
		return nome;
		
	}	
}
