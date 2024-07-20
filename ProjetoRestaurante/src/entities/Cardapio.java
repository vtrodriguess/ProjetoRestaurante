package entities;

public class Cardapio {
	
	private String nome;
	private Double preco;
	
	public Cardapio() {
		
	}

	public Cardapio(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		StringBuilder a = new StringBuilder(); 
		
		a.append(nome);
		
		return a.toString();
	}
	
	
	

}
